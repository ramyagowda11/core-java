public class Factorial {
    public static void getFactorial(int num) {

        
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
    
}
