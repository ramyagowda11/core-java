public class DeliverooRunner {
    public static void main(String []args){
		Deliveroo item=new Deliveroo();
		double price=item.getPriceByFoodName("panipuri");
		System.out.println("food price:"+price);
        double totalAmount=item.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount);
        double finalAmount=item.getDiscountByTotalPrice(price,13);
        System.out.println("total amount after discount:"+finalAmount);
        System.out.println("---------");


        Deliveroo item1=new Deliveroo();
		double price1=item1.getPriceByFoodName("veg roll");
		System.out.println("food price:"+price1);
        double totalAmount1=item1.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount1);
        double finalAmount1=item1.getDiscountByTotalPrice(price,11);
        System.out.println("total amount after discount:"+finalAmount1);
        System.out.println("---------");


        Deliveroo item2=new Deliveroo();
        double price2=item2.getPriceByFoodName("pakoda");
		System.out.println("food price:"+price2);
        double totalAmount2=item2.getTotalAmountByPriceAndQuantity(price,1);
		System.out.println("total price:"+totalAmount2);
        double finalAmount2=item2.getDiscountByTotalPrice(price,12);
        System.out.println("total amount after discount:"+finalAmount2);
        System.out.println("---------");


        Deliveroo item3=new Deliveroo();
        double price3=item3.getPriceByFoodName("sandveg");
		System.out.println("food price:"+price3);
        double totalAmount3=item3.getTotalAmountByPriceAndQuantity(price,5);
		System.out.println("total price:"+totalAmount3);
        double finalAmount3=item3.getDiscountByTotalPrice(price,13);
        System.out.println("total amount after discount:"+finalAmount3);
        System.out.println("---------");


        Deliveroo item4=new Deliveroo();
        double price4=item4.getPriceByFoodName("berger");
		System.out.println("food price:"+price4);
        double totalAmount4=item4.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount4);
        double finalAmount4=item4.getDiscountByTotalPrice(price,25);
        System.out.println("total amount after discount:"+finalAmount4);
        System.out.println("---------");
       
	}

}
