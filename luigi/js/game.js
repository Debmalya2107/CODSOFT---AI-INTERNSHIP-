/**
 * Luigi & Mario Gaming Website
 * High-Detail Side-Scrolling Platformer Game Engine
 * 
 * Features:
 * - Complete physics system (gravity, friction, acceleration)
 * - Player character with running and jumping animations
 * - Multiple enemy types (Goomba, Koopa Troopa) with AI
 * - Parallax scrolling backgrounds (3 layers)
 * - Coin collection system with scoring
 * - Lives system with hearts display
 * - Game states (playing, paused, gameover, won)
 * - Difficulty scaling over time
 * - Responsive canvas system
 * - Collision detection
 */

// ============================================
// GAME CONFIGURATION
// ============================================

const CONFIG = {
    // Canvas
    CANVAS_WIDTH: 1000,
    CANVAS_HEIGHT: 600,
    
    // Physics
    GRAVITY: 0.8,
    FRICTION: 0.85,
    MAX_FALL_SPEED: 15,
    
    // Player
    PLAYER_WIDTH: 50,
    PLAYER_HEIGHT: 60,
    PLAYER_SPEED: 5,
    PLAYER_JUMP_POWER: 15,
    PLAYER_START_X: 100,
    PLAYER_START_Y: 400,
    
    // Ground
    GROUND_Y: 500,
    GROUND_HEIGHT: 100,
    
    // Enemies
    ENEMY_SPAWN_INTERVAL: 3000, // milliseconds
    ENEMY_MIN_SPEED: 2,
    ENEMY_MAX_SPEED: 5,
    
    // Coins
    COIN_SPAWN_INTERVAL: 2000,
    COIN_SIZE: 30,
    COIN_VALUE: 10,
    
    // Game
    INITIAL_LIVES: 3,
    DIFFICULTY_INCREASE_INTERVAL: 10000, // Increase difficulty every 10 seconds
    
    // Colors
    COLORS: {
        SKY: '#87CEEB',
        GROUND: '#8B4513',
        GRASS: '#228B22',
        PLAYER: '#3CB043',
        COIN: '#F8D210',
        ENEMY_GOOMBA: '#8B4513',
        ENEMY_KOOPA: '#4CAF50'
    }
};

// ============================================
// GAME STATE
// ============================================

let gameState = {
    isRunning: false,
    isPaused: false,
    isGameOver: false,
    score: 0,
    lives: CONFIG.INITIAL_LIVES,
    difficultyLevel: 1,
    lastEnemySpawn: 0,
    lastCoinSpawn: 0,
    lastDifficultyIncrease: 0,
    keys: {},
    animationFrame: null
};

// ============================================
// CANVAS SETUP
// ============================================

const canvas = document.getElementById('gameCanvas');
const ctx = canvas.getContext('2d');

// Make canvas responsive
function resizeCanvas() {
    const container = canvas.parentElement;
    const containerWidth = container.offsetWidth;
    const scale = Math.min(containerWidth / CONFIG.CANVAS_WIDTH, 1);
    
    canvas.style.width = (CONFIG.CANVAS_WIDTH * scale) + 'px';
    canvas.style.height = (CONFIG.CANVAS_HEIGHT * scale) + 'px';
}

window.addEventListener('resize', resizeCanvas);
resizeCanvas();

// ============================================
// GAME CLASSES
// ============================================

/**
 * Player Class - Luigi character
 */
class Player {
    constructor() {
        this.x = CONFIG.PLAYER_START_X;
        this.y = CONFIG.PLAYER_START_Y;
        this.width = CONFIG.PLAYER_WIDTH;
        this.height = CONFIG.PLAYER_HEIGHT;
        this.velocityX = 0;
        this.velocityY = 0;
        this.isJumping = false;
        this.isOnGround = false;
        this.animationFrame = 0;
        this.animationCounter = 0;
        this.facingRight = true;
        this.invincible = false;
        this.invincibleTimer = 0;
    }

