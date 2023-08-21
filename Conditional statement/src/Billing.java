import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your order");
        int order= sc.nextInt();
        System.out.println("Enter the quantity");
        int quantity= sc.nextInt();

        if(order==1){
            System.out.println("Noodles is ordered with quantity:"+quantity);
            int price=150;
            int bill=price * quantity;
            System.out.println("Your bill is "+bill);
        }
        else if(order==2){
            System.out.println("Pizza is ordered with quantity:"+quantity);
            int price=170;
            int bill=price * quantity;
        }
        else if(order==3){
            System.out.println("Sausage is ordered with quantity:"+quantity);
            int price=120;
            int bill=price * quantity;
            System.out.println("Your bill is "+bill);
        }

    }

}
