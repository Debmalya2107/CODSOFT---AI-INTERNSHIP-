// Luigi's Adventure - High-Detail Platformer Game

class Game {
    constructor() {
        this.canvas = document.getElementById('gameCanvas');
        this.ctx = this.canvas.getContext('2d');
        this.gameRunning = false;
        this.gamePaused = false;
        this.gameTime = 0;
        this.animationId = null;
        
        // Game state
        this.score = 0;
        this.coins = 0;
        this.lives = 3;
        this.level = 1;
        
        // Physics constants
        this.gravity = 0.5;
        this.friction = 0.8;
        this.acceleration = 0.5;
        this.maxSpeed = 5;
        this.jumpPower = -12;
        
        // Game objects
        this.luigi = null;
        this.enemies = [];
        this.coins = [];
        this.platforms = [];
        this.powerUps = [];
        this.particles = [];
        this.backgrounds = [];
        
        // Input handling
        this.keys = {};
        this.setupEventListeners();
        
        // Initialize game
        this.init();
    }
    
    init() {
        // Initialize Luigi
        this.luigi = new Luigi(100, 200, this);
        
        // Initialize platforms
        this.createPlatforms();
        
        // Initialize enemies
        this.createEnemies();
        
        // Initialize coins
        this.createCoins();
        
        // Initialize power-ups
        this.createPowerUps();
        
        // Initialize backgrounds
        this.createBackgrounds();
        
        // Setup UI
        this.setupUI();
        
        // Start game loop
        this.startGameLoop();
    }
    
    createPlatforms() {
        // Ground platforms
        this.platforms.push(new Platform(0, 350, 200, 50, '#8B4513'));
        this.platforms.push(new Platform(250, 350, 150, 50, '#8B4513'));
        this.platforms.push(new Platform(450, 350, 200, 50, '#8B4513'));
        this.platforms.push(new Platform(700, 350, 100, 50, '#8B4513'));
        
        // Floating platforms
        this.platforms.push(new Platform(150, 280, 100, 20, '#654321'));
        this.platforms.push(new Platform(350, 220, 80, 20, '#654321'));
        this.platforms.push(new Platform(500, 250, 120, 20, '#654321'));
        this.platforms.push(new Platform(650, 180, 100, 20, '#654321'));
        
        // Upper platforms
        this.platforms.push(new Platform(50, 150, 80, 20, '#654321'));
        this.platforms.push(new Platform(250, 100, 100, 20, '#654321'));
        this.platforms.push(new Platform(450, 120, 80, 20, '#654321'));
        this.platforms.push(new Platform(600, 80, 150, 20, '#654321'));
    }
    
    createEnemies() {
        // Goombas
        this.enemies.push(new Goomba(300, 320, this));
        this.enemies.push(new Goomba(500, 320, this));
        this.enemies.push(new Goomba(750, 320, this));
        
        // Koopa Troopas
        this.enemies.push(new Koopa(200, 320, this));
        this.enemies.push(new Koomba(600, 320, this));
        
        // Flying enemies
        this.enemies.push(new FlyingEnemy(400, 150, this));
        this.enemies.push(new FlyingEnemy(650, 100, this));
    }
    
    createCoins() {
        // Ground coins
        this.coins.push(new Coin(180, 320, this));
        this.coins.push(new Coin(320, 320, this));
        this.coins.push(new Coin(520, 320, this));
        this.coins.push(new Coin(750, 320, this));
        
        // Platform coins
        this.coins.push(new Coin(200, 250, this));
        this.coins.push(new Coin(390, 190, this));
        this.coins.push(new Coin(560, 220, this));
        this.coins.push(new Coin(700, 150, this));
        
        // Upper coins
        this.coins.push(new Coin(90, 120, this));
        this.coins.push(new Coin(300, 70, this));
        this.coins.push(new Coin(490, 90, this));
        this.coins.push(new Coin(675, 50, this));
    }
    
