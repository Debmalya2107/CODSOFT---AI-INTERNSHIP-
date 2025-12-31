import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse
import re

visited = set()
all_text = ""

def clean_text(raw_html):
    """Remove scripts, styles, and binary junk"""
    soup = BeautifulSoup(raw_html, "html.parser")

    for tag in soup(["script", "style", "noscript", "svg", "meta", "link"]):
        tag.extract()

    text = soup.get_text(separator='\n')

    # Keep only readable characters (English, common Unicode)
    text = re.sub(r'[^\x20-\x7E\u0900-\u097F\n]+', '', text)
    text = re.sub(r'\n+', '\n', text).strip()

    return text


def scrape_text(url, base_domain, depth=0, max_depth=3):
    """Recursively scrape all pages within the same domain"""
    global all_text
    if url in visited or depth > max_depth:
        return
    visited.add(url)

    try:
        response = requests.get(url, timeout=10)
        if "text/html" not in response.headers.get("Content-Type", ""):
            return  # Skip non-HTML pages

        response.encoding = "utf-8"
        clean = clean_text(response.text)
        all_text += f"\n\n--- PAGE: {url} ---\n\n{clean}\n"

        print(f"✅ Scraped: {url}")

        soup = BeautifulSoup(response.text, "html.parser")
        for link in soup.find_all("a", href=True):
            next_url = urljoin(url, link["href"])
            if urlparse(next_url).netloc == base_domain:
                scrape_text(next_url, base_domain, depth + 1)

    except Exception as e:
        print(f"⚠️ Skipping {url}: {e}")


if __name__ == "__main__":
    start_url = input("Enter the main website URL: ").strip()
    if not start_url.startswith("http"):
        start_url = "https://" + start_url

    base_domain = urlparse(start_url).netloc

    print("\n🔍 Starting full website text extraction...\n")
    scrape_text(start_url, base_domain)

    with open("full_clean_text.txt", "w", encoding="utf-8") as f:
        f.write(all_text)

    print("\n✅ All clean, readable text saved as 'full_clean_text.txt'")
