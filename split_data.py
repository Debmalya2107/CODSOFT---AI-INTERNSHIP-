import pickle
import os
import zipfile

# 1. Unzip the current file to get the big .pkl back
if os.path.exists('similarity.zip'):
    print("Unzipping similarity.zip...")
    with zipfile.ZipFile('similarity.zip', 'r') as zip_ref:
        zip_ref.extractall('.')
    # Remove the zip since we don't need it anymore
    os.remove('similarity.zip')

# 2. Split the 'similarity.pkl' into two parts
chunk_size = 90 * 1024 * 1024  # 90 MB chunks (safe for GitHub)
file_name = 'similarity.pkl'

if os.path.exists(file_name):
    print("Splitting similarity.pkl into parts...")
    with open(file_name, 'rb') as f:
        part_num = 1
        while True:
            chunk = f.read(chunk_size)
            if not chunk:
                break
            part_name = f"similarity_part_{part_num}.pkl"
            with open(part_name, 'wb') as chunk_file:
                chunk_file.write(chunk)
            print(f"Created {part_name}")
            part_num += 1
    
    # Remove the original big file
    os.remove(file_name)
    print("✅ Done! Big file removed. You now have smaller parts.")
else:
    print("❌ Error: similarity.pkl not found!")