    createPowerUps() {
        // Mushrooms
        this.powerUps.push(new Mushroom(400, 320, this));
        this.powerUps.push(new Mushroom(700, 320, this));
        
        // Fire Flowers
        this.powerUps.push(new FireFlower(250, 250, this));
        this.powerUps.push(new FireFlower(550, 220, this));
        
        // Stars
        this.powerUps.push(new Star(350, 190, this));
    }
    
    createBackgrounds() {
        // Parallax backgrounds
        this.backgrounds.push(new Background(0, 0, 800, 400, '#87CEEB', 0.1)); // Sky
        this.backgrounds.push(new Background(0, 300, 800, 100, '#90EE90', 0.3)); // Hills
        this.backgrounds.push(new Background(0, 350, 800, 50, '#228B22', 0.5)); // Ground
    }
    
    setupEventListeners() {
        // Keyboard controls
        document.addEventListener('keydown', (e) => {
            this.keys[e.key] = true;
            
            // Pause game with 'P'
            if (e.key === 'p' || e.key === 'P') {
                this.togglePause();
            }
        });
        
        document.addEventListener('keyup', (e) => {
            this.keys[e.key] = false;
        });
        
        // Button controls
        document.getElementById('startBtn').addEventListener('click', () => this.startGame());
        document.getElementById('pauseBtn').addEventListener('click', () => this.togglePause());
        document.getElementById('restartBtn').addEventListener('click', () => this.restartGame());
        document.getElementById('playAgainBtn').addEventListener('click', () => this.restartGame());
        document.getElementById('saveScoreBtn').addEventListener('click', () => this.showNameEntry());
        document.getElementById('submitNameBtn').addEventListener('click', () => this.saveScore());
    }
    
    setupUI() {
        this.updateUI();
    }
    
    startGame() {
        if (!this.gameRunning) {
            this.gameRunning = true;
            this.gamePaused = false;
            this.gameTime = 0;
            
            document.getElementById('startBtn').disabled = true;
            document.getElementById('pauseBtn').disabled = false;
            
            this.startTimer();
        }
    }
    
    togglePause() {
        if (this.gameRunning) {
            this.gamePaused = !this.gamePaused;
            document.getElementById('pauseBtn').textContent = this.gamePaused ? 'Resume' : 'Pause';
            
            if (!this.gamePaused) {
                this.startGameLoop();
            }
        }
    }
    
    restartGame() {
        // Reset game state
        this.score = 0;
        this.coins = 0;
        this.lives = 3;
        this.gameTime = 0;
        this.gameRunning = false;
        this.gamePaused = false;
        
        // Reset Luigi
        this.luigi = new Luigi(100, 200, this);
        
        // Clear and recreate enemies
        this.enemies = [];
        this.createEnemies();
        
        // Clear and recreate coins
        this.coins = [];
        this.createCoins();
        
        // Clear particles
        this.particles = [];
        
        // Update UI
        this.updateUI();
        
        // Reset buttons
        document.getElementById('startBtn').disabled = false;
        document.getElementById('pauseBtn').disabled = true;
        document.getElementById('pauseBtn').textContent = 'Pause';
        
        // Close modals
        const modals = document.querySelectorAll('.modal');
        modals.forEach(modal => {
            const bootstrapModal = bootstrap.Modal.getInstance(modal);
            if (bootstrapModal) {
                bootstrapModal.hide();
            }
        });
        
        // Start game loop
        this.startGameLoop();
    }
    
    startTimer() {
        if (this.timerInterval) {
            clearInterval(this.timerInterval);
        }
        
        this.timerInterval = setInterval(() => {
            if (this.gameRunning && !this.gamePaused) {
                this.gameTime++;
                document.getElementById('time').textContent = this.gameTime;
            }
        }, 1000);
    }
    
    startGameLoop() {
        const gameLoop = () => {
            if (!this.gamePaused && this.gameRunning) {
                this.update();
                this.render();
            }
            
            this.animationId = requestAnimationFrame(gameLoop);
        };
        
        gameLoop();
    }
    
