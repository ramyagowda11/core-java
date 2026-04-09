class UberEatsRunner{
	public static void main(String []args){
		UberEats uber=new UberEats();
		double price=uber.getPriceByFoodName("biryani");
		System.out.println("food price:"+price);
        double totalAmount=uber.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount);
        double finalAmount=uber.getDiscountByTotalPrice(price,10);
        System.out.println("total amount after discount:"+finalAmount);
        System.out.println("---------");


        UberEats uber1=new UberEats();
		double price1=uber.getPriceByFoodName("crab fry");
		System.out.println("food price:"+price1);
        double totalAmount1=uber1.getTotalAmountByPriceAndQuantity(price,4);
		System.out.println("total price:"+totalAmount1);
        double finalAmount1=uber1.getDiscountByTotalPrice(price,20);
        System.out.println("total amount after discount:"+finalAmount1);
        System.out.println("---------");


        UberEats uber2=new UberEats();
        double price2=uber2.getPriceByFoodName("button biryani");
		System.out.println("food price:"+price2);
        double totalAmount2=uber2.getTotalAmountByPriceAndQuantity(price,1);
		System.out.println("total price:"+totalAmount2);
        double finalAmount2=uber2.getDiscountByTotalPrice(price,5);
        System.out.println("total amount after discount:"+finalAmount2);
        System.out.println("---------");


        UberEats uber3=new UberEats();
        double price3=uber3.getPriceByFoodName("chicken kabab");
		System.out.println("food price:"+price3);
        double totalAmount3=uber.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount3);
        double finalAmount3=uber.getDiscountByTotalPrice(price,30);
        System.out.println("total amount after discount:"+finalAmount3);
        System.out.println("---------");


        UberEats uber4=new UberEats();
        double price4=uber4.getPriceByFoodName("butter roti");
		System.out.println("food price:"+price4);
        double totalAmount4=uber4.getTotalAmountByPriceAndQuantity(price,4);
		System.out.println("total price:"+totalAmount4);
        double finalAmount4=uber.getDiscountByTotalPrice(price,15);
        System.out.println("total amount after discount:"+finalAmount4);
        System.out.println("---------");
       
	}

}