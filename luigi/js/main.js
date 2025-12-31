/**
 * Luigi & Mario Gaming Website
 * Main JavaScript File
 * Global utilities and initialization
 */

// Initialize AOS (Animate On Scroll) Library
document.addEventListener('DOMContentLoaded', function() {
    // Initialize AOS with custom settings
    AOS.init({
        duration: 800,
        easing: 'ease-in-out',
        once: true,
        offset: 100,
        delay: 50
    });

    // Add navbar scroll effect
    initNavbarScroll();

    // Animate stat bars on character page
    animateStatBars();

    // Add smooth scroll for all anchor links
    initSmoothScroll();

    // Console greeting
    console.log('%c🍄 Welcome to Luigi & Mario Gaming! 🍄', 'font-size: 20px; color: #3CB043; font-weight: bold;');
    console.log('%c🎮 Ready to play? Jump into the adventure! 🎮', 'font-size: 14px; color: #E52521;');
});

/**
 * Navbar scroll effect
 * Adds shadow and changes styling when user scrolls
 */
function initNavbarScroll() {
    const navbar = document.querySelector('.navbar');
    
    if (!navbar) return;

    window.addEventListener('scroll', function() {
        if (window.scrollY > 50) {
            navbar.style.boxShadow = '0 6px 20px rgba(0, 0, 0, 0.3)';
            navbar.style.padding = '0.5rem 0';
        } else {
            navbar.style.boxShadow = '0 4px 12px rgba(0, 0, 0, 0.15)';
            navbar.style.padding = '1rem 0';
        }
    });
}

/**
 * Animate character stat bars
 * Fills stat bars with animation when they come into view
 */
function animateStatBars() {
    const statFills = document.querySelectorAll('.stat-fill');
    
    if (statFills.length === 0) return;

    // Create intersection observer
    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                const fill = entry.target;
                const targetWidth = fill.style.width;
                fill.style.width = '0%';
                
                setTimeout(() => {
                    fill.style.width = targetWidth;
                }, 100);
                
                observer.unobserve(fill);
            }
        });
    }, { threshold: 0.5 });

    statFills.forEach(fill => observer.observe(fill));
}

/**
 * Smooth scroll for anchor links
 */
function initSmoothScroll() {
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function(e) {
            const href = this.getAttribute('href');
            
            // Skip if it's just '#' or empty
            if (href === '#' || href === '') return;
            
            const target = document.querySelector(href);
            
            if (target) {
                e.preventDefault();
                target.scrollIntoView({
                    behavior: 'smooth',
                    block: 'start'
                });
            }
        });
    });
}

/**
 * Utility: Format number with commas
 * @param {number} num - The number to format
 * @returns {string} Formatted number string
 */
function formatNumber(num) {
    return num.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

/**
 * Utility: Get current date formatted
 * @returns {string} Formatted date string
 */
function getCurrentDate() {
    const date = new Date();
    const options = { year: 'numeric', month: 'short', day: 'numeric' };
    return date.toLocaleDateString('en-US', options);
}

/**
 * Utility: Show notification
 * @param {string} message - Message to display
 * @param {string} type - Type of notification ('success', 'error', 'info')
 */
function showNotification(message, type = 'info') {
    // Create notification element
    const notification = document.createElement('div');
    notification.className = `notification notification-${type}`;
    notification.style.cssText = `
        position: fixed;
        top: 100px;
        right: 20px;
        padding: 1rem 1.5rem;
        background: ${type === 'success' ? '#3CB043' : type === 'error' ? '#E52521' : '#F8D210'};
        color: white;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
        z-index: 10000;
        animation: slideInRight 0.3s ease;
        font-weight: 600;
    `;
    notification.textContent = message;

    document.body.appendChild(notification);

    // Remove after 3 seconds
    setTimeout(() => {
        notification.style.animation = 'slideOutRight 0.3s ease';
        setTimeout(() => {
            notification.remove();
        }, 300);
    }, 3000);
}

/**
 * Utility: Validate email format
 * @param {string} email - Email to validate
 * @returns {boolean} True if valid email
 */
function isValidEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

/**
 * Utility: Generate random number between min and max
 * @param {number} min - Minimum value
 * @param {number} max - Maximum value
 * @returns {number} Random number
 */
function randomRange(min, max) {
    return Math.random() * (max - min) + min;
}

/**
 * Utility: Generate random integer between min and max (inclusive)
 * @param {number} min - Minimum value
 * @param {number} max - Maximum value
 * @returns {number} Random integer
 */
function randomInt(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

/**
 * Utility: Check if two rectangles collide
 * @param {object} rect1 - First rectangle {x, y, width, height}
 * @param {object} rect2 - Second rectangle {x, y, width, height}
 * @returns {boolean} True if collision detected
 */
function checkCollision(rect1, rect2) {
    return rect1.x < rect2.x + rect2.width &&
           rect1.x + rect1.width > rect2.x &&
           rect1.y < rect2.y + rect2.height &&
           rect1.y + rect1.height > rect2.y;
}

/**
 * Add CSS animations dynamically
 */
const style = document.createElement('style');
style.textContent = `
    @keyframes slideInRight {
        from {
            transform: translateX(400px);
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
            transform: translateX(400px);
            opacity: 0;
        }
    }

    @keyframes pulse {
        0%, 100% {
            transform: scale(1);
        }
        50% {
            transform: scale(1.05);
        }
    }
`;
document.head.appendChild(style);

// Export utilities for use in other scripts
window.GameUtils = {
    formatNumber,
    getCurrentDate,
    showNotification,
    isValidEmail,
    randomRange,
    randomInt,
    checkCollision
};
