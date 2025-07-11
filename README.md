
# Word Guesser Game

A comprehensive Java-based word guessing game featuring multiple difficulty levels, progressive hints, scoring system, and leaderboards. Players guess words from different categories based on contextual hints with a strategic scoring mechanism.

## 🎮 Game Features

### Core Gameplay
- **3 Difficulty Levels** with distinct word categories:
  - **Level 1**: Animals (10 words) - birds, cats, dogs, farm animals, etc.
  - **Level 2**: Classroom/Education (10 words) - school supplies, learning tools, etc.
  - **Level 3**: World Cities (10 words) - major cities like New York, Tokyo, London, etc.

- **Progressive Hint System**:
  - 3 hints per word with increasing specificity
  - Type `#` during gameplay to request additional hints
  - Up to 2 extra hints available per word (3 total)
  - Hints become more specific to help narrow down the answer

- **Strategic Scoring**:
  - **+10 points** for each correct guess
  - **-2 points** for each incorrect attempt
  - **3 attempts maximum** per word
  - **3 words total** per game session

### Game Modes & Features
- **Interactive Main Menu**:
  - Start new game
  - View leaderboards by difficulty level
  - Exit application

- **Leaderboard System**:
  - Tracks player names, difficulty levels, and scores
  - Displays rankings filtered by difficulty level
  - Includes pre-populated sample scores for comparison
  - Shows current player's score alongside historical data

- **Game Session Management**:
  - Play 3 randomly selected words per session
  - Restart option after completing a game
  - Real-time score tracking and display

## 🏗️ Technical Architecture

### Class Structure

#### Core Game Classes
- **`TestDriver`**: Main application controller
  - Handles user interface and menu navigation
  - Manages game flow and session control
  - Integrates all game components

- **`Player`**: Player data management
  - Stores player name, difficulty level, and current score
  - Extends `Guesser` class for game mechanics
  - Static score tracking across game sessions

- **`Guesser`**: Core guessing mechanics
  - Manages the main word guessing logic
  - Extends `Hints` class for hint functionality
  - Coordinates word display and guess processing

#### Support Classes
- **`Hints`**: Advanced hint management system
  - Loads hints from external `hints.txt` file
  - Implements difficulty-based word selection
  - Manages progressive hint revelation
  - Handles scoring logic and attempt tracking

- **`Words`**: Word pool management
  - Loads words from external `words.txt` file
  - Provides random word selection utilities
  - Maintains word list collections

- **`Levels`**: Difficulty level management
  - Manages current difficulty level state
  - Provides level setting and retrieval
  - Extends `System1` base class

- **`Leaderboard`**: Score tracking and display
  - Extends `Player` class with score storage
  - Filters and displays scores by difficulty level
  - Manages leaderboard entries and rankings

- **`System1`**: Base system class
  - Foundation class for game components
  - Provides common functionality and structure

## 📁 Data Files

- **`words.txt`**: 30 carefully curated words across 3 categories
- **`hints.txt`**: 93 progressive hints (3 per word) with increasing specificity

## 🎯 How to Play

1. **Start the Game**: Run `TestDriver.java` and enter your name
2. **Choose Mode**: Select from the main menu:
   - Start Game
   - Show Leaderboard
   - Exit
3. **Select Difficulty**: Choose level 1-3 based on your preference
4. **Guess Words**: 
   - Read the initial hint for each word
   - Type your guess or `#` for additional hints
   - You have 3 attempts per word
   - Complete all 3 words to finish the game
5. **View Results**: See your final score and ranking on the leaderboard
6. **Restart**: Option to play again or exit

## 🏆 Scoring System

- **Maximum possible score**: 30 points (3 words × 10 points each)
- **Scoring strategy**: Balance between using hints and making accurate guesses
- **Penalty system**: Encourages thoughtful guessing over random attempts

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- IDE with Java support (Eclipse, IntelliJ IDEA, etc.)

### Running the Game
1. Compile all Java files in the project
2. Ensure `words.txt` and `hints.txt` are in the correct directory
3. Run `TestDriver.java` to start the application
4. Follow the on-screen prompts to play

## 📊 Leaderboard Features

- **Difficulty-based rankings**: Separate leaderboards for each level
- **Historical data**: Compare your performance with previous players
- **Score persistence**: Maintains scoring history across sessions
- **Performance tracking**: Monitor improvement across different difficulty levels

This game combines education, entertainment, and strategy, making it perfect for vocabulary building, quick thinking, and competitive play!

