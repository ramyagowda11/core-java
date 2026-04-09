public class ZomatoRunner{
	public static void main(String []args){
		Zomato zom=new Zomato();
		double price=zom.getPriceByFoodName("veg kasturi");
		System.out.println("food price:"+price);
        double totalAmount=zom.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount);
        double finalAmount=zom.getDiscountByTotalPrice(price,5);
        System.out.println("total amount after discount:"+finalAmount);
        System.out.println("---------");


        Zomato zom1=new Zomato();
		double price1=zom1.getPriceByFoodName("vag laziz");
		System.out.println("food price:"+price1);
        double totalAmount1=zom1.getTotalAmountByPriceAndQuantity(price,4);
		System.out.println("total price:"+totalAmount1);
        double finalAmount1=zom1.getDiscountByTotalPrice(price,10);
        System.out.println("total amount after discount:"+finalAmount1);
        System.out.println("---------");


        Zomato zom2=new Zomato();
        double price2=zom2.getPriceByFoodName("chana masala");
		System.out.println("food price:"+price2);
        double totalAmount2=zom2.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount2);
        double finalAmount2=zom2.getDiscountByTotalPrice(price,15);
        System.out.println("total amount after discount:"+finalAmount2);
        System.out.println("---------");


        Zomato zom3=new Zomato();
        double price3=zom3.getPriceByFoodName("veg diwani handi");
		System.out.println("food price:"+price3);
        double totalAmount3=zom3.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount3);
        double finalAmount3=zom3.getDiscountByTotalPrice(price,20);
        System.out.println("total amount after discount:"+finalAmount3);
        System.out.println("---------");


        Zomato zom4=new Zomato();
        double price4=zom4.getPriceByFoodName("butter roti");
		System.out.println("food price:"+price4);
        double totalAmount4=zom4.getTotalAmountByPriceAndQuantity(price,1);
		System.out.println("total price:"+totalAmount4);
        double finalAmount4=zom4.getDiscountByTotalPrice(price,25);
        System.out.println("total amount after discount:"+finalAmount4);
        System.out.println("---------");
       
	}

}
