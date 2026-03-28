public class AmazonOrderRunner {
    public static void main(String[] order){
        AmazonOrder.showOrderStatus();
        AmazonOrder.showCustomerName("varun gowda");
        int total=AmazonOrder.calculateTotalPrice(250);
        System.out.println("total order price:"+total);
        int orderId=AmazonOrder.getOrderNumber();
        System.out.println("order id:"+orderId);
    }
    
}
