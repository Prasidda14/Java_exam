import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = inputScanner.nextInt();
        System.out.println("Enter second number");
        int num2 = inputScanner.nextInt();
        System.out.println("Enter the operator");
        String operator=inputScanner.next();

        double result=0;

        switch (operator){
            case "+":
                result = num1+num1;
                break;
            case "-":
                result = num1-num1;
                break;
            case "*":
                result = num1*num1;
                break;
            case "/":
                result = num1/num1;
                break;

            default:
                System.out.println("Invalid");
                break;
        }

    }
}
