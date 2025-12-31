/**
 * Luigi & Mario Gaming Website
 * Leaderboard Management System
 * Handles score storage, retrieval, and display using localStorage
 */

// Constants
const LEADERBOARD_KEY = 'mario_luigi_leaderboard';
const MAX_LEADERBOARD_ENTRIES = 10;

/**
 * Initialize leaderboard on page load
 */
document.addEventListener('DOMContentLoaded', function() {
    loadLeaderboard();
    setupEventListeners();
});

/**
 * Setup event listeners for leaderboard interactions
 */
function setupEventListeners() {
    // Clear leaderboard button
    const clearBtn = document.getElementById('clearLeaderboardBtn');
    if (clearBtn) {
        clearBtn.addEventListener('click', clearLeaderboard);
    }

    // Save score button (in modal)
    const saveBtn = document.getElementById('saveScoreBtn');
    if (saveBtn) {
        saveBtn.addEventListener('click', handleSaveScore);
    }

    // Allow Enter key to save score
    const playerInput = document.getElementById('playerNameInput');
    if (playerInput) {
        playerInput.addEventListener('keypress', function(e) {
            if (e.key === 'Enter') {
                handleSaveScore();
            }
        });
    }
}

/**
 * Load and display leaderboard from localStorage
 */
function loadLeaderboard() {
    const leaderboardBody = document.getElementById('leaderboardBody');
    
    if (!leaderboardBody) return;

    const scores = getLeaderboardData();

    // Clear existing content
    leaderboardBody.innerHTML = '';

    // Display scores or empty message
    if (scores.length === 0) {
        leaderboardBody.innerHTML = `
            <tr>
                <td colspan="4" class="text-center text-muted py-5">
                    <i class="fas fa-info-circle fa-2x mb-3 d-block"></i>
                    <p class="mb-0">No scores yet. Be the first to play and make it to the leaderboard!</p>
                </td>
            </tr>
        `;
        return;
    }

    // Display each score entry
    scores.forEach((entry, index) => {
        const row = createLeaderboardRow(entry, index + 1);
        leaderboardBody.appendChild(row);
    });
}

/**
 * Create a leaderboard table row
 * @param {object} entry - Score entry {name, score, date}
 * @param {number} rank - Player's rank
 * @returns {HTMLElement} Table row element
 */
function createLeaderboardRow(entry, rank) {
    const row = document.createElement('tr');
    
    // Add special styling for top 3
    if (rank <= 3) {
        row.style.fontWeight = 'bold';
    }

    // Rank with medal for top 3
    const rankCell = document.createElement('td');
    rankCell.innerHTML = `
        <span class="rank-medal">
            ${rank === 1 ? '🥇' : rank === 2 ? '🥈' : rank === 3 ? '🥉' : rank}
        </span>
    `;
    row.appendChild(rankCell);

    // Player name
    const nameCell = document.createElement('td');
    nameCell.textContent = entry.name || 'Anonymous';
    row.appendChild(nameCell);

    // Score
    const scoreCell = document.createElement('td');
    scoreCell.innerHTML = `<strong>${window.GameUtils ? window.GameUtils.formatNumber(entry.score) : entry.score}</strong>`;
    row.appendChild(scoreCell);

    // Date
    const dateCell = document.createElement('td');
    dateCell.textContent = entry.date;
    dateCell.style.fontSize = '0.9rem';
    dateCell.style.color = '#6C757D';
    row.appendChild(dateCell);

    return row;
}

/**
 * Get leaderboard data from localStorage
 * @returns {Array} Array of score entries sorted by score (highest first)
 */
function getLeaderboardData() {
    try {
        const data = localStorage.getItem(LEADERBOARD_KEY);
        if (!data) return [];
        
        const scores = JSON.parse(data);
        
        // Sort by score (highest first)
        scores.sort((a, b) => b.score - a.score);
        
        // Return top entries only
        return scores.slice(0, MAX_LEADERBOARD_ENTRIES);
    } catch (error) {
        console.error('Error loading leaderboard:', error);
        return [];
    }
}

/**
 * Save leaderboard data to localStorage
 * @param {Array} scores - Array of score entries
 */
function saveLeaderboardData(scores) {
    try {
        localStorage.setItem(LEADERBOARD_KEY, JSON.stringify(scores));
    } catch (error) {
        console.error('Error saving leaderboard:', error);
    }
}

