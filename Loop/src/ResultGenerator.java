import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subject you want");
        int num = sc.nextInt();
        double Sum=0;
        for (int i = 1; i <=num; i++) {
            System.out.println("Enter the marks in subject"+i);
            Sum+= sc.nextInt();

        }
        int total_mark = num * 100;
        System.out.println(Sum);
        double total_percentage = (Sum /total_mark)*100;
        if (total_percentage >= 90 && total_percentage <=100){
            System.out.println("you have got A+");
        } else if (total_percentage >= 80 && total_percentage <=90) {
            System.out.println("you have got A");
        }
        else if (total_percentage >= 70 && total_percentage <=80) {
            System.out.println("you have got B+");
        }
        else if (total_percentage >= 60 && total_percentage <=70) {
            System.out.println("you have got B");
        }
        else if (total_percentage >= 50 && total_percentage <=60) {
            System.out.println("you have got C+");
        }
        else if (total_percentage >= 40 && total_percentage <=50) {
            System.out.println("you have got C");
        }
        else{
            System.out.println("You are fail");
        }
    }
    }

