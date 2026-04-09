public class Glovo {
     public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("chicken curry"==foodName){
			price=130;
		}else if("chicken 65"==foodName){
			price=140;
		}else if("barbique"==foodName){
			price=60;
		}else if("savarma"==foodName){
			price=70;
		}else if("leg piece"==foodName){
			price=30;
		}else if("tanduri chicken"==foodName){
			price=250;
		}else if("chicken gulli"==foodName){
			price=300;
		}else if("chicken lalipop"==foodName){
			price=80;
		}else if("chicken fried rice"==foodName){
			price=60;
		}else if("chicken tikka"==foodName){
			price=90;
		}else{
			price=0.0;
		}
		System.out.println("end of getPriceByFoodName");
		return price;
	}
	public double getTotalAmountByPriceAndQuantity(double price,int quantity){
		System.out.println("invoking get totalamount by price and quantity");
		double totalAmount=0.0;
		totalAmount=price*quantity;
		return totalAmount;
	}
	public double getDiscountByTotalPrice(double totalAmount,double discountPercent){
		System.out.println("invoking get discount by total price");
		double discount=(totalAmount*discountPercent)/100;
		double finalAmount=totalAmount-discount;
		return finalAmount;
        
	}

}