    update() {
        // Horizontal movement
        if (gameState.keys['ArrowLeft'] || gameState.keys['a'] || gameState.keys['A']) {
            this.velocityX = -CONFIG.PLAYER_SPEED;
            this.facingRight = false;
        } else if (gameState.keys['ArrowRight'] || gameState.keys['d'] || gameState.keys['D']) {
            this.velocityX = CONFIG.PLAYER_SPEED;
            this.facingRight = true;
        } else {
            this.velocityX *= CONFIG.FRICTION;
        }

        // Jumping
        if ((gameState.keys['ArrowUp'] || gameState.keys['w'] || gameState.keys['W'] || gameState.keys[' ']) && this.isOnGround) {
            this.velocityY = -CONFIG.PLAYER_JUMP_POWER;
            this.isJumping = true;
            this.isOnGround = false;
        }

        // Apply gravity
        this.velocityY += CONFIG.GRAVITY;
        if (this.velocityY > CONFIG.MAX_FALL_SPEED) {
            this.velocityY = CONFIG.MAX_FALL_SPEED;
        }

        // Update position
        this.x += this.velocityX;
        this.y += this.velocityY;

        // Ground collision
        if (this.y + this.height >= CONFIG.GROUND_Y) {
            this.y = CONFIG.GROUND_Y - this.height;
            this.velocityY = 0;
            this.isOnGround = true;
            this.isJumping = false;
        } else {
            this.isOnGround = false;
        }

        // Keep player on screen (left and right boundaries)
        if (this.x < 0) this.x = 0;
        if (this.x + this.width > CONFIG.CANVAS_WIDTH) {
            this.x = CONFIG.CANVAS_WIDTH - this.width;
        }

        // Animation
        if (Math.abs(this.velocityX) > 0.5) {
            this.animationCounter++;
            if (this.animationCounter % 5 === 0) {
                this.animationFrame = (this.animationFrame + 1) % 4;
            }
        } else {
            this.animationFrame = 0;
        }

        // Invincibility timer
        if (this.invincible) {
            this.invincibleTimer--;
            if (this.invincibleTimer <= 0) {
                this.invincible = false;
            }
        }
    }

    draw() {
        ctx.save();
        
        // Flash when invincible
        if (this.invincible && Math.floor(this.invincibleTimer / 5) % 2 === 0) {
            ctx.globalAlpha = 0.5;
        }

        // Draw Luigi (simple representation)
        // Body (green)
        ctx.fillStyle = CONFIG.COLORS.PLAYER;
        ctx.fillRect(this.x + 10, this.y + 20, 30, 30);
        
        // Head (skin tone)
        ctx.fillStyle = '#FFD1A9';
        ctx.beginPath();
        ctx.arc(this.x + 25, this.y + 15, 15, 0, Math.PI * 2);
        ctx.fill();
        
        // Hat (green)
        ctx.fillStyle = CONFIG.COLORS.PLAYER;
        ctx.fillRect(this.x + 12, this.y + 5, 26, 8);
        ctx.beginPath();
        ctx.arc(this.x + 25, this.y + 5, 13, Math.PI, 0);
        ctx.fill();
        
        // 'L' on hat
        ctx.fillStyle = '#FFFFFF';
        ctx.font = 'bold 12px Arial';
        ctx.fillText('L', this.x + 20, this.y + 13);
        
        // Mustache
        ctx.fillStyle = '#654321';
        ctx.fillRect(this.x + 18, this.y + 18, 14, 3);
        
        // Legs
        ctx.fillStyle = '#0000FF';
        ctx.fillRect(this.x + 15, this.y + 50, 8, 10);
        ctx.fillRect(this.x + 27, this.y + 50, 8, 10);
        
        // Shoes
        ctx.fillStyle = '#8B4513';
        ctx.fillRect(this.x + 13, this.y + 58, 10, 5);
        ctx.fillRect(this.x + 25, this.y + 58, 10, 5);

        ctx.restore();
    }