    update() {
        // Update Luigi
        this.luigi.update();
        
        // Update enemies
        this.enemies.forEach(enemy => enemy.update());
        
        // Update coins
        this.coins.forEach(coin => coin.update());
        
        // Update power-ups
        this.powerUps.forEach(powerUp => powerUp.update());
        
        // Update particles
        this.particles.forEach(particle => particle.update());
        
        // Remove dead particles
        this.particles = this.particles.filter(particle => particle.life > 0);
        
        // Check collisions
        this.checkCollisions();
        
        // Check win condition
        this.checkWinCondition();
        
        // Increase difficulty over time
        if (this.gameTime % 30 === 0 && this.gameTime > 0) {
            this.increaseDifficulty();
        }
    }
    
    render() {
        // Clear canvas
        this.ctx.clearRect(0, 0, this.canvas.width, this.canvas.height);
        
        // Draw backgrounds (parallax)
        this.backgrounds.forEach(background => background.render(this.ctx));
        
        // Draw platforms
        this.platforms.forEach(platform => platform.render(this.ctx));
        
        // Draw coins
        this.coins.forEach(coin => coin.render(this.ctx));
        
        // Draw power-ups
        this.powerUps.forEach(powerUp => powerUp.render(this.ctx));
        
        // Draw enemies
        this.enemies.forEach(enemy => enemy.render(this.ctx));
        
        // Draw Luigi
        this.luigi.render(this.ctx);
        
        // Draw particles
        this.particles.forEach(particle => particle.render(this.ctx));
        
        // Draw HUD overlay
        this.drawHUD();
    }
    
    drawHUD() {
        // Draw score
        this.ctx.fillStyle = '#FFFFFF';
        this.ctx.font = 'bold 16px Arial';
        this.ctx.fillText(`Score: ${this.score}`, 10, 25);
        
        // Draw coins
        this.ctx.fillText(`Coins: ${this.coins}`, 150, 25);
        
        // Draw lives
        this.ctx.fillText(`Lives: ${this.lives}`, 280, 25);
        
        // Draw time
        this.ctx.fillText(`Time: ${this.gameTime}`, 400, 25);
        
        // Draw pause indicator
        if (this.gamePaused) {
            this.ctx.fillStyle = 'rgba(0, 0, 0, 0.5)';
            this.ctx.fillRect(0, 0, this.canvas.width, this.canvas.height);
            
            this.ctx.fillStyle = '#FFFFFF';
            this.ctx.font = 'bold 32px Arial';
            this.ctx.textAlign = 'center';
            this.ctx.fillText('PAUSED', this.canvas.width / 2, this.canvas.height / 2);
            this.ctx.textAlign = 'left';
        }
    }
    
    checkCollisions() {
        // Luigi vs Platforms
        this.platforms.forEach(platform => {
            if (this.luigi.collidesWith(platform)) {
                this.luigi.handlePlatformCollision(platform);
            }
        });
        
        // Luigi vs Enemies
        this.enemies.forEach((enemy, index) => {
            if (this.luigi.collidesWith(enemy)) {
                if (this.luigi.velocityY > 0 && this.luigi.y < enemy.y) {
                    // Luigi jumps on enemy
                    this.luigi.bounce();
                    enemy.takeDamage();
                    this.score += 100;
                    this.createParticles(enemy.x + enemy.width/2, enemy.y + enemy.height/2, '#FF0000');
                    this.playSound('enemySound');
                } else {
                    // Enemy hits Luigi
                    if (!this.luigi.invulnerable) {
                        this.luigi.takeDamage();
                        this.lives--;
                        this.updateUI();
                        
                        if (this.lives <= 0) {
                            this.gameOver(false);
                        }
                    }
                }
            }
        });
        
        // Luigi vs Coins
        this.coins.forEach((coin, index) => {
            if (this.luigi.collidesWith(coin) && !coin.collected) {
                coin.collect();
                this.coins++;
                this.score += 50;
                this.updateUI();
                this.createParticles(coin.x + coin.width/2, coin.y + coin.height/2, '#FFD700');
                this.playSound('coinSound');
            }
        });
        
        // Luigi vs Power-ups
        this.powerUps.forEach((powerUp, index) => {
            if (this.luigi.collidesWith(powerUp) && !powerUp.collected) {
                powerUp.collect();
                this.luigi.applyPowerUp(powerUp.type);
                this.score += 200;
                this.updateUI();
                this.createParticles(powerUp.x + powerUp.width/2, powerUp.y + powerUp.height/2, '#00FF00');
            }
        });
    }
    
