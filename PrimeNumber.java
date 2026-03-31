public class PrimeNumber {
    public static void getPrintNumbers() {

        int num = 9;
        boolean prime = true;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
    
}
