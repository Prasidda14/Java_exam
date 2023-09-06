import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Firstnumber = 0;
        System.out.println("Enter first number");
        Firstnumber = scanner.nextFloat();

        double Secondnumber = 0;
        System.out.println("Enter second number");
        Secondnumber = scanner.nextFloat();

        char operator = 0;
        System.out.print("Enter operator for calculate : ");
        operator = scanner.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = Firstnumber + Secondnumber;
                System.out.println("The sum of " + Firstnumber + " " + Secondnumber + " is " + result);
                break;
            case '-':
                result = Firstnumber - Secondnumber;
                System.out.println("The subtraction of " + Firstnumber + " " + Secondnumber + " is " + result);
                break;
            case '*':
                result = Firstnumber * Secondnumber;
                System.out.println("The product of " + Firstnumber + " " + Secondnumber + " is " + result);
                break;
            case '/':
                result = Firstnumber / Secondnumber;
                System.out.println("The division of " + Firstnumber + " " + Secondnumber + " is " + result);
                break;


        }
    }
}