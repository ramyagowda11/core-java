public class Deliveroo {
     public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("french fry"==foodName){
			price=70;
		}else if("panipuri"==foodName){
			price=30;
		}else if("momos"==foodName){
			price=60;
		}else if("veg roll"==foodName){
			price=60;
		}else if("samosa"==foodName){
			price=30;
		}else if("pakoda"==foodName){
			price=250;
		}else if("cake"==foodName){
			price=300;
		}else if("sandveg"==foodName){
			price=80;
		}else if("pizza"==foodName){
			price=60;
		}else if("berger"==foodName){
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
