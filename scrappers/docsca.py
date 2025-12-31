import os
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse
from pathlib import Path

# ---------- Setup ----------
start_url = input("Enter the main website URL: ").strip()
if not start_url.startswith("http"):
    start_url = "https://" + start_url

base_domain = urlparse(start_url).netloc
download_folder = Path(r"C:\Users\230625\Desktop\scrappers\docs_downloaded")
download_folder.mkdir(parents=True, exist_ok=True)

visited = set()
found_docs = 0

# ---------- Allowed document extensions ----------
doc_extensions = [
    ".pdf", ".doc", ".docx", ".xls", ".xlsx",
    ".ppt", ".pptx", ".txt", ".csv", ".odt",
    ".ods", ".odp", ".rtf"
]

# ---------- Helper functions ----------
def is_document(url):
    return any(url.lower().endswith(ext) for ext in doc_extensions)

def download_file(file_url):
    """Download document file if not already saved"""
    global found_docs
    try:
        filename = os.path.basename(urlparse(file_url).path)
        if not filename:
            return
        local_path = download_folder / filename

        # Skip if already downloaded
        if local_path.exists():
            return

        print(f"📥 Downloading: {filename}")
        r = requests.get(file_url, timeout=15)
        if r.status_code == 200 and r.content:
            with open(local_path, "wb") as f:
                f.write(r.content)
            found_docs += 1
    except Exception as e:
        print(f"⚠️ Failed to download {file_url}: {e}")

def scrape_page(url, depth=0, max_depth=3):
    """Recursively explore all sublinks within the same domain"""
    if url in visited or depth > max_depth:
        return
    visited.add(url)

    try:
        print(f"🔗 Visiting: {url}")
        response = requests.get(url, timeout=10)
        if "text/html" not in response.headers.get("Content-Type", ""):
            return

        soup = BeautifulSoup(response.text, "html.parser")

        # --- Find all links ---
        for a in soup.find_all("a", href=True):
            link = urljoin(url, a["href"])
            parsed = urlparse(link)

            # Skip external links
            if parsed.netloc != base_domain:
                continue

            # Check if it's a document
            if is_document(link):
                download_file(link)
            else:
                # Recurse deeper for normal pages
                scrape_page(link, depth + 1, max_depth)

    except Exception as e:
        print(f"⚠️ Error visiting {url}: {e}")


# ---------- Run ----------
print("\n🌍 Starting document scraper...\n")
scrape_page(start_url)

print(f"\n✅ Completed! {found_docs} documents downloaded to: {download_folder}")
