# Mario & Luigi Gaming Universe

A comprehensive, feature-rich gaming website built with HTML5, CSS3, and vanilla JavaScript. This project showcases a complete Mario & Luigi themed gaming experience with multiple pages, interactive features, and a fully functional platformer game.

## 🎮 Features

### 📄 Pages
- **Home (index.html)** - Hero banner, game preview, character showcase
- **Characters (characters.html)** - Detailed character information with stats and abilities
- **Game (game.html)** - High-detail JavaScript platformer game
- **Gallery (gallery.html)** - Image gallery with lightbox and filtering
- **Leaderboard (leaderboard.html)** - Score tracking with localStorage
- **Contact (contact.html)** - Contact form with validation

### 🎮 Game Features
- **Playable Character**: Luigi with smooth animations
- **Enemies**: Goomba, Koopa Troopa, Flying enemies
- **Physics Engine**: Gravity, jumping, collision detection
- **Power-ups**: Mushrooms, Fire Flowers, Stars
- **Collectibles**: Coins with score tracking
- **Lives System**: 3 hearts with damage mechanics
- **Parallax Scrolling**: Multi-layer backgrounds
- **Responsive Design**: Works on all devices
- **Sound Effects**: Audio feedback for actions
- **Pause/Resume**: Full game state management

### 🎨 Design Features
- **Responsive Design**: Mobile-first approach
- **Modern UI**: Clean, pixel-game inspired design
- **Animations**: AOS.js scroll animations
- **Interactive Elements**: Hover effects, transitions
- **Color Theme**: Mario red, Luigi green, gold accents
- **Bootstrap 5**: Professional component library

### 💾 Data Features
- **LocalStorage**: Score persistence
- **Form Validation**: Client-side validation
- **Leaderboard**: Top 10 scores tracking
- **Contact Forms**: Data collection and storage

## 🚀 Quick Start

1. **Download/Clone** the project files
2. **Open** `index.html` in your web browser
3. **Navigate** through the pages using the navigation menu
4. **Play** the game by clicking "Play Now" or going to game.html

## 📁 Project Structure

```
mario-website/
├── index.html              # Home page
├── characters.html          # Character information
├── game.html               # Platformer game
├── gallery.html            # Image gallery
├── leaderboard.html         # Score leaderboard
├── contact.html            # Contact form
├── css/
│   └── style.css           # Main stylesheet
├── js/
│   ├── main.js             # Main JavaScript functionality
│   ├── game.js             # Game engine and logic
│   └── leaderboard.js      # Leaderboard management
└── img/
    ├── mario.svg           # Mario character
    ├── luigi.svg           # Luigi character
    ├── peach.svg           # Princess Peach
    ├── bowser.svg          # Bowser enemy
    ├── logo.svg            # Site logo
    ├── favicon.svg         # Favicon
    ├── gameplay.svg        # Game screenshot
    ├── obstacles/
    │   ├── goomba.svg      # Goomba enemy
    │   └── koopa.svg       # Koopa Troopa
    └── gallery/
        ├── mario-action.svg # Mario action shot
        └── luigi-jump.svg  # Luigi jumping
```

## 🎮 Game Controls

### Keyboard Controls
- **Arrow Keys (←/→)** or **A/D**: Move left/right
- **Space** or **↑** or **W**: Jump
- **P**: Pause/Resume game

### Game Objectives
1. **Collect coins** to increase your score
2. **Avoid enemies** or jump on them to defeat
3. **Collect power-ups** for special abilities
4. **Reach the flag** at the end to complete the level
5. **Achieve high scores** to appear on the leaderboard

## 🎨 Customization

### Colors
The theme uses CSS variables for easy customization:
```css
:root {
    --mario-red: #E52521;
    --luigi-green: #3CB043;
    --gold: #F8D210;
    --dark: #1C1C1C;
    --white: #FFFFFF;
}
```

### Game Settings
Modify game parameters in `js/game.js`:
```javascript
// Physics constants
this.gravity = 0.5;
this.friction = 0.8;
this.acceleration = 0.5;
this.maxSpeed = 5;
this.jumpPower = -12;
```

## 🛠️ Technologies Used

- **HTML5**: Semantic markup, canvas for game
- **CSS3**: Modern styling, animations, responsive design
- **JavaScript ES6+**: Game logic, DOM manipulation, event handling
- **Bootstrap 5**: UI components, grid system
- **AOS.js**: Scroll animations
- **LocalStorage**: Client-side data persistence

## 📱 Responsive Design

The website is fully responsive and works on:
- **Desktop** (1200px+)
- **Tablet** (768px - 1199px)
- **Mobile** (320px - 767px)

## 🎯 Game Features Explained

### Physics Engine
- **Gravity**: Realistic falling mechanics
- **Jump Arc**: Parabolic jump trajectories
- **Collision Detection**: Pixel-perfect bounding box collision
- **Momentum**: Acceleration and friction

### Enemy AI
- **Goomba**: Basic patrol movement
- **Koopa Troopa**: Shell mechanics
- **Flying Enemies**: Sine wave movement patterns

### Power-up System
- **Super Mushroom**: Temporary size increase
- **Fire Flower**: Projectile ability
- **Star Man**: Temporary invincibility

## 🏆 Leaderboard System

- **Top 10 Scores**: Automatically sorted by score
- **Player Names**: Custom name entry
- **Persistent Storage**: Uses localStorage
- **Export/Import**: JSON data management
- **Statistics**: Total players, high scores, best times

## 📞 Contact Features

- **Form Validation**: Real-time input validation
- **Multiple Fields**: Name, email, phone, subject, message
- **Priority Levels**: Low, Medium, High, Urgent
- **Newsletter**: Optional subscription
- **Terms & Conditions**: Required acceptance

## 🎨 Gallery Features

- **16 Images**: Character, gameplay, environment, power-up categories
- **Lightbox**: Full-screen image viewing
- **Filtering**: Category-based filtering
- **Responsive Grid**: Bootstrap grid system
- **Hover Effects**: Interactive image previews

## 🔧 Browser Compatibility

- **Chrome**: Full support
- **Firefox**: Full support
- **Safari**: Full support
- **Edge**: Full support
- **Mobile Browsers**: Full support

## 📝 Development Notes

### Game Architecture
- **Object-Oriented**: Class-based structure
- **Game Loop**: RequestAnimationFrame for smooth 60fps
- **State Management**: Centralized game state
- **Modular Design**: Separate classes for entities

### Performance Optimizations
- **Canvas Rendering**: Efficient drawing operations
- **Object Pooling**: Reuse game objects
- **Lazy Loading**: Load assets on demand
- **Debouncing**: Optimized event handlers

## 🚀 Future Enhancements

- **Multiple Levels**: Additional game stages
- **Sound Effects**: Audio integration
- **Save System**: Game progress saving
- **Multiplayer**: Local multiplayer support
- **Achievements**: Unlockable content
- **Themes**: Different visual themes

## 📄 License

This project is for educational purposes. Mario and Luigi characters are trademarks of Nintendo. This is a fan-made project and not affiliated with Nintendo.

## 🤝 Contributing

Feel free to:
- Report bugs
- Suggest features
- Improve code quality
- Add new content

## 📞 Support

For questions or issues:
1. Check the console for error messages
2. Ensure all files are in the correct directories
3. Test in different browsers
4. Check responsive design on various devices

---

**Enjoy playing and exploring the Mario & Luigi Gaming Universe!** 🎮🍄