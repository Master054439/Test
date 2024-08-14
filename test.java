import java.util.Scanner;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int input;
        do{
            System.out.println("Guess a number between 1 and 10:");
            input = scanner.nextInt();
            if(input == randomNumber){
                System.out.println("You guessed it!");
            }
        } while (input != randomNumber);
        scanner.close();
    }
}