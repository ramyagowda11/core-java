public class AmazonProductRunner {
    public static void main(String[] args){
        AmazonProduct.welcomeUser();
        AmazonProduct.showProductName("cloth");
        int discount=AmazonProduct.getDiscount(2000);
        System.out.println("product discount:"+discount);
        int days=AmazonProduct.getDelivaryDays();
        System.out.println("delivery days:"+days);
    }
    
}
