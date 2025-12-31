import pickle
import pandas as pd
import requests
import os
from flask import Flask, render_template, request

app = Flask(__name__)

# --- LOAD DATA (Auto-Join Logic) ---
print("Loading Movie Data...")

# 1. Load the movie list
try:
    movies_dict = pickle.load(open('movie_list.pkl', 'rb'))
    movies = pd.DataFrame(movies_dict)
except FileNotFoundError:
    print("❌ Error: 'movie_list.pkl' not found.")

# 2. Join and Load the similarity matrix
try:
    # Check if we need to rebuild the file from parts
    if not os.path.exists('similarity.pkl'):
        print("Rebuilding similarity matrix from parts...")
        parts = ['similarity_part_1.pkl', 'similarity_part_2.pkl']
        with open('similarity.pkl', 'wb') as output_file:
            for part in parts:
                if os.path.exists(part):
                    with open(part, 'rb') as input_file:
                        output_file.write(input_file.read())
                else:
                    print(f"❌ Missing {part}")
        print("✅ Rebuild complete.")

    similarity = pickle.load(open('similarity.pkl', 'rb'))
    print("✅ Data Loaded Successfully!")
except Exception as e:
    print(f"❌ Error loading similarity matrix: {e}")

def fetch_poster(movie_id):
    try:
        url = "https://api.themoviedb.org/3/movie/{}?api_key=8265bd1679663a7ea12ac168da84d2e8&language=en-US".format(movie_id)
        data = requests.get(url)
        data = data.json()
        poster_path = data['poster_path']
        return "https://image.tmdb.org/t/p/w500/" + poster_path
    except:
        return "https://via.placeholder.com/500x750?text=No+Image"

def recommend(movie):
    try:
        movie_index = movies[movies['title'].str.lower() == movie.lower()].index[0]
        distances = similarity[movie_index]
        similar_movies_indices = sorted(list(enumerate(distances)), reverse=True, key=lambda x: x[1])[1:11]
        
        candidate_movies = []
        for i in similar_movies_indices:
            index = i[0]
            title = movies.iloc[index].title
            movie_id = movies.iloc[index].movie_id
            score = movies.iloc[index].score
            candidate_movies.append({'title': title, 'id': movie_id, 'score': score})
            
        candidate_movies = sorted(candidate_movies, key=lambda x: x['score'], reverse=True)
        
        final_names = []
        final_posters = []
        for item in candidate_movies[:5]:
            final_names.append(item['title'])
            final_posters.append(fetch_poster(item['id']))
            
        return final_names, final_posters
    except IndexError:
        return ["Movie not found"], []

@app.route('/', methods=['GET', 'POST'])
def index():
    recommendations = []
    posters = []
    selected_movie = ""
    movie_list = movies['title'].values
    
    if request.method == 'POST':
        selected_movie = request.form.get('movie_name')
        if selected_movie:
            recommendations, posters = recommend(selected_movie)
    
    if recommendations:
        data = zip(recommendations, posters)
    else:
        data = None

    return render_template('index.html', movie_list=movie_list, data=data, selected_movie=selected_movie)

if __name__ == '__main__':
    app.run(debug=True, port=5000)