    checkWinCondition() {
        // Check if Luigi reached the end of the level
        if (this.luigi.x >= this.canvas.width - 50) {
            this.gameOver(true);
        }
    }
    
    increaseDifficulty() {
        // Add more enemies
        if (Math.random() < 0.3) {
            this.enemies.push(new Goomba(Math.random() * this.canvas.width, 320, this));
        }
        
        // Increase enemy speed
        this.enemies.forEach(enemy => {
            if (enemy.speed) {
                enemy.speed *= 1.1;
            }
        });
    }
    
    createParticles(x, y, color) {
        for (let i = 0; i < 10; i++) {
            this.particles.push(new Particle(x, y, color));
        }
    }
    
    playSound(soundId) {
        const sound = document.getElementById(soundId);
        if (sound) {
            sound.currentTime = 0;
            sound.play().catch(e => console.log('Sound play failed:', e));
        }
    }
    
    updateUI() {
        document.getElementById('score').textContent = this.score;
        document.getElementById('coins').textContent = this.coins;
        document.getElementById('lives').textContent = this.lives;
    }
    
    gameOver(won) {
        this.gameRunning = false;
        
        if (this.timerInterval) {
            clearInterval(this.timerInterval);
        }
        
        // Show game over modal
        const modal = new bootstrap.Modal(document.getElementById('gameOverModal'));
        const title = document.getElementById('gameOverTitle');
        const message = document.getElementById('gameOverMessage');
        const finalScore = document.getElementById('finalScore');
        const finalCoins = document.getElementById('finalCoins');
        
        if (won) {
            title.textContent = 'Level Complete!';
            message.innerHTML = '<h3 class="text-success">Congratulations!</h3><p>You successfully completed the level!</p>';
            this.playSound('winSound');
        } else {
            title.textContent = 'Game Over!';
            message.innerHTML = '<h3 class="text-danger">Better luck next time!</h3><p>Try again to beat your high score!</p>';
            this.playSound('gameOverSound');
        }
        
        finalScore.textContent = this.score;
        finalCoins.textContent = this.coins;
        
        modal.show();
    }
    
    showNameEntry() {
        const gameModal = bootstrap.Modal.getInstance(document.getElementById('gameOverModal'));
        gameModal.hide();
        
        setTimeout(() => {
            const nameModal = new bootstrap.Modal(document.getElementById('nameEntryModal'));
            nameModal.show();
        }, 500);
    }
    
    saveScore() {
        const playerName = document.getElementById('playerName').value.trim();
        
        if (playerName) {
            const scoreData = {
                name: playerName,
                score: this.score,
                coins: this.coins,
                time: this.gameTime,
                date: new Date().toISOString()
            };
            
            // Get existing scores
            let scores = JSON.parse(localStorage.getItem('marioLuigiScores') || '[]');
            scores.push(scoreData);
            
            // Sort by score (descending)
            scores.sort((a, b) => b.score - a.score);
            
            // Keep only top 10
            scores = scores.slice(0, 10);
            
            // Save to localStorage
            localStorage.setItem('marioLuigiScores', JSON.stringify(scores));
            
            // Close modal and redirect to leaderboard
            const nameModal = bootstrap.Modal.getInstance(document.getElementById('nameEntryModal'));
            nameModal.hide();
            
            setTimeout(() => {
                window.location.href = 'leaderboard.html';
            }, 1000);
        }
    }
}