    takeDamage() {
        if (this.invincible) return false;
        
        gameState.lives--;
        updateLivesDisplay();
        
        this.invincible = true;
        this.invincibleTimer = 60; // 1 second of invincibility at 60 FPS
        
        return true;
    }

    reset() {
        this.x = CONFIG.PLAYER_START_X;
        this.y = CONFIG.PLAYER_START_Y;
        this.velocityX = 0;
        this.velocityY = 0;
        this.isJumping = false;
        this.isOnGround = false;
        this.invincible = false;
    }
}

/**
 * Enemy Class - Base class for all enemies
 */
class Enemy {
    constructor(x, y, type) {
        this.x = x;
        this.y = y;
        this.type = type; // 'goomba' or 'koopa'
        this.width = 40;
        this.height = 40;
        this.speed = CONFIG.ENEMY_MIN_SPEED + (Math.random() * (CONFIG.ENEMY_MAX_SPEED - CONFIG.ENEMY_MIN_SPEED)) * gameState.difficultyLevel;
        this.markedForDeletion = false;
        this.animationFrame = 0;
        this.animationCounter = 0;
    }

    update() {
        this.x -= this.speed;
        
        // Animation
        this.animationCounter++;
        if (this.animationCounter % 10 === 0) {
            this.animationFrame = (this.animationFrame + 1) % 2;
        }
        
        // Mark for deletion if off screen
        if (this.x + this.width < 0) {
            this.markedForDeletion = true;
        }
    }

    draw() {
        if (this.type === 'goomba') {
            this.drawGoomba();
        } else if (this.type === 'koopa') {
            this.drawKoopa();
        }
    }

    drawGoomba() {
        // Body
        ctx.fillStyle = CONFIG.COLORS.ENEMY_GOOMBA;
        ctx.beginPath();
        ctx.arc(this.x + this.width / 2, this.y + this.height / 2, this.width / 2, 0, Math.PI * 2);
        ctx.fill();
        
        // Eyes
        ctx.fillStyle = '#FFFFFF';
        ctx.beginPath();
        ctx.arc(this.x + 12, this.y + 15, 5, 0, Math.PI * 2);
        ctx.arc(this.x + 28, this.y + 15, 5, 0, Math.PI * 2);
        ctx.fill();
        
        // Pupils
        ctx.fillStyle = '#000000';
        ctx.beginPath();
        ctx.arc(this.x + 12, this.y + 15, 2, 0, Math.PI * 2);
        ctx.arc(this.x + 28, this.y + 15, 2, 0, Math.PI * 2);
        ctx.fill();
        
        // Angry eyebrows
        ctx.strokeStyle = '#000000';
        ctx.lineWidth = 2;
        ctx.beginPath();
        ctx.moveTo(this.x + 8, this.y + 10);
        ctx.lineTo(this.x + 16, this.y + 13);
        ctx.moveTo(this.x + 32, this.y + 10);
        ctx.lineTo(this.x + 24, this.y + 13);
        ctx.stroke();
        
        // Feet
        const feetOffset = this.animationFrame === 0 ? 0 : 3;
        ctx.fillStyle = CONFIG.COLORS.ENEMY_GOOMBA;
        ctx.fillRect(this.x + 5 + feetOffset, this.y + this.height - 5, 10, 5);
        ctx.fillRect(this.x + 25 - feetOffset, this.y + this.height - 5, 10, 5);
    }

