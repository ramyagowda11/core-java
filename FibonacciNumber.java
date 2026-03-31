public class FibonacciNumber {
    public static void getFibonacciNumber() {

        int a = 0, b = 1;

        for(int i = 1; i <= 10; i++) {
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }

    }

    
}
