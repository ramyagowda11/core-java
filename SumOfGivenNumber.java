public class SumOfGivenNumber {
    public static void getSumOfNumber(int number){
        int i=0;
        int sum=0;
        while(i<=number){
            sum=sum+i;
            i++;
        }
        System.out.println("sum:"+sum);
    }
    
}
