import os
import shutil

# Take folder paths from user
source = input("Enter source folder path: ")
destination = input("Enter destination folder path: ")

# Create destination folder if it doesn't exist
if not os.path.exists(destination):
    os.makedirs(destination)

count = 0

# Define image and video extensions
media_extensions = (
    ".jpg", ".jpeg", ".png", ".gif", ".bmp", ".tiff",  # images
    ".mp4", ".mkv", ".avi", ".mov", ".wmv", ".flv", ".webm"  # videos
)

# Walk through all subfolders
for root, dirs, files in os.walk(source):
    for file in files:
        if file.lower().endswith(media_extensions):
            source_file = os.path.join(root, file)
            # Handle duplicate filenames by adding a number suffix
            dest_file = os.path.join(destination, file)
            base, ext = os.path.splitext(file)
            counter = 1
            while os.path.exists(dest_file):
                dest_file = os.path.join(destination, f"{base}_{counter}{ext}")
                counter += 1

            shutil.move(source_file, dest_file)
            count += 1

print(f"{count} media files (images & videos) moved successfully from all subfolders!")