// Luigi Character Class
class Luigi {
    constructor(x, y, game) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = 30;
        this.height = 40;
        this.velocityX = 0;
        this.velocityY = 0;
        this.speed = 5;
        this.jumpPower = -12;
        this.onGround = false;
        this.facing = 'right';
        this.invulnerable = false;
        this.powerUp = null;
        this.animationFrame = 0;
        this.animationSpeed = 0.2;
    }
    
    update() {
        // Handle input
        if (this.game.keys['ArrowLeft'] || this.game.keys['a']) {
            this.velocityX -= this.game.acceleration;
            this.facing = 'left';
        }
        if (this.game.keys['ArrowRight'] || this.game.keys['d']) {
            this.velocityX += this.game.acceleration;
            this.facing = 'right';
        }
        if ((this.game.keys[' '] || this.game.keys['ArrowUp'] || this.game.keys['w']) && this.onGround) {
            this.velocityY = this.jumpPower;
            this.onGround = false;
            this.game.playSound('jumpSound');
        }
        
        // Apply physics
        this.velocityY += this.game.gravity;
        this.velocityX *= this.game.friction;
        
        // Limit speed
        this.velocityX = Math.max(-this.maxSpeed, Math.min(this.maxSpeed, this.velocityX));
        
        // Update position
        this.x += this.velocityX;
        this.y += this.velocityY;
        
        // Keep within bounds
        this.x = Math.max(0, Math.min(this.game.canvas.width - this.width, this.x));
        
        // Ground collision
        if (this.y > this.game.canvas.height - this.height - 50) {
            this.y = this.game.canvas.height - this.height - 50;
            this.velocityY = 0;
            this.onGround = true;
        }
        
        // Update animation
        this.animationFrame += this.animationSpeed;
    }
    
    render(ctx) {
        ctx.save();
        
        // Flash when invulnerable
        if (this.invulnerable && Math.floor(this.animationFrame) % 2 === 0) {
            ctx.globalAlpha = 0.5;
        }
        
        // Draw Luigi body
        ctx.fillStyle = '#3CB043';
        ctx.fillRect(this.x, this.y + 10, this.width, this.height - 10);
        
        // Draw Luigi head
        ctx.fillStyle = '#FDBCB4';
        ctx.fillRect(this.x + 5, this.y, this.width - 10, 15);
        
        // Draw Luigi hat
        ctx.fillStyle = '#3CB043';
        ctx.fillRect(this.x + 2, this.y - 5, this.width - 4, 8);
        
        // Draw Luigi eyes
        ctx.fillStyle = '#000000';
        if (this.facing === 'right') {
            ctx.fillRect(this.x + 15, this.y + 5, 3, 3);
        } else {
            ctx.fillRect(this.x + 12, this.y + 5, 3, 3);
        }
        
        // Draw Luigi mustache
        ctx.fillStyle = '#8B4513';
        ctx.fillRect(this.x + 8, this.y + 10, this.width - 16, 2);
        
        // Draw power-up effect
        if (this.powerUp) {
            ctx.strokeStyle = this.powerUp === 'fire' ? '#FF4500' : '#FFD700';
            ctx.lineWidth = 2;
            ctx.strokeRect(this.x - 2, this.y - 2, this.width + 4, this.height + 4);
        }
        
        ctx.restore();
    }
    
    collidesWith(obj) {
        return this.x < obj.x + obj.width &&
               this.x + this.width > obj.x &&
               this.y < obj.y + obj.height &&
               this.y + this.height > obj.y;
    }
    
    handlePlatformCollision(platform) {
        // Top collision (landing on platform)
        if (this.velocityY > 0 && this.y < platform.y) {
            this.y = platform.y - this.height;
            this.velocityY = 0;
            this.onGround = true;
        }
        // Bottom collision
        else if (this.velocityY < 0 && this.y > platform.y) {
            this.y = platform.y + platform.height;
            this.velocityY = 0;
        }
        // Side collisions
        else if (this.velocityX > 0 && this.x < platform.x) {
            this.x = platform.x - this.width;
            this.velocityX = 0;
        }
        else if (this.velocityX < 0 && this.x > platform.x) {
            this.x = platform.x + platform.width;
            this.velocityX = 0;
        }
    }
    
    bounce() {
        this.velocityY = this.jumpPower * 0.8;
    }
    
    takeDamage() {
        this.invulnerable = true;
        setTimeout(() => {
            this.invulnerable = false;
        }, 2000);
    }
    
    applyPowerUp(type) {
        this.powerUp = type;
        setTimeout(() => {
            this.powerUp = null;
        }, 10000);
    }
}

