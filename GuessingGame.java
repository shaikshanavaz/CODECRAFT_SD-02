package project;


	
	import java.util.Random;
	import java.util.Scanner;

	public class GuessingGame {

	    public static void main(String[] args) {
	        // Generate a random number between 1 and 100 (you can adjust the range)
	        Random random = new Random();
	        int secretNumber = random.nextInt(100) + 1;

	        // Initialize variables
	        Scanner scanner = new Scanner(System.in);
	        int guess;
	        int attempts = 0;
	        boolean guessedCorrectly = false;

	        System.out.println("Welcome to the Guessing Game!");
	        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

	        while (!guessedCorrectly) {
	            System.out.print("Enter your guess: ");
	            if (scanner.hasNextInt()) {
	                guess = scanner.nextInt();
	                attempts++;

	                if (guess < secretNumber) {
	                    System.out.println("Too low! Try again.");
	                } else if (guess > secretNumber) {
	                    System.out.println("Too high! Try again.");
	                } else {
	                    guessedCorrectly = true;
	                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a whole number.");
	                scanner.next(); // Consume the invalid input
	            }
	        }

	        scanner.close(); // Close the scanner to release resources
	    }
	} 


