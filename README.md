# Guesser Game

## 📌 Project Overview
The **Guesser Game** is an interactive Java-based application where a Guesser selects a number, and multiple players attempt to guess it correctly. An Umpire manages the game, collecting guesses and determining the winners based on the correct match. This project demonstrates the use of object-oriented programming (OOP) concepts in Java.

## 🚀 Features
- **Engaging Gameplay**: A Guesser selects a number, and three players try to match it.
- **Input Validation**: Ensures valid number entries (between 1 and 10).
- **Dynamic Result Processing**: Determines winners based on correct guesses.
- **Modular Code Structure**: Utilizes OOP principles for better maintainability.

## 🛠 Prerequisites
- **Java Development Kit (JDK) 8 or higher**
- **Java Compiler** (`javac`) and Java Runtime (`java`)

## 📥 Installation
1. **Verify Java Installation**:
   ```sh
   java -version
   javac -version
   ```
   If Java is not installed, download it from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Clone or Download the Repository**:
   ```sh
   git clone <repository_url>
   cd <repository_folder>
   ```

## 🎮 How to Play
### Step 1️⃣: Compile the Java Program
```sh
javac GuesserGame.java
```
### Step 2️⃣: Run the Game
```sh
java GuesserGame
```

## 🕹 Gameplay Flow
1. The **Guesser** selects a number between 1 and 10.
2. **Three Players** independently make their guesses.
3. The **Umpire** collects and evaluates all the guesses.
4. The result is displayed, announcing the winner(s) or if no one guessed correctly.

## 🎯 Example Run
```
Guesser kindly guess a number between 1-10 : 5
player_1 kindly guess a number between 1-10 : 3
player_2 kindly guess a number between 1-10 : 5
player_3 kindly guess a number between 1-10 : 7

Player 2 won!
First round is complete.
```

## 🔧 Troubleshooting
- **Invalid Input Handling**: If a player enters an out-of-range number, they will be prompted to re-enter a valid guess.
- **Compilation Issues**: Ensure Java is correctly installed and configured.
- **Execution Errors**: If `java GuesserGame` does not work, try:
  ```sh
  java -cp . GuesserGame
  ```

## 📜 License
This project is licensed under the **MIT License** and is open for contributions and modifications.

