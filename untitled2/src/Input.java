import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Take input from user and print

        //Declaring variable
        String name;
        //Create a scanner
        Scanner sc = new Scanner(System.in);
        //Just display message
        System.out.println("Enter the name");
        //Taking input from user and storing it
        name = sc.next();
        System.out.println("The name is"+name);
    }
}