// Enemy Classes
class Enemy {
    constructor(x, y, width, height, color, speed, game) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.speed = speed;
        this.direction = 1;
        this.health = 1;
        this.animationFrame = 0;
    }
    
    update() {
        this.x += this.speed * this.direction;
        this.animationFrame += 0.1;
        
        // Reverse direction at boundaries
        if (this.x <= 0 || this.x >= this.game.canvas.width - this.width) {
            this.direction *= -1;
        }
    }
    
    render(ctx) {
        ctx.fillStyle = this.color;
        ctx.fillRect(this.x, this.y, this.width, this.height);
    }
    
    takeDamage() {
        this.health--;
        if (this.health <= 0) {
            this.destroy();
        }
    }
    
    destroy() {
        const index = this.game.enemies.indexOf(this);
        if (index > -1) {
            this.game.enemies.splice(index, 1);
        }
    }
}

class Goomba extends Enemy {
    constructor(x, y, game) {
        super(x, y, 25, 25, '#8B4513', 1, game);
    }
    
    render(ctx) {
        // Draw Goomba body
        ctx.fillStyle = '#8B4513';
        ctx.fillRect(this.x, this.y + 5, this.width, this.height - 5);
        
        // Draw Goomba head
        ctx.fillStyle = '#654321';
        ctx.fillRect(this.x + 2, this.y, this.width - 4, 10);
        
        // Draw eyes
        ctx.fillStyle = '#FFFFFF';
        ctx.fillRect(this.x + 5, this.y + 3, 4, 4);
        ctx.fillRect(this.x + 16, this.y + 3, 4, 4);
        
        // Draw pupils
        ctx.fillStyle = '#000000';
        ctx.fillRect(this.x + 6 + Math.sin(this.animationFrame) * 1, this.y + 4, 2, 2);
        ctx.fillRect(this.x + 17 + Math.sin(this.animationFrame) * 1, this.y + 4, 2, 2);
        
        // Draw feet
        ctx.fillStyle = '#000000';
        ctx.fillRect(this.x + 3, this.y + this.height - 3, 6, 3);
        ctx.fillRect(this.x + 16, this.y + this.height - 3, 6, 3);
    }
}

class Koopa extends Enemy {
    constructor(x, y, game) {
        super(x, y, 30, 35, '#00FF00', 1.5, game);
        this.inShell = false;
        this.shellTimer = 0;
    }
    
    update() {
        if (this.inShell) {
            this.shellTimer--;
            if (this.shellTimer <= 0) {
                this.inShell = false;
            }
        } else {
            super.update();
        }
    }
    
    render(ctx) {
        if (this.inShell) {
            // Draw shell
            ctx.fillStyle = '#8B4513';
            ctx.fillRect(this.x, this.y + 10, this.width, this.height - 10);
            
            // Shell pattern
            ctx.fillStyle = '#654321';
            ctx.fillRect(this.x + 5, this.y + 15, 5, 5);
            ctx.fillRect(this.x + 12, this.y + 15, 5, 5);
            ctx.fillRect(this.x + 19, this.y + 15, 5, 5);
        } else {
            // Draw Koopa body
            ctx.fillStyle = '#00FF00';
            ctx.fillRect(this.x, this.y + 10, this.width, this.height - 10);
            
            // Draw head
            ctx.fillStyle = '#00CC00';
            ctx.fillRect(this.x + 5, this.y, this.width - 10, 12);
            
            // Draw eyes
            ctx.fillStyle = '#FFFFFF';
            ctx.fillRect(this.x + 7, this.y + 3, 4, 4);
            ctx.fillRect(this.x + 19, this.y + 3, 4, 4);
            
            // Draw shell
            ctx.fillStyle = '#8B4513';
            ctx.fillRect(this.x + 2, this.y + 12, this.width - 4, this.height - 14);
            
            // Shell pattern
            ctx.fillStyle = '#654321';
            ctx.fillRect(this.x + 7, this.y + 17, 4, 4);
            ctx.fillRect(this.x + 14, this.y + 17, 4, 4);
            ctx.fillRect(this.x + 21, this.y + 17, 4, 4);
        }
    }
    
