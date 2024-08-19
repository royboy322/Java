import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 0 and 100
        int targetNumber = random.nextInt(101);  // Random number from 0 to 100 inclusive

        // Initialize user's guess
        int userGuess = -1;  // Set to -1 initially to ensure the loop starts

        // Game instructions
        System.out.println("\nWelcome to GuessTheNumber!");
        System.out.println("I have selected a number between 0 and 100.");
        System.out.println("Try to guess the number!\n");

        // Loop until the user guesses the correct number
        while (userGuess != targetNumber) {
            // Prompt user for their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Compare the user's guess to the target number
            if (userGuess > targetNumber) {
                System.out.println("\nToo high! Try again.");
            } else if (userGuess < targetNumber) {
                System.out.println("\nToo low! Try again.");
            } else {
                System.out.println("\nCongratulations! You guessed the correct number: " + targetNumber);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
