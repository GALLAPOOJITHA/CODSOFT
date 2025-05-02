	package firstclass;
	import java.util.*;

	  public  class task1 {
		public class NumberGuessingGame {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int lowerBound = 1;
		        int upperBound = 100;
		        int score = 0;
		        boolean playAgain = true;

		        System.out.println("Welcome to the Number Guessing Game!");

		        while (playAgain) {
		            int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		            int attempts = 0;
		            int maxAttempts = 7;
		            boolean guessedCorrectly = false;

		            System.out.println("\nI'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
		            System.out.println("You have " + maxAttempts + " attempts to guess it.");

		            while (attempts < maxAttempts && !guessedCorrectly) {
		                System.out.print("Enter your guess: ");
		                int userGuess = scanner.nextInt();
		                scanner.nextLine(); 

		                attempts++;

		                if (userGuess == generatedNumber) {
		                    System.out.println("Congratulations! You guessed the number " + generatedNumber + " correctly in " + attempts + " attempts.");
		                    score++;
		                    guessedCorrectly = true;
		                } else if (userGuess < generatedNumber) {
		                    System.out.println("Too low! Try again.");
		                } else {
		                    System.out.println("Too high! Try again.");
		                }
		            }

		            if (!guessedCorrectly) {
		                System.out.println("\nYou ran out of attempts! The number was " + generatedNumber + ".");
		            }

		            System.out.print("Do you want to play again? (yes/no): ");
		            String playAgainInput = scanner.nextLine().toLowerCase();
		            if (!playAgainInput.equals("yes")) {
		                playAgain = false;
		            }
		        }

		        System.out.println("\nThanks for playing! Your final score is: " + score);
		        scanner.close();
		    }
		}
	

}