    takeDamage() {
        if (!this.inShell) {
            this.inShell = true;
            this.shellTimer = 180; // 3 seconds at 60fps
            this.speed = 0;
        } else {
            this.destroy();
        }
    }
}

class FlyingEnemy extends Enemy {
    constructor(x, y, game) {
        super(x, y, 20, 20, '#FF0000', 2, game);
        this.baseY = y;
        this.amplitude = 30;
        this.frequency = 0.05;
    }
    
    update() {
        super.update();
        // Sine wave movement
        this.y = this.baseY + Math.sin(this.animationFrame * this.frequency) * this.amplitude;
    }
    
    render(ctx) {
        // Draw flying enemy body
        ctx.fillStyle = '#FF0000';
        ctx.fillRect(this.x, this.y, this.width, this.height);
        
        // Draw wings
        ctx.fillStyle = '#FF6666';
        const wingFlap = Math.sin(this.animationFrame * 0.3) * 5;
        ctx.fillRect(this.x - 8, this.y + 5 + wingFlap, 8, 10);
        ctx.fillRect(this.x + this.width, this.y + 5 - wingFlap, 8, 10);
        
        // Draw eyes
        ctx.fillStyle = '#FFFFFF';
        ctx.fillRect(this.x + 4, this.y + 5, 4, 4);
        ctx.fillRect(this.x + 12, this.y + 5, 4, 4);
        
        // Draw angry eyebrows
        ctx.fillStyle = '#000000';
        ctx.fillRect(this.x + 3, this.y + 3, 6, 1);
        ctx.fillRect(this.x + 11, this.y + 3, 6, 1);
    }
}

// Coin Class
class Coin {
    constructor(x, y, game) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = 20;
        this.height = 20;
        this.collected = false;
        this.animationFrame = Math.random() * Math.PI * 2;
        this.bobOffset = Math.random() * Math.PI * 2;
    }
    
    update() {
        if (!this.collected) {
            this.animationFrame += 0.1;
        }
    }
    
    render(ctx) {
        if (!this.collected) {
            const bobY = Math.sin(this.animationFrame + this.bobOffset) * 3;
            
            ctx.save();
            ctx.translate(this.x + this.width/2, this.y + this.height/2 + bobY);
            ctx.rotate(this.animationFrame * 0.1);
            
            // Draw coin
            ctx.fillStyle = '#FFD700';
            ctx.fillRect(-this.width/2, -this.height/2, this.width, this.height);
            
            // Draw coin details
            ctx.fillStyle = '#FFA500';
            ctx.fillRect(-this.width/2 + 2, -this.height/2 + 2, this.width - 4, this.height - 4);
            
            // Draw coin symbol
            ctx.fillStyle = '#FFD700';
            ctx.font = 'bold 12px Arial';
            ctx.textAlign = 'center';
            ctx.textBaseline = 'middle';
            ctx.fillText('C', 0, 0);
            
            ctx.restore();
        }
    }
    
    collect() {
        this.collected = true;
    }
}

// Power-up Classes
class PowerUp {
    constructor(x, y, type, game) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = 25;
        this.height = 25;
        this.type = type;
        this.collected = false;
        this.animationFrame = 0;
    }
    
    update() {
        if (!this.collected) {
            this.animationFrame += 0.1;
        }
    }
    
    render(ctx) {
        if (!this.collected) {
            const bobY = Math.sin(this.animationFrame) * 5;
            
            ctx.save();
            ctx.translate(this.x + this.width/2, this.y + this.height/2 + bobY);
            
            // Draw power-up based on type
            this.drawPowerUp(ctx);
            
            ctx.restore();
        }
    }
    
    drawPowerUp(ctx) {
        // Override in subclasses
    }
    
    collect() {
        this.collected = true;
    }
}

