public class Count {
    public static void main(String[] args) {
        int evensum = 0;
        int evencount =  0;
        int oddsum = 0;
        int oddcount = 0;
        for (int i = 1; i < 10; i++){
            if (i % 2==0){
                evensum +=1;
                evencount++;
            }
            else {
                oddcount++;
                oddsum +=1;
            }
            if (evencount>oddcount){
                System.out.println("Evencount is Greater");
            }
            else System.out.println("Oddcount is Greater");
            if (evensum>oddsum){
                System.out.println("Oddcount is Greater");
            }
            else System.out.println("Oddsum is Greater");
        }
    }
}