/**
 * Add a new score to the leaderboard
 * @param {string} name - Player name
 * @param {number} score - Player score
 * @returns {boolean} True if score was added to leaderboard
 */
function addScore(name, score) {
    // Validate inputs
    if (!name || name.trim() === '') {
        name = 'Anonymous';
    }
    
    if (typeof score !== 'number' || score < 0) {
        console.error('Invalid score:', score);
        return false;
    }

    // Get current leaderboard
    const scores = getLeaderboardData();

    // Create new entry
    const newEntry = {
        name: name.trim().substring(0, 20), // Limit name length
        score: score,
        date: new Date().toLocaleDateString('en-US', { 
            year: 'numeric', 
            month: 'short', 
            day: 'numeric' 
        }),
        timestamp: Date.now()
    };

    // Add to array
    scores.push(newEntry);

    // Sort by score (highest first)
    scores.sort((a, b) => b.score - a.score);

    // Keep only top entries
    const topScores = scores.slice(0, MAX_LEADERBOARD_ENTRIES);

    // Save to localStorage
    saveLeaderboardData(topScores);

    return true;
}

/**
 * Check if a score qualifies for the leaderboard
 * @param {number} score - Score to check
 * @returns {boolean} True if score qualifies
 */
function isHighScore(score) {
    const scores = getLeaderboardData();
    
    // If leaderboard isn't full, any score qualifies
    if (scores.length < MAX_LEADERBOARD_ENTRIES) {
        return true;
    }

    // Check if score beats the lowest score on leaderboard
    const lowestScore = scores[scores.length - 1].score;
    return score > lowestScore;
}

/**
 * Clear all scores from leaderboard
 */
function clearLeaderboard() {
    // Confirm before clearing
    const confirmed = confirm('Are you sure you want to clear the entire leaderboard? This action cannot be undone!');
    
    if (!confirmed) return;

    try {
        localStorage.removeItem(LEADERBOARD_KEY);
        loadLeaderboard();
        
        // Show notification
        if (window.GameUtils && window.GameUtils.showNotification) {
            window.GameUtils.showNotification('Leaderboard cleared!', 'success');
        } else {
            alert('Leaderboard cleared successfully!');
        }
    } catch (error) {
        console.error('Error clearing leaderboard:', error);
        alert('Error clearing leaderboard. Please try again.');
    }
}

/**
 * Handle save score button click
 */
function handleSaveScore() {
    const nameInput = document.getElementById('playerNameInput');
    const modalScoreElement = document.getElementById('modalScore');
    
    if (!nameInput || !modalScoreElement) return;

    const playerName = nameInput.value.trim();
    const score = parseInt(modalScoreElement.textContent.replace(/,/g, ''));

    if (!playerName) {
        alert('Please enter your name!');
        nameInput.focus();
        return;
    }

    // Add score to leaderboard
    const success = addScore(playerName, score);

    if (success) {
        // Close modal
        const modal = bootstrap.Modal.getInstance(document.getElementById('nameInputModal'));
        if (modal) modal.hide();

        // Show success notification
        if (window.GameUtils && window.GameUtils.showNotification) {
            window.GameUtils.showNotification('Score saved to leaderboard!', 'success');
        }

        // Reload leaderboard display
        loadLeaderboard();

        // Redirect to leaderboard page after a delay
        setTimeout(() => {
            window.location.href = 'leaderboard.html';
        }, 1500);
    }
}

/**
 * Show name input modal for high score
 * @param {number} score - The achieved score
 */
function showNameInputModal(score) {
    const modalScoreElement = document.getElementById('modalScore');
    const playerInput = document.getElementById('playerNameInput');
    
    if (modalScoreElement) {
        modalScoreElement.textContent = window.GameUtils ? window.GameUtils.formatNumber(score) : score;
    }
    
    if (playerInput) {
        playerInput.value = '';
    }

    const modal = new bootstrap.Modal(document.getElementById('nameInputModal'));
    modal.show();

    // Focus on input when modal is shown
    setTimeout(() => {
        if (playerInput) playerInput.focus();
    }, 500);
}

// Export functions for use in game.js
window.LeaderboardManager = {
    addScore,
    isHighScore,
    getLeaderboardData,
    showNameInputModal,
    loadLeaderboard
};