    drawKoopa() {
        // Shell
        ctx.fillStyle = CONFIG.COLORS.ENEMY_KOOPA;
        ctx.beginPath();
        ctx.ellipse(this.x + this.width / 2, this.y + this.height / 2 + 5, this.width / 2, this.height / 2 - 5, 0, 0, Math.PI * 2);
        ctx.fill();
        
        // Shell pattern
        ctx.strokeStyle = '#2E7D32';
        ctx.lineWidth = 2;
        for (let i = 0; i < 3; i++) {
            ctx.beginPath();
            ctx.arc(this.x + this.width / 2, this.y + this.height / 2 + 5, (i + 1) * 8, 0, Math.PI * 2);
            ctx.stroke();
        }
        
        // Head
        ctx.fillStyle = '#8BC34A';
        ctx.beginPath();
        ctx.arc(this.x + this.width / 2, this.y + 10, 12, 0, Math.PI * 2);
        ctx.fill();
        
        // Eyes
        ctx.fillStyle = '#FFFFFF';
        ctx.beginPath();
        ctx.arc(this.x + 15, this.y + 10, 4, 0, Math.PI * 2);
        ctx.arc(this.x + 25, this.y + 10, 4, 0, Math.PI * 2);
        ctx.fill();
        
        // Pupils
        ctx.fillStyle = '#000000';
        ctx.beginPath();
        ctx.arc(this.x + 15, this.y + 10, 2, 0, Math.PI * 2);
        ctx.arc(this.x + 25, this.y + 10, 2, 0, Math.PI * 2);
        ctx.fill();
        
        // Legs (animated)
        const legOffset = this.animationFrame === 0 ? 0 : 4;
        ctx.fillStyle = '#8BC34A';
        ctx.fillRect(this.x + 8, this.y + this.height - 8 + legOffset, 6, 8 - legOffset);
        ctx.fillRect(this.x + 26, this.y + this.height - 8 - legOffset, 6, 8 + legOffset);
    }

    collidesWith(player) {
        return this.x < player.x + player.width &&
               this.x + this.width > player.x &&
               this.y < player.y + player.height &&
               this.y + this.height > player.y;
    }
}

/**
 * Coin Class - Collectible items
 */
class Coin {
    constructor(x, y) {
        this.x = x;
        this.y = y;
        this.size = CONFIG.COIN_SIZE;
        this.markedForDeletion = false;
        this.rotation = 0;
        this.floatOffset = 0;
        this.floatDirection = 1;
    }

    update() {
        this.x -= 2; // Scroll with background
        
        // Floating animation
        this.floatOffset += 0.5 * this.floatDirection;
        if (this.floatOffset > 10 || this.floatOffset < -10) {
            this.floatDirection *= -1;
        }
        
        // Rotation animation
        this.rotation += 0.1;
        
        // Mark for deletion if off screen
        if (this.x + this.size < 0) {
            this.markedForDeletion = true;
        }
    }

    draw() {
        ctx.save();
        ctx.translate(this.x + this.size / 2, this.y + this.floatOffset + this.size / 2);
        ctx.rotate(this.rotation);
        
        // Outer circle
        ctx.fillStyle = CONFIG.COLORS.COIN;
        ctx.beginPath();
        ctx.arc(0, 0, this.size / 2, 0, Math.PI * 2);
        ctx.fill();
        
        // Inner circle (darker)
        ctx.fillStyle = '#DAA520';
        ctx.beginPath();
        ctx.arc(0, 0, this.size / 3, 0, Math.PI * 2);
        ctx.fill();
        
        // Star pattern
        ctx.fillStyle = CONFIG.COLORS.COIN;
        ctx.font = 'bold 20px Arial';
        ctx.textAlign = 'center';
        ctx.textBaseline = 'middle';
        ctx.fillText('★', 0, 0);
        
        ctx.restore();
    }

    collidesWith(player) {
        const distance = Math.sqrt(
            Math.pow(this.x + this.size / 2 - (player.x + player.width / 2), 2) +
            Math.pow(this.y + this.size / 2 - (player.y + player.height / 2), 2)
        );
        return distance < (this.size / 2 + player.width / 3);
    }
}

/**
 * Parallax Background System
 */
class ParallaxBackground {
    constructor() {
        this.layers = [
            { x: 0, speed: 0.5, color: '#B0E0E6' },  // Far mountains
            { x: 0, speed: 1, color: '#90CAF9' },    // Mid mountains
            { x: 0, speed: 1.5, color: '#64B5F6' }   // Near hills
        ];
    }

