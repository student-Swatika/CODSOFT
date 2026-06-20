import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int secretNumber = r.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct Guess!");
                System.out.println("Total Attempts: " + attempts);
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
        }
    }
}