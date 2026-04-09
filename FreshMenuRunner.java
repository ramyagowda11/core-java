public class FreshMenuRunner {
    public static void main(String []args){
		Box8 item=new Box8();
		double price=item.getPriceByFoodName("egg homled");
		System.out.println("food price:"+price);
        double totalAmount=item.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount);
        double finalAmount=item.getDiscountByTotalPrice(price,13);
        System.out.println("total amount after discount:"+finalAmount);
        System.out.println("---------");


        Box8 item1=new Box8();
		double price1=item1.getPriceByFoodName("egg bonda");
		System.out.println("food price:"+price1);
        double totalAmount1=item1.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount1);
        double finalAmount1=item1.getDiscountByTotalPrice(price,11);
        System.out.println("total amount after discount:"+finalAmount1);
        System.out.println("---------");


        Box8 item2=new Box8();
        double price2=item2.getPriceByFoodName("egg masala");
		System.out.println("food price:"+price2);
        double totalAmount2=item2.getTotalAmountByPriceAndQuantity(price,1);
		System.out.println("total price:"+totalAmount2);
        double finalAmount2=item2.getDiscountByTotalPrice(price,12);
        System.out.println("total amount after discount:"+finalAmount2);
        System.out.println("---------");


        Box8 item3=new Box8();
        double price3=item3.getPriceByFoodName("egg dosa");
		System.out.println("food price:"+price3);
        double totalAmount3=item3.getTotalAmountByPriceAndQuantity(price,5);
		System.out.println("total price:"+totalAmount3);
        double finalAmount3=item3.getDiscountByTotalPrice(price,13);
        System.out.println("total amount after discount:"+finalAmount3);
        System.out.println("---------");


        Box8 item4=new Box8();
        double price4=item4.getPriceByFoodName("egg sambar");
		System.out.println("food price:"+price4);
        double totalAmount4=item4.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount4);
        double finalAmount4=item4.getDiscountByTotalPrice(price,25);
        System.out.println("total amount after discount:"+finalAmount4);
        System.out.println("---------");
       
	}

}