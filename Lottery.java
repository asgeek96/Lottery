import java.util.Random;
import java.util.Scanner;

/**
 * Lottery Game - Console Application
 * 
 * The user picks 5 numbers and places a bet.
 * The computer generates 5 random numbers.
 * Winnings are based on how many numbers match.
 * 
 * Winning Table:
 *   0-1 matches → Lose
 *   2 matches   → 2x bet
 *   3 matches   → 30x bet (Mini Jackpot)
 *   4 matches   → 100x bet (Jackpot)
 *   5 matches   → 200x bet (Mega Jackpot)
 * 
 * @author Anubhav Srivastava
 */
public class Lottery {

    // Number range for random and user input (0 to MAX_NUMBER inclusive)
    static final int MAX_NUMBER = 13;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("     Welcome to Lottery!     ");
        System.out.println("=============================");

        while (true) {
            int[] userNumbers   = new int[5];
            int[] randomNumbers = new int[5];
            Random random = new Random();

            // --- Get user's 5 numbers ---
            System.out.println("\nEnter five numbers (0 to " + MAX_NUMBER + "):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                userNumbers[i] = sc.nextInt();
            }

            // --- Get betting amount ---
            System.out.print("\nEnter Betting Amount (₹): ");
            int bid = sc.nextInt();

            // --- Generate random numbers ---
            for (int i = 0; i < 5; i++) {
                randomNumbers[i] = random.nextInt(MAX_NUMBER + 1);
            }

            // --- Display comparison ---
            System.out.println("\n--- Results ---");
            System.out.println("Your Numbers \t Computer Numbers");
            System.out.println("---------------------------------");
            for (int i = 0; i < 5; i++) {
                System.out.println("    " + userNumbers[i] + "\t\t\t" + randomNumbers[i]);
            }

            // --- Count matches (any user number matches any computer number) ---
            int count = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (randomNumbers[i] == userNumbers[j]) {
                        count++;
                    }
                }
            }

            System.out.println("\nMatches: " + count);

            // --- Determine outcome ---
            if (count == 0 || count == 1) {
                System.out.println("😢 Sorry, you lost! Better luck next time.");
            } else if (count == 2) {
                bid = bid * 2;
                System.out.println("🎉 You Won!");
                System.out.println("Winning Amount: ₹" + bid);
            } else if (count == 3) {
                bid = bid * 30;
                System.out.println("🎉 Congratulations! You won the Mini Jackpot!");
                System.out.println("Winning Amount: ₹" + bid);
            } else if (count == 4) {
                bid = bid * 100;
                System.out.println("🏆 Congratulations! You won the Jackpot!");
                System.out.println("Winning Amount: ₹" + bid);
            } else if (count == 5) {
                bid = bid * 200;
                System.out.println("🚀 MEGA JACKPOT! You matched all 5 numbers!");
                System.out.println("Winning Amount: ₹" + bid);
            }

            // --- Play again prompt ---
            System.out.println("\nWant to play again?");
            System.out.println("  0 → Play Again");
            System.out.println("  1 → Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\nThanks for playing! Goodbye! 👋");
                break;
            }
        }

        sc.close();
    }
}
