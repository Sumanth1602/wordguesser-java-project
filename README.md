
# Word Guesser

A word guessing game where players guess words based on hints and difficulty levels. The game tracks scores and provides a leaderboard to showcase top players.

## Classes:

### System1
- Acts as a base class for other components of the game.
- Contains a reference to the `Player`.

### Player
- Represents the player in the game.
- Contains attributes like name, guessed word, difficulty level, and score.
- Extends the `Guesser` class.

### Guesser
- Manages the main guessing mechanics.
- Holds the word to be guessed and provides hints.
- Extends the `Hints` class.

### Hints
- Provides hints to the player.
- Contains a list of hints and methods to retrieve a random hint.
- Extends the `System1` class.

### Words
- Manages the words used in the guessing game.
- Contains a list of words and methods to retrieve a random word.

### Levels
- Manages the game's difficulty levels.
- Contains methods to set and get the current difficulty level.
- Extends the `System1` class.

### TestDriver
- Serves as the main driver of the application.
- Contains the main method and handles user interactions.

### Leaderboard
- Manages and displays leaderboard entries based on players' scores.
- Contains a sample score attribute and methods to display the leaderboard.
- Extends the `Player` class.

## How to Play:

(This section can contain instructions on how to compile and run the game, which can be filled in later.)
