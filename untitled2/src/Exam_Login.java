import java.util.Scanner;

public class Exam_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "prasiddakhadka@gmail.com";
        String Password = "Java.Exam";
        String user_name;
        System.out.println("Enter your Username:\n");
        user_name = scanner.nextLine();
        String password;
        System.out.println("Enter your Password:\n");
        password = scanner.nextLine();
        if (user_name.equals(user_name) && password.equals(password)) {
            System.out.println("You are in");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
