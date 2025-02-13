import java.util.Scanner;
import java.util.Random;

 class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = rand.nextInt(10) + 1;
        int userGuess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Game loop
        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;
            
            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (userGuess != numberToGuess);

        sc.close();
    }
}

