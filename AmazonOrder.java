public class AmazonOrder {
    public static void showOrderStatus(){
        System.out.println("get online order status");
    }
    public static void showCustomerName(String name){
        System.out.println("customer name:"+name);
    }
    public static int calculateTotalPrice(int price){
        int total=price+30;
        return total;
    }
    public static int getOrderNumber(){
        int orderId=12345;
        return orderId;
    }
    
}
