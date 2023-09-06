import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1,6,7:
                System.out.println("Weekend");
                break;
            case 2,3,4,5:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
