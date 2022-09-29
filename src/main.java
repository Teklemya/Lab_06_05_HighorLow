import java.util.Random;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;

        while (true) {
            System.out.print("Enter your guess (1-10): ");

            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again.");
            } else {
                System.out.println("Nope! The number is lower. Guess again.");
            }
        }
    }
}