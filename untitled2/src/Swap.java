public class Swap {
    public static void main(String[] args) {
        int num1,num2,x;
        num1=1;
        num2=2;
        System.out.println("initially");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);

        x=num1;
        num1=num2;
        num2=x;


        System.out.println("finally");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}
