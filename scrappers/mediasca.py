import os
import re
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse
from collections import deque

# --- SETTINGS ---
MAX_PAGES = 500        # safety limit for large sites (increase if needed)
TIMEOUT = 10           # seconds per request

# --- FUNCTIONS ---
def download_file(url, folder):
    try:
        os.makedirs(folder, exist_ok=True)
        filename = os.path.basename(urlparse(url).path)
        if not filename:
            filename = "file_" + str(abs(hash(url))) + ".bin"
        filepath = os.path.join(folder, filename)

        if os.path.exists(filepath):  # skip duplicates
            return

        response = requests.get(url, timeout=TIMEOUT)
        if response.status_code == 200:
            with open(filepath, 'wb') as f:
                f.write(response.content)
            print(f"✅ Downloaded: {url}")
    except Exception as e:
        print(f"⚠️ Skipped {url}: {e}")

def extract_media_links(soup, base_url):
    media_links = []

    # 1️⃣ <img> tags
    for tag in soup.find_all('img', src=True):
        media_links.append(urljoin(base_url, tag['src']))

    # 2️⃣ <video> tags and <source> inside videos
    for tag in soup.find_all(['video', 'source'], src=True):
        media_links.append(urljoin(base_url, tag['src']))

    # 3️⃣ CSS background images
    for tag in soup.find_all(style=True):
        style = tag['style']
        urls = re.findall(r'url\((.*?)\)', style)
        for u in urls:
            u = u.strip('\'"')
            media_links.append(urljoin(base_url, u))

    # 4️⃣ Inline <link> or <meta> that might point to media (optional)
    for tag in soup.find_all(['link', 'meta'], href=True):
        href = tag['href']
        if any(ext in href for ext in ['.jpg', '.png', '.mp4', '.webm', '.jpeg', '.gif']):
            media_links.append(urljoin(base_url, href))

    return media_links

def crawl_website(start_url):
    visited = set()
    queue = deque([start_url])
    domain = urlparse(start_url).netloc

    image_folder = "downloaded_media/images"
    video_folder = "downloaded_media/videos"

    os.makedirs(image_folder, exist_ok=True)
    os.makedirs(video_folder, exist_ok=True)

    page_count = 0

    while queue and page_count < MAX_PAGES:
        url = queue.popleft()
        if url in visited:
            continue

        visited.add(url)
        page_count += 1
        print(f"\n🔍 Crawling: {url}")

        try:
            response = requests.get(url, timeout=TIMEOUT)
            if 'text/html' not in response.headers.get('Content-Type', ''):
                continue
            soup = BeautifulSoup(response.text, 'html.parser')
        except Exception as e:
            print(f"⚠️ Failed to load {url}: {e}")
            continue

        # --- Extract and download media ---
        media_links = extract_media_links(soup, url)
        for link in media_links:
            if any(link.lower().endswith(ext) for ext in ['.jpg', '.jpeg', '.png', '.gif', '.webp']):
                download_file(link, image_folder)
            elif any(link.lower().endswith(ext) for ext in ['.mp4', '.webm', '.avi', '.mov']):
                download_file(link, video_folder)

        # --- Find new links to crawl ---
        for tag in soup.find_all('a', href=True):
            next_url = urljoin(url, tag['href'])
            if urlparse(next_url).netloc == domain and next_url not in visited:
                if next_url.startswith(start_url):
                    queue.append(next_url)

    print("\n✅ Done! All media files downloaded successfully.")
    print(f"📁 Saved to: {os.path.abspath('downloaded_media')}")

# --- MAIN ---
if __name__ == "__main__":
    start_url = input("Enter website URL: ").strip()
    crawl_website(start_url)
