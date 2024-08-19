// Michael Roy

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class GuessTheWord {

    // Method to scramble the word
    public static String scrambleWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        StringBuilder scrambledWord = new StringBuilder();
        for (String letter : letters) {
            scrambledWord.append(letter);
        }
        return scrambledWord.toString();
    }

    public static void main(String[] args) {
        // Array of words for the game
        String[] words = {"java", "computer", "programming", "game", "developer", "keyboard", "mouse"};

        // Select a random word from the list
        String word = words[(int) (Math.random() * words.length)];

        // Scramble the selected word
        String scrambledWord = scrambleWord(word);

        // Start the game
        System.out.println("\nWelcome to 'Guess The Word'");
        System.out.println("Try to guess the word!");
        System.out.println("Scrambled word: " + scrambledWord + "\n");

        Scanner scanner = new Scanner(System.in);
        String userGuess;

        // Loop until the user guesses correctly
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextLine();

            if (userGuess.equalsIgnoreCase(word)) {
                System.out.println("\nCongratulations! You guessed the word correctly!");
            } else {
                System.out.println("\nWrong guess. Try again!");
            }
        } while (!userGuess.equalsIgnoreCase(word));

        scanner.close();
    }
}
