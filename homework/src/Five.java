import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        float fahrenhiet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tempreature in fahrenhiet = ");
        fahrenhiet = sc.nextFloat();
        float celsius = (fahrenhiet - 32) *5/9;
        System.out.println("Fahrenhiet "+ fahrenhiet+"into celsius is " + celsius);
    }
}
