import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Only100 Restaurant");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Menu");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tItems\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRate");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t1)Chicken Pizza\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2)Chicken Momo\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3)Chicken Burger\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t4)Chicken Sausage\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t5)Chicken Biryani\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t6)Chicken Chowmien\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100");
        double totalbill = 0;
        System.out.println("Enter the no of  Item");
        int noofitems = sc.nextInt();
        for (int i = 1; i <= noofitems; i++) {
            int selectitems = 0;
            System.out.println("Enter food you want to enter : ");
            selectitems = sc.nextInt();
            System.out.println("Enter quantity you want to have : ");
            int quantity = sc.nextInt();
            totalbill = totalbill + (100 * quantity);
        }
        double dis = totalbill - (0.1 * totalbill);
        double vat = totalbill + (0.13 * totalbill);
        System.out.println(vat);
    }
}
