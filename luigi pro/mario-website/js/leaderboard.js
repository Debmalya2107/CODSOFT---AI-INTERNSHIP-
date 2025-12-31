// Leaderboard JavaScript - Mario & Luigi Gaming Universe

class LeaderboardManager {
    constructor() {
        this.storageKey = 'marioLuigiScores';
        this.maxScores = 10;
        this.scores = [];
        this.init();
    }
    
    init() {
        this.loadScores();
        this.renderLeaderboard();
        this.updateStats();
        this.renderRecentScores();
    }
    
    loadScores() {
        const storedScores = localStorage.getItem(this.storageKey);
        if (storedScores) {
            try {
                this.scores = JSON.parse(storedScores);
            } catch (error) {
                console.error('Error loading scores:', error);
                this.scores = [];
            }
        }
    }
    
    saveScores() {
        try {
            localStorage.setItem(this.storageKey, JSON.stringify(this.scores));
            return true;
        } catch (error) {
            console.error('Error saving scores:', error);
            return false;
        }
    }
    
    addScore(scoreData) {
        // Add timestamp if not provided
        if (!scoreData.date) {
            scoreData.date = new Date().toISOString();
        }
        
        // Add score to array
        this.scores.push(scoreData);
        
        // Sort by score (descending)
        this.scores.sort((a, b) => b.score - a.score);
        
        // Keep only top scores
        this.scores = this.scores.slice(0, this.maxScores);
        
        // Save to localStorage
        this.saveScores();
        
        // Refresh display
        this.renderLeaderboard();
        this.updateStats();
        this.renderRecentScores();
        
        return true;
    }
    
    renderLeaderboard() {
        const tbody = document.getElementById('leaderboardBody');
        const emptyMessage = document.getElementById('emptyMessage');
        const leaderboardActions = document.getElementById('leaderboardActions');
        
        if (this.scores.length === 0) {
            tbody.innerHTML = '';
            emptyMessage.style.display = 'block';
            leaderboardActions.style.display = 'none';
            return;
        }
        
        emptyMessage.style.display = 'none';
        leaderboardActions.style.display = 'block';
        
        tbody.innerHTML = this.scores.map((score, index) => {
            const rank = index + 1;
            const rankClass = rank === 1 ? 'rank-1' : rank === 2 ? 'rank-2' : rank === 3 ? 'rank-3' : '';
            const date = new Date(score.date);
            const formattedDate = date.toLocaleDateString() + ' ' + date.toLocaleTimeString();
            
            return `
                <tr class="${rankClass}">
                    <td>
                        <span class="badge ${rank === 1 ? 'bg-warning' : rank === 2 ? 'bg-secondary' : rank === 3 ? 'bg-danger' : 'bg-primary'}">
                            #${rank}
                        </span>
                    </td>
                    <td>
                        <strong>${this.escapeHtml(score.name)}</strong>
                    </td>
                    <td>
                        <span class="text-success fw-bold">${score.score.toLocaleString()}</span>
                    </td>
                    <td>
                        <i class="bi bi-coin text-warning"></i> ${score.coins || 0}
                    </td>
                    <td>
                        <i class="bi bi-clock text-info"></i> ${this.formatTime(score.time || 0)}
                    </td>
                    <td>
                        <small class="text-muted">${formattedDate}</small>
                    </td>
                </tr>
            `;
        }).join('');
    }
    
    updateStats() {
        const totalPlayers = document.getElementById('totalPlayers');
        const highScore = document.getElementById('highScore');
        const totalCoins = document.getElementById('totalCoins');
        const bestTime = document.getElementById('bestTime');
        
        // Total players
        totalPlayers.textContent = this.scores.length;
        
        // High score
        if (this.scores.length > 0) {
            highScore.textContent = this.scores[0].score.toLocaleString();
            
            // Total coins
            const totalCoinsCount = this.scores.reduce((sum, score) => sum + (score.coins || 0), 0);
            totalCoins.textContent = totalCoinsCount.toLocaleString();
            
            // Best time (lowest)
            const bestTimeScore = Math.min(...this.scores.map(score => score.time || Infinity));
            bestTime.textContent = bestTimeScore === Infinity ? 'N/A' : this.formatTime(bestTimeScore);
        } else {
            highScore.textContent = '0';
            totalCoins.textContent = '0';
            bestTime.textContent = 'N/A';
        }
    }
    
