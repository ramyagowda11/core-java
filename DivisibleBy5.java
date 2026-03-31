public class DivisibleBy5 {
    public static void getNumber(int num){
        int i = 1;

        while(i <= num) {
            if(i % 5 == 0)
                System.out.println(i);

            i++;
        }
    }
}
