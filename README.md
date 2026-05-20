# 🎰 Lottery Game — Java Console Application

A command-line lottery game built in Java where the user picks 5 numbers, places a bet, and wins based on how many numbers match the computer's random draw.

---

## 🎮 How the Game Works

1. User enters **5 numbers** (between 0–13)
2. User enters a **betting amount**
3. The computer generates **5 random numbers**
4. Numbers are compared — winnings depend on how many match

### 🏆 Winning Table

| Matches | Result | Multiplier |
|---------|--------|------------|
| 0 or 1 | You Lose | — |
| 2 | You Win | 2× bet |
| 3 | Mini Jackpot | 30× bet |
| 4 | Jackpot | 100× bet |
| 5 | Mega Jackpot 🎉 | 200× bet |

After each round, the player can choose to **play again or exit**.

---

## 📁 Repository Structure

```
Lottery/
│
├── 📄 Lottery.java       # Main game logic
└── 📄 README.md
```

---

## 🛠️ Tech Used

- **Java** — core language
- `java.util.Random` — random number generation
- `java.io.BufferedReader` — user input handling
- `java.util.Scanner` — betting input

---

## 🚀 How to Run

**1. Clone the repository**
```bash
git clone https://github.com/asgeek96/Lottery.git
cd Lottery
```

**2. Compile the Java file**
```bash
javac Lottery.java
```

**3. Run the program**
```bash
java Project1
```

### Example Output
```
Enter five numbers
3
7
11
2
9
Enter Betting Amount
100
user=3   PC=7
user=7   PC=7
...
You won!!!!
Winning Amount=200
Want to play again!!! Enter 0 to play again or Enter 1 to exit
```

---

## 💡 What I Learned

- Java console I/O using `BufferedReader` and `Scanner`
- Random number generation with `java.util.Random`
- Nested loop logic for number matching
- Building a game loop with replay functionality

---

## 👤 Author

**Anubhav Srivastava**  
[GitHub](https://github.com/asgeek96) · [LinkedIn](https://www.linkedin.com/in/asgeek)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