    update() {
        this.layers.forEach(layer => {
            layer.x -= layer.speed;
            if (layer.x <= -CONFIG.CANVAS_WIDTH) {
                layer.x = 0;
            }
        });
    }

    draw() {
        // Sky
        ctx.fillStyle = CONFIG.COLORS.SKY;
        ctx.fillRect(0, 0, CONFIG.CANVAS_WIDTH, CONFIG.GROUND_Y);
        
        // Layer 1 - Far mountains
        ctx.fillStyle = this.layers[0].color;
        this.drawMountains(this.layers[0].x, 300, 150, 0.3);
        
        // Layer 2 - Mid mountains
        ctx.fillStyle = this.layers[1].color;
        this.drawMountains(this.layers[1].x, 350, 120, 0.5);
        
        // Layer 3 - Near hills
        ctx.fillStyle = this.layers[2].color;
        this.drawHills(this.layers[2].x, 420, 80);
        
        // Clouds
        this.drawClouds();
    }

    drawMountains(offsetX, baseY, height, opacity) {
        ctx.save();
        ctx.globalAlpha = opacity;
        
        for (let i = 0; i < 6; i++) {
            const x = offsetX + i * 200;
            ctx.beginPath();
            ctx.moveTo(x, baseY);
            ctx.lineTo(x + 100, baseY - height);
            ctx.lineTo(x + 200, baseY);
            ctx.closePath();
            ctx.fill();
        }
        
        ctx.restore();
    }

    drawHills(offsetX, baseY, height) {
        ctx.beginPath();
        ctx.moveTo(offsetX, baseY);
        
        for (let i = 0; i < 10; i++) {
            const x = offsetX + i * 150;
            ctx.quadraticCurveTo(x + 75, baseY - height, x + 150, baseY);
        }
        
        ctx.lineTo(CONFIG.CANVAS_WIDTH, baseY);
        ctx.lineTo(offsetX, baseY);
        ctx.fill();
    }

    drawClouds() {
        ctx.fillStyle = 'rgba(255, 255, 255, 0.7)';
        
        const clouds = [
            { x: 100, y: 80 },
            { x: 400, y: 120 },
            { x: 700, y: 60 },
            { x: 900, y: 100 }
        ];
        
        clouds.forEach(cloud => {
            this.drawCloud(cloud.x, cloud.y);
        });
    }

    drawCloud(x, y) {
        ctx.beginPath();
        ctx.arc(x, y, 20, 0, Math.PI * 2);
        ctx.arc(x + 25, y, 25, 0, Math.PI * 2);
        ctx.arc(x + 50, y, 20, 0, Math.PI * 2);
        ctx.fill();
    }
}

// ============================================
// GAME OBJECTS
// ============================================

let player = new Player();
let enemies = [];
let coins = [];
let background = new ParallaxBackground();

// ============================================
// GAME FUNCTIONS
// ============================================

/**
 * Initialize game
 */
function initGame() {
    gameState = {
        isRunning: true,
        isPaused: false,
        isGameOver: false,
        score: 0,
        lives: CONFIG.INITIAL_LIVES,
        difficultyLevel: 1,
        lastEnemySpawn: Date.now(),
        lastCoinSpawn: Date.now(),
        lastDifficultyIncrease: Date.now(),
        keys: {},
        animationFrame: null
    };
    
    player = new Player();
    enemies = [];
    coins = [];
    background = new ParallaxBackground();
    
    updateScoreDisplay();
    updateLivesDisplay();
    updateGameStatus('Playing...');
    
    gameLoop();
}

/**
 * Main game loop
 */
function gameLoop() {
    if (gameState.isGameOver) return;
    
    if (!gameState.isPaused) {
        update();
        draw();
    }
    
    gameState.animationFrame = requestAnimationFrame(gameLoop);
}

/**
 * Update game state
 */
