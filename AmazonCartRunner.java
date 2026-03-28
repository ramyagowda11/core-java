public class AmazonCartRunner {
    public static void main(String[] args) {

        // 1. void, no parameter
        AmazonCart.showCartMessage();

        // 2. void, with parameter
        AmazonCart.addItemToCart("Apple AirPods");

        // 3. return int, with parameter
        int total = AmazonCart.calculateCartTotal(3000);
        System.out.println("Cart total: " + total);

        // 4. return int, no parameter
        int count = AmazonCart.getCartItemCount();
        System.out.println("Items in cart: " + count);
    }
    
}
