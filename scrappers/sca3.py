import os
import requests
from urllib.parse import urljoin, urlparse
from bs4 import BeautifulSoup
from pathlib import Path
import time

# ---------------- Setup ----------------
start_url = input("Enter the main website URL: ").strip()
if not start_url.startswith("http"):
    start_url = "https://" + start_url

base_domain = urlparse(start_url).netloc
root_folder = Path(r"C:\Users\230625\Desktop\scrappers\website_backup")
root_folder.mkdir(parents=True, exist_ok=True)

visited = set()

# ---------------- Helper ----------------
def safe_filename(url):
    """Convert a URL path into a safe local filename"""
    name = urlparse(url).path.strip("/").replace("/", "_")
    return name if name else "index"

def download_file(file_url, folder):
    """Download any file (CSS, JS, IMG, etc.)"""
    try:
        full_url = urljoin(start_url, file_url)
        filename = os.path.basename(urlparse(full_url).path)
        if not filename:
            filename = "file"
        local_path = folder / filename

        r = requests.get(full_url, timeout=10)
        if r.status_code == 200:
            with open(local_path, "wb") as f:
                f.write(r.content)
            return str(local_path.relative_to(root_folder))
    except:
        pass
    return file_url


def scrape_page(url, depth=0, max_depth=3):
    """Recursively download HTML + assets for all internal links"""
    if url in visited or depth > max_depth:
        return
    visited.add(url)

    try:
        print(f"🔗 Fetching: {url}")
        r = requests.get(url, timeout=10)
        if "text/html" not in r.headers.get("Content-Type", ""):
            return  # Skip non-HTML files

        soup = BeautifulSoup(r.text, "html.parser")

        # Create folder for this page
        page_folder = root_folder / "assets"
        page_folder.mkdir(exist_ok=True)

        # --- Download linked resources ---
        for tag, attr in [("img", "src"), ("script", "src"), ("link", "href"), ("video", "src"), ("source", "src")]:
            for element in soup.find_all(tag):
                file_link = element.get(attr)
                if file_link:
                    new_path = download_file(file_link, page_folder)
                    element[attr] = new_path

        # --- Save HTML ---
        filename = safe_filename(url) + ".html"
        html_path = root_folder / filename
        with open(html_path, "w", encoding="utf-8") as f:
            f.write(str(soup))

        # --- Find internal links and recurse ---
        for a in soup.find_all("a", href=True):
            next_url = urljoin(url, a["href"])
            if urlparse(next_url).netloc == base_domain:
                scrape_page(next_url, depth + 1, max_depth)

    except Exception as e:
        print(f"⚠️ Skipping {url}: {e}")


# ---------------- Run ----------------
print("\n🌍 Starting full site download...\n")
scrape_page(start_url)
print("\n✅ Full website downloaded to:", root_folder)