function update() {
    const now = Date.now();
    
    // Update background
    background.update();
    
    // Update player
    player.update();
    
    // Spawn enemies
    if (now - gameState.lastEnemySpawn > CONFIG.ENEMY_SPAWN_INTERVAL / gameState.difficultyLevel) {
        spawnEnemy();
        gameState.lastEnemySpawn = now;
    }
    
    // Spawn coins
    if (now - gameState.lastCoinSpawn > CONFIG.COIN_SPAWN_INTERVAL) {
        spawnCoin();
        gameState.lastCoinSpawn = now;
    }
    
    // Update enemies
    enemies.forEach(enemy => enemy.update());
    enemies = enemies.filter(enemy => !enemy.markedForDeletion);
    
    // Update coins
    coins.forEach(coin => coin.update());
    coins = coins.filter(coin => !coin.markedForDeletion);
    
    // Check collisions
    checkCollisions();
    
    // Increase difficulty over time
    if (now - gameState.lastDifficultyIncrease > CONFIG.DIFFICULTY_INCREASE_INTERVAL) {
        gameState.difficultyLevel += 0.2;
        gameState.lastDifficultyIncrease = now;
        updateGameStatus(`Level ${Math.floor(gameState.difficultyLevel)}`);
    }
}

/**
 * Draw everything
 */
function draw() {
    // Clear canvas
    ctx.clearRect(0, 0, CONFIG.CANVAS_WIDTH, CONFIG.CANVAS_HEIGHT);
    
    // Draw background
    background.draw();
    
    // Draw ground
    drawGround();
    
    // Draw coins
    coins.forEach(coin => coin.draw());
    
    // Draw player
    player.draw();
    
    // Draw enemies
    enemies.forEach(enemy => enemy.draw());
}

/**
 * Draw ground
 */
function drawGround() {
    // Grass
    ctx.fillStyle = CONFIG.COLORS.GRASS;
    ctx.fillRect(0, CONFIG.GROUND_Y, CONFIG.CANVAS_WIDTH, 20);
    
    // Dirt
    ctx.fillStyle = CONFIG.COLORS.GROUND;
    ctx.fillRect(0, CONFIG.GROUND_Y + 20, CONFIG.CANVAS_WIDTH, CONFIG.GROUND_HEIGHT - 20);
    
    // Grass blades
    ctx.fillStyle = '#1B5E20';
    for (let i = 0; i < CONFIG.CANVAS_WIDTH; i += 20) {
        ctx.fillRect(i, CONFIG.GROUND_Y - 5, 3, 10);
        ctx.fillRect(i + 10, CONFIG.GROUND_Y - 8, 3, 13);
    }
}

/**
 * Spawn enemy
 */
function spawnEnemy() {
    const type = Math.random() > 0.5 ? 'goomba' : 'koopa';
    const enemy = new Enemy(
        CONFIG.CANVAS_WIDTH,
        CONFIG.GROUND_Y - 40,
        type
    );
    enemies.push(enemy);
}

/**
 * Spawn coin
 */
function spawnCoin() {
    const y = CONFIG.GROUND_Y - 80 - (Math.random() * 150);
    const coin = new Coin(CONFIG.CANVAS_WIDTH, y);
    coins.push(coin);
}

/**
 * Check collisions
 */
function checkCollisions() {
    // Enemy collisions
    enemies.forEach(enemy => {
        if (enemy.collidesWith(player)) {
            const damaged = player.takeDamage();
            if (damaged) {
                enemy.markedForDeletion = true;
                
                if (gameState.lives <= 0) {
                    gameOver();
                }
            }
        }
    });
    
    // Coin collisions
    coins.forEach(coin => {
        if (coin.collidesWith(player)) {
            coin.markedForDeletion = true;
            gameState.score += CONFIG.COIN_VALUE;
            updateScoreDisplay();
        }
    });
}

/**
 * Update score display
 */
function updateScoreDisplay() {
    const scoreElement = document.getElementById('scoreDisplay');
    if (scoreElement) {
        scoreElement.textContent = gameState.score;
    }
}