    renderRecentScores() {
        const recentScoresContainer = document.getElementById('recentScores');
        
        if (this.scores.length === 0) {
            recentScoresContainer.innerHTML = `
                <div class="col-12 text-center">
                    <div class="alert alert-info">
                        <h5>No scores yet!</h5>
                        <p>Be the first to play and set a high score!</p>
                        <a href="game.html" class="btn btn-success">Play Now</a>
                    </div>
                </div>
            `;
            return;
        }
        
        // Get recent scores (last 5, sorted by date)
        const recentScores = [...this.scores]
            .sort((a, b) => new Date(b.date) - new Date(a.date))
            .slice(0, 5);
        
        recentScoresContainer.innerHTML = recentScores.map((score, index) => {
            const date = new Date(score.date);
            const formattedDate = date.toLocaleDateString();
            const rank = this.scores.indexOf(score) + 1;
            const rankClass = rank === 1 ? 'text-warning' : rank === 2 ? 'text-secondary' : rank === 3 ? 'text-danger' : 'text-primary';
            
            return `
                <div class="col-md-6 col-lg-4" data-aos="fade-up" data-aos-delay="${index * 100}">
                    <div class="recent-score-card">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <h6 class="mb-1">${this.escapeHtml(score.name)}</h6>
                                <small class="text-muted">${formattedDate}</small>
                            </div>
                            <div class="text-end">
                                <div class="${rankClass} fw-bold">#${rank}</div>
                                <div class="text-success fw-bold">${score.score.toLocaleString()}</div>
                            </div>
                        </div>
                        <div class="mt-2 d-flex justify-content-between">
                            <small><i class="bi bi-coin text-warning"></i> ${score.coins || 0}</small>
                            <small><i class="bi bi-clock text-info"></i> ${this.formatTime(score.time || 0)}</small>
                        </div>
                    </div>
                </div>
            `;
        }).join('');
    }
    
    formatTime(seconds) {
        const minutes = Math.floor(seconds / 60);
        const remainingSeconds = seconds % 60;
        return `${minutes}:${remainingSeconds.toString().padStart(2, '0')}`;
    }
    
    escapeHtml(text) {
        const div = document.createElement('div');
        div.textContent = text;
        return div.innerHTML;
    }
    
    clearAllScores() {
        if (confirm('Are you sure you want to clear all scores? This action cannot be undone!')) {
            this.scores = [];
            this.saveScores();
            this.renderLeaderboard();
            this.updateStats();
            this.renderRecentScores();
            
            // Show success message
            this.showNotification('All scores have been cleared!', 'success');
        }
    }
    
    refreshLeaderboard() {
        this.loadScores();
        this.renderLeaderboard();
        this.updateStats();
        this.renderRecentScores();
        
        // Show refresh notification
        this.showNotification('Leaderboard refreshed!', 'info');
    }
    
    showNotification(message, type = 'success') {
        // Create notification element
        const notification = document.createElement('div');
        notification.className = `alert alert-${type === 'success' ? 'success' : type === 'error' ? 'danger' : 'info'} alert-dismissible fade show position-fixed`;
        notification.style.cssText = 'top: 20px; right: 20px; z-index: 9999; min-width: 300px;';
        notification.innerHTML = `
            ${message}
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
        `;
        
        document.body.appendChild(notification);
        
        // Auto-remove after 3 seconds
        setTimeout(() => {
            if (notification.parentNode) {
                notification.parentNode.removeChild(notification);
            }
        }, 3000);
    }
    
    exportScores() {
        const dataStr = JSON.stringify(this.scores, null, 2);
        const dataUri = 'data:application/json;charset=utf-8,'+ encodeURIComponent(dataStr);
        
        const exportFileDefaultName = `mario-luigi-scores-${new Date().toISOString().split('T')[0]}.json`;
        
        const linkElement = document.createElement('a');
        linkElement.setAttribute('href', dataUri);
        linkElement.setAttribute('download', exportFileDefaultName);
        linkElement.click();
    }
    
