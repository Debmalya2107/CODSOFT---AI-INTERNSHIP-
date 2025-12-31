// Mario & Luigi Gaming Universe - Main JavaScript

// Initialize AOS (Animate On Scroll)
document.addEventListener('DOMContentLoaded', function() {
    AOS.init({
        duration: 800,
        easing: 'ease-in-out',
        once: true,
        offset: 100
    });
    
    // Initialize other features
    initSmoothScroll();
    initNavbarEffects();
    initGalleryPreview();
    initCharacterAnimations();
    initGamePreloader();
});

// ===== SMOOTH SCROLLING =====
function initSmoothScroll() {
    const links = document.querySelectorAll('a[href^="#"]');
    
    links.forEach(link => {
        link.addEventListener('click', function(e) {
            e.preventDefault();
            
            const targetId = this.getAttribute('href').substring(1);
            const targetElement = document.getElementById(targetId);
            
            if (targetElement) {
                targetElement.scrollIntoView({
                    behavior: 'smooth',
                    block: 'start'
                });
            }
        });
    });
}

// ===== NAVBAR EFFECTS =====
function initNavbarEffects() {
    const navbar = document.querySelector('.navbar');
    
    window.addEventListener('scroll', function() {
        if (window.scrollY > 50) {
            navbar.classList.add('scrolled');
        } else {
            navbar.classList.remove('scrolled');
        }
    });
    
    // Add scrolled class styling
    const style = document.createElement('style');
    style.textContent = `
        .navbar.scrolled {
            background-color: rgba(28, 28, 28, 0.95) !important;
            backdrop-filter: blur(10px);
            box-shadow: 0 2px 20px rgba(0,0,0,0.1);
        }
    `;
    document.head.appendChild(style);
}

// ===== GALLERY PREVIEW =====
function initGalleryPreview() {
    const galleryImages = document.querySelectorAll('.gallery-preview');
    
    galleryImages.forEach(img => {
        img.addEventListener('click', function() {
            // Create lightbox effect
            createLightbox(this.src, this.alt);
        });
    });
}

function createLightbox(src, alt) {
    // Create lightbox overlay
    const lightbox = document.createElement('div');
    lightbox.className = 'lightbox-overlay';
    lightbox.style.cssText = `
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: rgba(0,0,0,0.9);
        display: flex;
        justify-content: center;
        align-items: center;
        z-index: 9999;
        cursor: pointer;
    `;
    
    // Create image
    const img = document.createElement('img');
    img.src = src;
    img.alt = alt;
    img.style.cssText = `
        max-width: 90%;
        max-height: 90%;
        border-radius: 10px;
        box-shadow: 0 10px 30px rgba(0,0,0,0.5);
    `;
    
    // Create close button
    const closeBtn = document.createElement('button');
    closeBtn.innerHTML = '×';
    closeBtn.style.cssText = `
        position: absolute;
        top: 20px;
        right: 20px;
        background: rgba(255,255,255,0.2);
        border: none;
        color: white;
        font-size: 2rem;
        cursor: pointer;
        border-radius: 50%;
        width: 50px;
        height: 50px;
        display: flex;
        align-items: center;
        justify-content: center;
    `;
    
    lightbox.appendChild(img);
    lightbox.appendChild(closeBtn);
    document.body.appendChild(lightbox);
    
    // Close lightbox on click
    lightbox.addEventListener('click', function() {
        document.body.removeChild(lightbox);
    });
    
    closeBtn.addEventListener('click', function(e) {
        e.stopPropagation();
        document.body.removeChild(lightbox);
    });
}

// ===== CHARACTER ANIMATIONS =====
function initCharacterAnimations() {
    const characterCards = document.querySelectorAll('.character-card');
    
    characterCards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-10px) rotateY(5deg)';
        });
        
        card.addEventListener('mouseleave', function() {
            this.style.transform = 'translateY(0) rotateY(0)';
        });
    });
}

