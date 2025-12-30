import os
import pickle
import numpy as np
from flask import Flask, request, render_template
from tensorflow.keras.models import load_model
from tensorflow.keras.preprocessing.sequence import pad_sequences
from tensorflow.keras.applications.vgg16 import VGG16, preprocess_input
from tensorflow.keras.preprocessing.image import load_img, img_to_array
from tensorflow.keras.models import Model

# Initialize Flask App
app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = 'static/uploads'

# Ensure upload folder exists
os.makedirs(app.config['UPLOAD_FOLDER'], exist_ok=True)

# --- 1. LOAD THE VGG16 MODEL (The "Eye") ---
# We use this to extract features from the image before passing them to our AI.
print("Loading VGG16 Feature Extractor...")
vgg_model = VGG16()
# Remove the last layer (classification) because we only want the features
vgg_model = Model(inputs=vgg_model.inputs, outputs=vgg_model.layers[-2].output)

# --- 2. LOAD YOUR TRAINED AI (The "Brain") ---
print("Loading your trained Captioning Model...")
# We use compile=False because we only need to predict, not train further.
# This avoids some compatibility errors with custom optimizers.
model = load_model('best_model.keras', compile=False)

# --- 3. LOAD THE TOKENIZER (The "Dictionary") ---
print("Loading Tokenizer...")
with open('tokenizer.pkl', 'rb') as handle:
    tokenizer = pickle.load(handle)

# Set the max length of captions (Must match what we used in training)
MAX_LENGTH = 32

def generate_caption(image_path):
    """
    Step-by-step process to generate a caption for a new image.
    """
    # Step A: Process the image
    img = load_img(image_path, target_size=(224, 224))
    img = img_to_array(img)
    img = img.reshape((1, img.shape[0], img.shape[1], img.shape[2]))
    img = preprocess_input(img)
    
    # Step B: Extract features using VGG16
    feature = vgg_model.predict(img, verbose=0)

    # Step C: Generate Caption Word-by-Word
    in_text = 'startseq'
    for i in range(MAX_LENGTH):
        # Encode the current sequence
        sequence = tokenizer.texts_to_sequences([in_text])[0]
        sequence = pad_sequences([sequence], maxlen=MAX_LENGTH)
        
        # Predict the next word
        yhat = model.predict([feature, sequence], verbose=0)
        yhat = np.argmax(yhat)
        
        # Map integer to word
        word = tokenizer.index_word.get(yhat)
        
        # Stop if word is not found or end tag is reached
        if word is None:
            break
        
        in_text += " " + word
        
        if word == 'endseq':
            break
            
    # Clean up the final sentence
    final_caption = in_text.replace('startseq', '').replace('endseq', '').strip()
    return final_caption

# --- WEBSITE ROUTES ---
@app.route('/', methods=['GET', 'POST'])
def index():
    caption = ""
    image_url = None
    
    if request.method == 'POST':
        if 'image' not in request.files:
            return render_template('index.html', error="No file uploaded")
        
        file = request.files['image']
        if file.filename == '':
            return render_template('index.html', error="No file selected")
            
        if file:
            filename = file.filename
            filepath = os.path.join(app.config['UPLOAD_FOLDER'], filename)
            file.save(filepath)
            
            # Run the AI!
            try:
                caption = generate_caption(filepath)
                image_url = filepath
            except Exception as e:
                print(f"Error: {e}")
                caption = "Sorry, something went wrong while processing the image."

    return render_template('index.html', caption=caption, image_url=image_url)

if __name__ == '__main__':
    # Run the app locally on port 5000
    app.run(debug=True, port=5000)