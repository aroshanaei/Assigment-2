import java.util.Scanner;

public class RandonNumberGuesser {

  
    public static void main (String args[]) {
       boolean guess = false; // Declares the variable true
        int guesnumb = 0;// decalre guess number
        final int lowges = 0;// final int for low 
        final int highgues = 101;//final int for high
        int randomNumber = RNG.rand();//uses rng class to generate a random number
        RNG.scan = new Scanner(System.in);
        System.out.println("Welcome to the Random Number Guessing Program!\nEnter your first guess");
        while (guess == false) {// uses while loop to repeat the questions
            guesnumb = RNG.scan.nextInt();
            System.out.println("Number of guesses is " + RNG.getCount());//print out the number of guesses
            if (RNG.inputValidation(guesnumb,lowges, highgues) == true) {// sets a condtion if the value is true it continues
                if (guesnumb == randomNumber) {// if the guessed number was eqaul to random then print out the condition 
                    System.out.println("Congratulations, you guessed correctly");
                    System.out.println("Try again? (yes or no)");// ask to if they wan to to try again
                    RNG.scan.nextLine();
                    if (RNG.scan.nextLine().equalsIgnoreCase("yes")) {// if their answer is yes co with the new contion with reseting the rand number
                        RNG.resetCount();
                        randomNumber = RNG.rand();
                        new RNG();
                        System.out.println("Enter your first guess");
                    } else {// end the program
                        System.out.println("Thanks for playing...");
                        System.out.println("Programmer: Arya Roshanaei");
                        guess = true;// and set the value to false so it stops looping
                    }
                } else {
                    if (guesnumb > randomNumber) {// set a contion if the guess is to high and for them to enter a lower a number
                        System.out.println("Your guess is too high");
                        System.out.println("Enter your next guess");
                    } else if (guesnumb < randomNumber) {// set a condition and say if the guess is to low and that they should print out a higher number 
                        System.out.println("Your guess is too low");
                        System.out.println("Enter your next guess");
                    }
                }
            } 
        }
        
    }

}