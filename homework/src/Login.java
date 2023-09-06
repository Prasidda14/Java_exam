import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = "prasidda@gmail.com";
        String Password = "Prasidda@123";
        String user_name;
        System.out.println("Enter your Name");
        user_name = scanner.nextLine();
        String password;
        System.out.println("Enter your Password");
        password = scanner.nextLine();
        if (user_name.equals(user_name) && password.equals(password)){
            System.out.println("You are in");

        }
        else {
            System.out.println("Invalid Password");
        }
    }
}


