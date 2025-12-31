import os
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse

# URL of the page you want to download
url = "https://www.supreme.co.in/pipe"

# Folder to save everything
save_folder = "offline_page"
os.makedirs(save_folder, exist_ok=True)

# Helper function to download a file
def download_file(file_url, folder):
    try:
        parsed_url = urlparse(file_url)
        filename = os.path.basename(parsed_url.path)
        if not filename:
            filename = "file"
        local_path = os.path.join(folder, filename)
        
        # Skip if already downloaded
        if not os.path.exists(local_path):
            r = requests.get(file_url)
            with open(local_path, "wb") as f:
                f.write(r.content)
            print(f"Downloaded: {filename}")
        return filename
    except Exception as e:
        print(f"Failed to download {file_url}: {e}")
        return None

# Download HTML content
response = requests.get(url)
html_content = response.text
soup = BeautifulSoup(html_content, "html.parser")

# Download CSS files and update HTML
for css in soup.find_all("link", {"rel": "stylesheet"}):
    css_url = urljoin(url, css.get("href"))
    filename = download_file(css_url, save_folder)
    if filename:
        css['href'] = filename

# Download JS files and update HTML
for js in soup.find_all("script", {"src": True}):
    js_url = urljoin(url, js.get("src"))
    filename = download_file(js_url, save_folder)
    if filename:
        js['src'] = filename

# Download images and update HTML
for img in soup.find_all("img", {"src": True}):
    img_url = urljoin(url, img.get("src"))
    filename = download_file(img_url, save_folder)
    if filename:
        img['src'] = filename

# Save modified HTML
html_file_path = os.path.join(save_folder, "index.html")
with open(html_file_path, "w", encoding="utf-8") as f:
    f.write(str(soup))

print(f"Page saved offline at: {html_file_path}")