    importScores(file) {
        const reader = new FileReader();
        reader.onload = (e) => {
            try {
                const importedScores = JSON.parse(e.target.result);
                if (Array.isArray(importedScores)) {
                    // Merge with existing scores
                    this.scores = [...this.scores, ...importedScores];
                    
                    // Sort and limit
                    this.scores.sort((a, b) => b.score - a.score);
                    this.scores = this.scores.slice(0, this.maxScores);
                    
                    // Save and refresh
                    this.saveScores();
                    this.renderLeaderboard();
                    this.updateStats();
                    this.renderRecentScores();
                    
                    this.showNotification('Scores imported successfully!', 'success');
                } else {
                    throw new Error('Invalid file format');
                }
            } catch (error) {
                this.showNotification('Error importing scores: ' + error.message, 'error');
            }
        };
        reader.readAsText(file);
    }
    
    getTopScore() {
        return this.scores.length > 0 ? this.scores[0] : null;
    }
    
    getPlayerRank(playerName) {
        const index = this.scores.findIndex(score => score.name === playerName);
        return index !== -1 ? index + 1 : null;
    }
    
    getPlayerScores(playerName) {
        return this.scores.filter(score => score.name === playerName);
    }
    
    getAverageScore() {
        if (this.scores.length === 0) return 0;
        const total = this.scores.reduce((sum, score) => sum + score.score, 0);
        return Math.round(total / this.scores.length);
    }
    
    getMedianScore() {
        if (this.scores.length === 0) return 0;
        const sorted = [...this.scores].sort((a, b) => a.score - b.score);
        const middle = Math.floor(sorted.length / 2);
        return sorted.length % 2 === 0 
            ? Math.round((sorted[middle - 1].score + sorted[middle].score) / 2)
            : sorted[middle].score;
    }
}

// Global functions for button clicks
function refreshLeaderboard() {
    if (window.leaderboardManager) {
        window.leaderboardManager.refreshLeaderboard();
    }
}

function clearLeaderboard() {
    if (window.leaderboardManager) {
        window.leaderboardManager.clearAllScores();
    }
}

function exportScores() {
    if (window.leaderboardManager) {
        window.leaderboardManager.exportScores();
    }
}

// Initialize leaderboard when page loads
document.addEventListener('DOMContentLoaded', function() {
    AOS.init({
        duration: 800,
        easing: 'ease-in-out',
        once: true,
        offset: 100
    });
    
    // Create leaderboard manager
    window.leaderboardManager = new LeaderboardManager();
    
    // Add keyboard shortcuts
    document.addEventListener('keydown', function(e) {
        // Ctrl+R to refresh
        if (e.ctrlKey && e.key === 'r') {
            e.preventDefault();
            refreshLeaderboard();
        }
        
        // Ctrl+E to export
        if (e.ctrlKey && e.key === 'e') {
            e.preventDefault();
            exportScores();
        }
    });
    
    // Add drag and drop for importing scores
    const dropZone = document.body;
    
    dropZone.addEventListener('dragover', function(e) {
        e.preventDefault();
        dropZone.classList.add('drag-over');
    });
    
    dropZone.addEventListener('dragleave', function(e) {
        e.preventDefault();
        dropZone.classList.remove('drag-over');
    });
    
    dropZone.addEventListener('drop', function(e) {
        e.preventDefault();
        dropZone.classList.remove('drag-over');
        
        const files = e.dataTransfer.files;
        if (files.length > 0) {
            window.leaderboardManager.importScores(files[0]);
        }
    });
    
    // Add drag-over styles
    const style = document.createElement('style');
    style.textContent = `
        .drag-over {
            background-color: rgba(60, 176, 67, 0.1);
            border: 2px dashed var(--luigi-green);
        }
    `;
    document.head.appendChild(style);
});

// Make leaderboard manager available globally
window.LeaderboardManager = LeaderboardManager;