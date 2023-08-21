import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println("The number is even");
        }
            else {
            System.out.println("The number is odd ");

        }
        }
    }

///WAP to print yes only if the no is even.
