# Tic Tac Toe — Java Console Game

A two-player Tic Tac Toe game that runs in the terminal, written in Java.

---

## How to Run

**Requirements:** Java JDK 8 or higher

### In IntelliJ IDEA
1. Open IntelliJ and create a new Java project
2. Place `TicTacToe.java` inside the `src` folder
3. Right-click the file → **Run 'TicTacToe.main()'**

### From the Terminal
```bash
javac TicTacToe.java
java TicTacToe
```

---

## How to Play

- Two players take turns: **Player X** goes first, then **Player O**
- On your turn, enter a **row** (0–2) and a **column** (0–2) when prompted
- The first player to get **3 in a row** — horizontally, vertically, or diagonally — wins
- If all 9 cells are filled with no winner, the game ends in a **draw**

### Board Layout

```
  0 1 2
0  -|-|-
  ---|---|---
1  -|-|-
  ---|---|---
2  -|-|-
```

Rows and columns are both numbered 0 to 2. For example, entering row `1` and column `2` places your mark at the center-right cell.

---

## Example Gameplay

```
=== Tic Tac Toe ===

  0 1 2
0  -|-|-
  ---|---|---
1  -|-|-
  ---|---|---
2  -|-|-

Player X's turn
Enter Row (0-2): 1
Enter Column (0-2): 1

  0 1 2
0  -|-|-
  ---|---|---
1  -|X|-
  ---|---|---
2  -|-|-

Player O's turn
Enter Row (0-2): 0
Enter Column (0-2): 0
...
```

---

## Project Structure

```
TicTacToe/
└── src/
    └── TicTacToe.java
```

---

## Code Overview

| Method | Description |
|---|---|
| `main()` | Game loop — handles input, move validation, turn switching, and end conditions |
| `initializeBoard()` | Fills the 3×3 board with `-` (empty) at the start |
| `printBoard()` | Prints the current board state to the console |
| `isValidMove(row, col)` | Returns `true` if the cell is in range and not already taken |
| `isBoardFull()` | Returns `true` if no empty cells remain |
| `checkWinner()` | Checks all rows, columns, and diagonals for a winning combination |

---

## Author

Abdullah — FAST-NUCES Lahore