// ===== GAME PRELOADER =====
function initGamePreloader() {
    const gameLink = document.querySelector('a[href="game.html"]');
    
    if (gameLink) {
        gameLink.addEventListener('click', function(e) {
            e.preventDefault();
            
            // Show loading animation
            showLoadingAnimation();
            
            // Load game page after delay
            setTimeout(() => {
                window.location.href = 'game.html';
            }, 1500);
        });
    }
}

function showLoadingAnimation() {
    const loader = document.createElement('div');
    loader.id = 'gameLoader';
    loader.innerHTML = `
        <div style="position: fixed; top: 0; left: 0; width: 100%; height: 100%; background: linear-gradient(135deg, #E52521 0%, #3CB043 100%); display: flex; flex-direction: column; justify-content: center; align-items: center; z-index: 10000;">
            <div style="font-family: 'Press Start 2P', cursive; color: white; font-size: 2rem; margin-bottom: 30px;">LOADING GAME</div>
            <div class="mario-loader">
                <div style="width: 60px; height: 60px; background: #E52521; border-radius: 50%; position: relative; animation: marioJump 1s infinite;">
                    <div style="position: absolute; top: 10px; left: 15px; width: 8px; height: 8px; background: white; border-radius: 50%;"></div>
                    <div style="position: absolute; top: 10px; right: 15px; width: 8px; height: 8px; background: white; border-radius: 50%;"></div>
                </div>
            </div>
            <div style="color: white; margin-top: 20px; font-family: 'Press Start 2P', cursive; font-size: 0.8rem;">Preparing your adventure...</div>
        </div>
        <style>
            @keyframes marioJump {
                0%, 100% { transform: translateY(0); }
                50% { transform: translateY(-20px); }
            }
        </style>
    `;
    
    document.body.appendChild(loader);
}

// ===== UTILITY FUNCTIONS =====
function playSound(soundId) {
    const sound = document.getElementById(soundId);
    if (sound) {
        sound.currentTime = 0;
        sound.play();
    }
}

function showNotification(message, type = 'success') {
    const notification = document.createElement('div');
    notification.className = `notification notification-${type}`;
    notification.textContent = message;
    notification.style.cssText = `
        position: fixed;
        top: 20px;
        right: 20px;
        padding: 15px 20px;
        background: ${type === 'success' ? '#3CB043' : '#E52521'};
        color: white;
        border-radius: 8px;
        box-shadow: 0 4px 15px rgba(0,0,0,0.2);
        z-index: 10000;
        animation: slideInRight 0.3s ease;
    `;
    
    document.body.appendChild(notification);
    
    setTimeout(() => {
        notification.style.animation = 'slideOutRight 0.3s ease';
        setTimeout(() => {
            document.body.removeChild(notification);
        }, 300);
    }, 3000);
}

// ===== LOCAL STORAGE HELPERS =====
function saveToLocalStorage(key, data) {
    try {
        localStorage.setItem(key, JSON.stringify(data));
        return true;
    } catch (error) {
        console.error('Error saving to localStorage:', error);
        return false;
    }
}

function loadFromLocalStorage(key) {
    try {
        const data = localStorage.getItem(key);
        return data ? JSON.parse(data) : null;
    } catch (error) {
        console.error('Error loading from localStorage:', error);
        return null;
    }
}

// ===== FORM VALIDATION =====
function validateEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

function validateForm(formId) {
    const form = document.getElementById(formId);
    if (!form) return false;
    
    const inputs = form.querySelectorAll('input[required], textarea[required]');
    let isValid = true;
    
    inputs.forEach(input => {
        if (!input.value.trim()) {
            isValid = false;
            input.classList.add('is-invalid');
        } else {
            input.classList.remove('is-invalid');
        }
        
        // Special validation for email
        if (input.type === 'email' && input.value.trim()) {
            if (!validateEmail(input.value.trim())) {
                isValid = false;
                input.classList.add('is-invalid');
            }
        }
    });
    
    return isValid;
}

