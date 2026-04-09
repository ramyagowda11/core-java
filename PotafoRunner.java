public class PotafoRunner {
   
		public static void main(String []args){
		Potafo pota=new Potafo();
		double price=pota.getPriceByFoodName("onion paneer dosa");
		System.out.println("food price:"+price);
        double totalAmount=pota.getTotalAmountByPriceAndQuantity(price,3);
		System.out.println("total price:"+totalAmount);
        double finalAmount=pota.getDiscountByTotalPrice(price,3);
        System.out.println("total amount after discount:"+finalAmount);
        System.out.println("---------");


        Potafo pota1=new Potafo();
		double price1=pota1.getPriceByFoodName("dal vada");
		System.out.println("food price:"+price1);
        double totalAmount1=pota1.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount1);
        double finalAmount1=pota1.getDiscountByTotalPrice(price,4);
        System.out.println("total amount after discount:"+finalAmount1);
        System.out.println("---------");


        Potafo pota2=new Potafo();
        double price2=pota2.getPriceByFoodName("paper plan dosa");
		System.out.println("food price:"+price2);
        double totalAmount2=pota2.getTotalAmountByPriceAndQuantity(price,1);
		System.out.println("total price:"+totalAmount2);
        double finalAmount2=pota2.getDiscountByTotalPrice(price,5);
        System.out.println("total amount after discount:"+finalAmount2);
        System.out.println("---------");


        Potafo pota3=new Potafo();
        double price3=pota3.getPriceByFoodName("plan dosa");
		System.out.println("food price:"+price3);
        double totalAmount3=pota3.getTotalAmountByPriceAndQuantity(price,5);
		System.out.println("total price:"+totalAmount3);
        double finalAmount3=pota3.getDiscountByTotalPrice(price,6);
        System.out.println("total amount after discount:"+finalAmount3);
        System.out.println("---------");


        Potafo pota4=new Potafo();
        double price4=pota4.getPriceByFoodName("butter masala dosa");
		System.out.println("food price:"+price4);
        double totalAmount4=pota4.getTotalAmountByPriceAndQuantity(price,2);
		System.out.println("total price:"+totalAmount4);
        double finalAmount4=pota4.getDiscountByTotalPrice(price,15);
        System.out.println("total amount after discount:"+finalAmount4);
        System.out.println("---------");
       
	}

}