/**
 * Update lives display
 */
function updateLivesDisplay() {
    const livesDisplay = document.getElementById('livesDisplay');
    if (livesDisplay) {
        livesDisplay.innerHTML = '';
        for (let i = 0; i < CONFIG.INITIAL_LIVES; i++) {
            const heart = document.createElement('i');
            heart.className = 'fas fa-heart heart';
            if (i >= gameState.lives) {
                heart.classList.add('lost');
            }
            livesDisplay.appendChild(heart);
        }
    }
}

/**
 * Update game status text
 */
function updateGameStatus(text) {
    const statusElement = document.getElementById('gameStatus');
    if (statusElement) {
        statusElement.textContent = text;
    }
}

/**
 * Game over
 */
function gameOver() {
    gameState.isGameOver = true;
    gameState.isRunning = false;
    
    if (gameState.animationFrame) {
        cancelAnimationFrame(gameState.animationFrame);
    }
    
    updateGameStatus('Game Over!');
    
    // Show game over modal
    showGameOverModal(false);
    
    // Check if it's a high score
    if (window.LeaderboardManager && window.LeaderboardManager.isHighScore(gameState.score)) {
        setTimeout(() => {
            if (window.LeaderboardManager.showNameInputModal) {
                window.LeaderboardManager.showNameInputModal(gameState.score);
            }
        }, 1000);
    }
}

/**
 * Show game over modal
 */
function showGameOverModal(won) {
    const modal = document.getElementById('gameOverModal');
    const title = document.getElementById('modalTitle');
    const message = document.getElementById('modalMessage');
    const finalScore = document.getElementById('finalScore');
    
    if (modal) {
        modal.style.display = 'block';
        
        if (title) {
            title.textContent = won ? '🎉 You Won! 🎉' : '💀 Game Over! 💀';
        }
        
        if (message) {
            message.textContent = won ? 'Congratulations! You survived!' : 'Better luck next time!';
        }
        
        if (finalScore) {
            finalScore.textContent = gameState.score;
        }
    }
}

/**
 * Restart game
 */
function restartGame() {
    // Hide modal
    const modal = document.getElementById('gameOverModal');
    if (modal) {
        modal.style.display = 'none';
    }
    
    // Reset and start new game
    initGame();
}

/**
 * Pause/Resume game
 */
function togglePause() {
    if (gameState.isGameOver) return;
    
    gameState.isPaused = !gameState.isPaused;
    
    const pauseBtn = document.getElementById('pauseBtn');
    if (pauseBtn) {
        if (gameState.isPaused) {
            pauseBtn.innerHTML = '<i class="fas fa-play"></i> Resume';
            updateGameStatus('Paused');
        } else {
            pauseBtn.innerHTML = '<i class="fas fa-pause"></i> Pause';
            updateGameStatus('Playing...');
        }
    }
}

// ============================================
// EVENT LISTENERS
// ============================================

// Keyboard controls
document.addEventListener('keydown', (e) => {
    gameState.keys[e.key] = true;
    
    // Pause with P key
    if (e.key === 'p' || e.key === 'P') {
        togglePause();
    }
    
    // Restart with R key
    if (e.key === 'r' || e.key === 'R') {
        restartGame();
    }
});

document.addEventListener('keyup', (e) => {
    gameState.keys[e.key] = false;
});

// Button controls
document.addEventListener('DOMContentLoaded', () => {
    const pauseBtn = document.getElementById('pauseBtn');
    if (pauseBtn) {
        pauseBtn.addEventListener('click', togglePause);
    }
    
    const restartBtn = document.getElementById('restartBtn');
    if (restartBtn) {
        restartBtn.addEventListener('click', restartGame);
    }
    
    // Start game automatically
    setTimeout(() => {
        initGame();
    }, 500);
});

// Prevent space bar from scrolling page
window.addEventListener('keydown', (e) => {
    if (e.key === ' ' && e.target === document.body) {
        e.preventDefault();
    }
});
