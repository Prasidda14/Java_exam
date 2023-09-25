import java.util.Random;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        String Username = "Prasidda";
        String Password = "Java_Exam";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username");
        String your_Username = sc.next();
        System.out.println("Enter you Password");
        String your_Password = sc.next();
        if (Username.equals(Username)) {
            int Number = 0;
            if (Password.equals(Password)) {
                System.out.println("You are in");
                System.out.println("1)Greatest Number\n 2)Calculator\n3)Result with 3 Grades\n4)Guessing Game");
                System.out.println("Enter the Number");
                Number = sc.nextInt();

                if (Number == 1) {
                    System.out.println("Welcome to greatest number game");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the first Number");
                    double num1 = scanner.nextDouble();

                    System.out.println("Enter the second Number");
                    double num2 = scanner.nextDouble();

                    if (num1 > num2) {
                        System.out.println("The Greater number is" + num1);
                    } else if (num2 > num1) {
                        System.out.println("The Greater number is" + num2);
                    } else
                        System.out.println("Both number are equal");

                }
                sc.close();
            }

            if (Number == 2) {
                System.out.println("Welcome to Calculator");
                Scanner scanner = new Scanner(System.in);
                float firstNumber = 0;
                System.out.println("Enter first Number");
                firstNumber = scanner.nextFloat();
                float secondNumber = 0;
                System.out.println("Enter second Number");
                secondNumber = scanner.nextFloat();
                char operator = 0;
                switch (operator) {
                    case '+':
                        double result = firstNumber + secondNumber;
                        System.out.println("The sum of " + firstNumber + secondNumber + "is" + result);
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        System.out.println("The subtraction of " + firstNumber + secondNumber + "is" + result);
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        System.out.println("The product of " + firstNumber + secondNumber + "is" + result);
                        break;
                    default:
                        System.out.println("Invalid Operator");

                }
                if (Number == 3) {
                    System.out.println("Welcome to results");
                    Scanner scanner1 = new Scanner(System.in);
                    int total_marks = 200;
                    System.out.println("Enter the marks of English");
                    int a = sc.nextInt();
                    System.out.println("Enter the marks of Nepali");
                    int b = sc.nextInt();
                    double total_obtained_marks = a + b;
                    double average = (total_obtained_marks / total_marks) * 100;
                    if (average >= 90 && average <= 100)
                        System.out.println("Your grade is A+");
                    else if (average >= 80 && average <= 89) {
                        System.out.println("Your grade is A");
                    } else if (average < 40) {
                        System.out.println("Your grade is NG");

                    }

                }
            }

            int choice = 0;
            int rand_number = 0;
            if (Number == 4) {
                System.out.println("Welcome to Guessing Game");
                Random number = new Random();
                Scanner xyz = new Scanner(System.in);
                rand_number = number.nextInt(10);
                System.out.println("Enter you Number");
                choice = xyz.nextInt();
                if (choice < 0 || choice > 9) ;
                System.out.println("Your Entered the wrong number");
            } else {
                if (choice == rand_number) {
                    System.out.println("The number you guessed is correct"+ rand_number);
                } else if (choice != rand_number) {
                    System.out.println("You were Wrong the number is"+rand_number);
                }
            }

        }
        else {
            System.out.println("Invalid");

        }
        sc.close();


    }
}
