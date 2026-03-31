public class IceCreamRunner {
    public static void main(String[] args){
        IceCream iceCream1 =new IceCream();
        iceCream1.getIceCreamMenuDetails();
        System.out.println("--------");
        IceCream iceCream2 =new IceCream();
        iceCream2.displayMenu("vanilla");
        iceCream2.displayMenu("Apple juice");
        iceCream2.displayMenu("mango");
        iceCream2.displayMenu("pista");
        System.out.println("--------");
        IceCream iceCream3 =new IceCream();
        iceCream3.displayMenu("mango ");
        iceCream3.displayMenu("kesar");
        iceCream3.displayMenu("strawberry ");
        iceCream3.displayMenu("black currant");
        System.out.println("--------");
        IceCream iceCream4 =new IceCream();
        iceCream4.displayMenu("caramel");
        iceCream4.displayMenu("chocolate");
        iceCream4.displayMenu("strawberry ");
        iceCream4.displayMenu("Banana juice");
        System.out.println("--------");
        IceCream iceCream5 =new IceCream();
        iceCream5.displayMenu("cookies and cream");
        iceCream5.displayMenu("vanilla");
        iceCream5.displayMenu("butterscotch");
        iceCream5.displayMenu("mango");
        System.out.println("--------");
        
    }
    
}