// ===== PARTICLE EFFECTS =====
function createParticleEffect(x, y, color = '#F8D210') {
    const particle = document.createElement('div');
    particle.style.cssText = `
        position: fixed;
        left: ${x}px;
        top: ${y}px;
        width: 10px;
        height: 10px;
        background: ${color};
        border-radius: 50%;
        pointer-events: none;
        z-index: 9999;
        animation: particleFade 1s ease-out forwards;
    `;
    
    document.body.appendChild(particle);
    
    setTimeout(() => {
        document.body.removeChild(particle);
    }, 1000);
}

// Add particle animation
const particleStyle = document.createElement('style');
particleStyle.textContent = `
    @keyframes particleFade {
        0% {
            transform: scale(1) translateY(0);
            opacity: 1;
        }
        100% {
            transform: scale(0) translateY(-50px);
            opacity: 0;
        }
    }
    
    @keyframes slideInRight {
        from {
            transform: translateX(100%);
            opacity: 0;
        }
        to {
            transform: translateX(0);
            opacity: 1;
        }
    }
    
    @keyframes slideOutRight {
        from {
            transform: translateX(0);
            opacity: 1;
        }
        to {
            transform: translateX(100%);
            opacity: 0;
        }
    }
`;
document.head.appendChild(particleStyle);

// ===== MOUSE TRAIL EFFECT =====
let mouseTrailEnabled = false;

function toggleMouseTrail() {
    mouseTrailEnabled = !mouseTrailEnabled;
    
    if (mouseTrailEnabled) {
        document.addEventListener('mousemove', createMouseTrail);
    } else {
        document.removeEventListener('mousemove', createMouseTrail);
    }
}

function createMouseTrail(e) {
    if (!mouseTrailEnabled) return;
    
    const trail = document.createElement('div');
    trail.style.cssText = `
        position: fixed;
        left: ${e.clientX}px;
        top: ${e.clientY}px;
        width: 5px;
        height: 5px;
        background: linear-gradient(135deg, #E52521, #3CB043);
        border-radius: 50%;
        pointer-events: none;
        z-index: 9998;
        animation: trailFade 0.5s ease-out forwards;
    `;
    
    document.body.appendChild(trail);
    
    setTimeout(() => {
        document.body.removeChild(trail);
    }, 500);
}

// Add trail animation
const trailStyle = document.createElement('style');
trailStyle.textContent = `
    @keyframes trailFade {
        0% {
            transform: scale(1);
            opacity: 1;
        }
        100% {
            transform: scale(0);
            opacity: 0;
        }
    }
`;
document.head.appendChild(trailStyle);

// ===== KEYBOARD SHORTCUTS =====
document.addEventListener('keydown', function(e) {
    // Press 'G' to go to game
    if (e.key === 'g' || e.key === 'G') {
        window.location.href = 'game.html';
    }
    
    // Press 'H' to go to home
    if (e.key === 'h' || e.key === 'H') {
        window.location.href = 'index.html';
    }
    
    // Press 'L' to toggle mouse trail
    if (e.key === 'l' || e.key === 'L') {
        toggleMouseTrail();
        showNotification('Mouse trail ' + (mouseTrailEnabled ? 'enabled' : 'disabled'));
    }
});

// ===== PERFORMANCE MONITORING =====
function logPerformance() {
    if ('performance' in window) {
        const loadTime = performance.timing.loadEventEnd - performance.timing.navigationStart;
        console.log(`Page load time: ${loadTime}ms`);
    }
}

// Log performance when page loads
window.addEventListener('load', logPerformance);

// ===== ERROR HANDLING =====
window.addEventListener('error', function(e) {
    console.error('JavaScript error:', e.error);
    showNotification('An error occurred. Please refresh the page.', 'error');
});

// Export functions for use in other scripts
window.MarioLuigiGame = {
    playSound,
    showNotification,
    saveToLocalStorage,
    loadFromLocalStorage,
    validateForm,
    createParticleEffect,
    toggleMouseTrail
};