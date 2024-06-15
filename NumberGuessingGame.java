import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    NumberGuessingGame() {
    }

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain;
        do {
            ++rounds;
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean isCorrect = false;
            System.out.println("\nRound " + rounds + ":");
            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ". You have " + maxAttempts + " attempts.");

            while(attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");

                int guess;
                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException var14) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                ++attempts;
                if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    if (guess <= targetNumber) {
                        System.out.println("Congratulations! You guessed the correct number.");
                        ++score;
                        isCorrect = true;
                        break;
                    }

                    System.out.println("Too high!");
                }
            }

            if (!isCorrect) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        } while(playAgain);

        System.out.println("\nGame Over!");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Score: " + score);
        scanner.close();
    }
}
