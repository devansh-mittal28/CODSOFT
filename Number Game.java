import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        do {
            System.out.println("Starting a new round! You have 5 attempts to guess the number between 1 and 100.");
            int numberToGuess = random.nextInt(100) + 1;
            boolean guessedCorrectly = false;

            for (int attempts = 1; attempts <= 5; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number.");
                    score += (6 - attempts);
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've used all attempts! The correct number was " + numberToGuess + ".");
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play another round? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