class Mushroom extends PowerUp {
    constructor(x, y, game) {
        super(x, y, 'mushroom', game);
    }
    
    drawPowerUp(ctx) {
        // Draw mushroom cap
        ctx.fillStyle = '#FF0000';
        ctx.fillRect(-this.width/2, -this.height/2, this.width, this.height/2);
        
        // Draw mushroom spots
        ctx.fillStyle = '#FFFFFF';
        ctx.fillRect(-8, -10, 4, 4);
        ctx.fillRect(4, -8, 4, 4);
        ctx.fillRect(-2, -12, 4, 4);
        
        // Draw mushroom stem
        ctx.fillStyle = '#F5DEB3';
        ctx.fillRect(-this.width/3, 0, this.width/1.5, this.height/2);
    }
}

class FireFlower extends PowerUp {
    constructor(x, y, game) {
        super(x, y, 'fire', game);
    }
    
    drawPowerUp(ctx) {
        // Draw flower petals
        ctx.fillStyle = '#FF4500';
        for (let i = 0; i < 5; i++) {
            ctx.save();
            ctx.rotate((i * 72) * Math.PI / 180);
            ctx.fillRect(-3, -10, 6, 10);
            ctx.restore();
        }
        
        // Draw flower center
        ctx.fillStyle = '#FFD700';
        ctx.beginPath();
        ctx.arc(0, 0, 5, 0, Math.PI * 2);
        ctx.fill();
        
        // Draw stem
        ctx.fillStyle = '#00FF00';
        ctx.fillRect(-2, 5, 4, 10);
    }
}

class Star extends PowerUp {
    constructor(x, y, game) {
        super(x, y, 'star', game);
    }
    
    drawPowerUp(ctx) {
        ctx.save();
        ctx.rotate(this.animationFrame * 0.1);
        
        // Draw star
        ctx.fillStyle = '#FFD700';
        ctx.beginPath();
        for (let i = 0; i < 5; i++) {
            const angle = (i * 144 - 90) * Math.PI / 180;
            const x = Math.cos(angle) * 12;
            const y = Math.sin(angle) * 12;
            
            if (i === 0) {
                ctx.moveTo(x, y);
            } else {
                ctx.lineTo(x, y);
            }
        }
        ctx.closePath();
        ctx.fill();
        
        ctx.restore();
    }
}

// Platform Class
class Platform {
    constructor(x, y, width, height, color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    render(ctx) {
        // Draw platform
        ctx.fillStyle = this.color;
        ctx.fillRect(this.x, this.y, this.width, this.height);
        
        // Draw platform texture
        ctx.fillStyle = 'rgba(0, 0, 0, 0.1)';
        for (let i = 0; i < this.width; i += 20) {
            ctx.fillRect(this.x + i, this.y, 2, this.height);
        }
    }
}

// Background Class
class Background {
    constructor(x, y, width, height, color, parallaxFactor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.parallaxFactor = parallaxFactor;
    }
    
    render(ctx) {
        ctx.fillStyle = this.color;
        ctx.fillRect(this.x, this.y, this.width, this.height);
    }
}

// Particle Class
class Particle {
    constructor(x, y, color) {
        this.x = x;
        this.y = y;
        this.velocityX = (Math.random() - 0.5) * 8;
        this.velocityY = (Math.random() - 0.5) * 8;
        this.color = color;
        this.life = 30;
        this.maxLife = 30;
    }
    
    update() {
        this.x += this.velocityX;
        this.y += this.velocityY;
        this.velocityY += 0.3; // gravity
        this.life--;
    }
    
    render(ctx) {
        const alpha = this.life / this.maxLife;
        ctx.fillStyle = this.color + Math.floor(alpha * 255).toString(16).padStart(2, '0');
        ctx.fillRect(this.x, this.y, 4, 4);
    }
}

// Initialize game when page loads
document.addEventListener('DOMContentLoaded', function() {
    AOS.init({
        duration: 800,
        easing: 'ease-in-out',
        once: true,
        offset: 100
    });
    
    // Create game instance
    const game = new Game();
    
    // Make game globally accessible
    window.game = game;
});