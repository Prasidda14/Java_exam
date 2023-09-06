import java.util.Random;
import java.util.Scanner;

public class Exam_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
        int inputNumber = 0;
        System.out.println("Enter any number from 1 to 10");
        inputNumber = scanner.nextInt();
        if (inputNumber == rand_int1){
            System.out.println("You have won the game of Guessing numbers");
        }
        else {System.out.println("Sorry you lost");
        }
    }
}
