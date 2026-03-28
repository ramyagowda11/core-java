public class AmazonCart {

    // 1. void, no parameter
    public static void showCartMessage() {
        System.out.println("Your cart is ready!");
    }

    // 2. void, with parameter
    public static void addItemToCart(String item) {
        System.out.println("Added to cart: " + item);
    }

    // 3. return int, with parameter
    public static int calculateCartTotal(int price) {
        int total = price * 2; 
        return total;
    }

    // 4. return int, no parameter
    public static int getCartItemCount() {
        int count = 5;
        return count;
    }
}
    

