import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        double NRP , usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NRP :");
        NRP = sc.nextDouble();
        usd=(NRP/132.29);
        System.out.println("The amount is :" + usd);

    }
}
