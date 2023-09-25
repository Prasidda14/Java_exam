import java.util.Scanner;

public class Password {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    String username = "Prasidda";
    String password = "PrasiddaKhadka";

        for (int tries = 1; tries <= 5; tries++) {
        System.out.println("Enter your Username:");
        String inputUsername = scanner.next();
        System.out.println("Enter Your Password:");
        String inputPassword = scanner.next();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Access Granted");
            System.out.println("You have logged in" + username);
            break;
        } else {
            System.out.println("Incorrect Username or Password. Please Try Again.");
            if (tries < 5) {
                System.out.println("You have " + (5 - tries) + " tries left.");
            } else {
                System.out.println("You have exceeded the maximum number of tries. Access Denied.");
            }
        }
    }
}

}