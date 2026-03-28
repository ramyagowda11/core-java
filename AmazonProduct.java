public class AmazonProduct {
    public static void welcomeUser(){
        System.out.println("welcme to amazon shopping");
    }
    public static void showProductName(String name){
        System.out.println("product name:"+name);
    }
    public static int getDiscount(int price){
        int discount=price/10;
        return discount;
    }
    public static int getDelivaryDays(){
        int days=5;
        return days;
    }
    
}
