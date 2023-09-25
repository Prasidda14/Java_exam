import java.util.Random;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "Prasidda Khadka";
        String Password = "Java_Exam";
        System.out.println("Enter your Username");
        Username = scanner.next();
        System.out.println("Enter you Password");
        Password = scanner.next();
        if (Username.equals(Username)) {
            int Number = 0;
            if (Password.equals(Password)) {
                System.out.println("You are in");
                System.out.println("1)Greatest Number\n 2)Calculator\n3)Result with 3 Grades\n4)Guessing Game");
                System.out.println("Choose the Number");
                Number = scanner.nextInt();

                if (Number == 1) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter the first Number");
                    int num1 = scanner.nextInt();

                    System.out.println("Enter the second Number");
                    int num2 = scanner.nextInt();

                    if (num1 > num2) {
                        System.out.println("The Greater number is" + num1);
                    } else if (num2 > num1) {
                        System.out.println("The Greater number is" + num2);
                    } else
                        System.out.println("Both number are equal");

                }
                scanner.close();
            }

            if (Number == 2) {
                System.out.println("Calculator");
                Scanner scanner3 = new Scanner(System.in);
                float firstNumber = 0;
                System.out.println("Enter first Number");
                firstNumber = scanner.nextFloat();
                float secondNumber = 0;
                System.out.println("Enter second Number");
                secondNumber = scanner.nextFloat();
                char operator = 0;
                switch (operator) {
                    case '+':
                        System.out.println(firstNumber+"+"+secondNumber);
                        System.out.println(firstNumber+secondNumber);
                        break;
                    case '-':
                        System.out.println(firstNumber+"-"+secondNumber);
                        System.out.println(firstNumber-secondNumber);

                        break;
                    case '*':
                        System.out.println(firstNumber+"*"+secondNumber);
                        System.out.println(firstNumber*secondNumber);
                        break;
                    case '/':
                        System.out.println(firstNumber+"/"+secondNumber);
                        System.out.println(firstNumber/secondNumber);
                        break;

                    default:
                        System.out.println("Invalid Operator");

                }
                if (Number == 3) {
                    Scanner sc = new Scanner(System.in);
                    double total_marks = 200;
                    System.out.println("Enter the marks of English");
                    double a = sc.nextInt();
                    System.out.println("Enter the marks of Nepali");
                    double b = sc.nextInt();
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
            double choice = 0;
            double rand_number = 0;
            if (Number == 4) {
                System.out.println("Guessing Game");
                Random number = new Random();
                Scanner xyz = new Scanner(System.in);
                rand_number = number.nextInt(10);
                System.out.println("Enter you Number");
                choice = xyz.nextInt();
                if (choice < 0 || choice > 9) ;
                System.out.println("Your Entered number is wrong");
            } else {
                if (choice == rand_number) {
                    System.out.println("You are Correct"+ rand_number);
                } else if (choice != rand_number) {
                    System.out.println("You were Wrong.The number is"+rand_number);
                }
            }

        }
        else {
            System.out.println("Invalid");

        }
        scanner.close();


    }
}
