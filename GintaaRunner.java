class GintaaRunner{
    public static void main(String []args){
		Gintaa gin=new Gintaa();
		double price=gin.getPriceByFoodName("chilli garlic rice");
		System.out.println("food price:"+price);
        double totalAmount=gin.getTotalAmountByPriceAndQuantity(price,1);
		System.out.println("total price:"+totalAmount);
        double finalAmount=gin.getDiscountByTotalPrice(price,2);
        System.out.println("total amount after discount:"+finalAmount);
        System.out.println("---------");


        Gintaa gin1=new Gintaa();
		double price1=gin1.getPriceByFoodName("paneer rice");
		System.out.println("food price:"+price1);
        double totalAmount1=gin1.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount1);
        double finalAmount1=gin1.getDiscountByTotalPrice(price,3);
        System.out.println("total amount after discount:"+finalAmount1);
        System.out.println("---------");


        Gintaa gin2=new Gintaa();
        double price2=gin2.getPriceByFoodName("chicken manchurian rice");
		System.out.println("food price:"+price2);
        double totalAmount2=gin2.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount2);
        double finalAmount2=gin2.getDiscountByTotalPrice(price,14);
        System.out.println("total amount after discount:"+finalAmount2);
        System.out.println("---------");


        Gintaa gin3=new Gintaa();
        double price3=gin3.getPriceByFoodName("steam veg momos");
		System.out.println("food price:"+price3);
        double totalAmount3=gin3.getTotalAmountByPriceAndQuantity(price,4);
		System.out.println("total price:"+totalAmount3);
        double finalAmount3=gin3.getDiscountByTotalPrice(price,15);
        System.out.println("total amount after discount:"+finalAmount3);
        System.out.println("---------");


        Gintaa gin4=new Gintaa();
        double price4=gin4.getPriceByFoodName("gravy veg momos");
		System.out.println("food price:"+price4);
        double totalAmount4=gin4.getTotalAmountByPriceAndQuantity(price,5);
		System.out.println("total price:"+totalAmount4);
        double finalAmount4=gin4.getDiscountByTotalPrice(price,18);
        System.out.println("total amount after discount:"+finalAmount4);
        System.out.println("---------");
       
	}

}
