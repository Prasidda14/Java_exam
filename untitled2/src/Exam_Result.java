import java.util.Scanner;

public class Exam_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_marks = 200;
        System.out.println("Enter the marks of English");
        int a = sc.nextInt();
        System.out.println("Enter the marks of Nepali");
        int b = sc.nextInt();
        double total_obtained_marks = a + b;
        double average = (total_obtained_marks / total_marks) * 100;


        if (average >= 90 && average <= 100) {
            System.out.println("Your grade is: A+");
        } else if (average >= 80 && average <= 89) {
            System.out.println("Your grade is: A");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Your grade is: B+");
        } else if (average >= 60 && average <= 69) {
            System.out.println("Your grade is: B");
        } else if (average >= 50 && average <= 59) {
            System.out.println("Your grade is: C+");
        } else if (average >= 40 && average <= 49) {
            System.out.println("Your grade is: C");
        } else if (average < 40) {
            System.out.println("Your grade is: NG");



        }

    }
}
