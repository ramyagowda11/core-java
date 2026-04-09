public class Box8 {
     public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("egg rice"==foodName){
			price=70;
		}else if("egg homled"==foodName){
			price=30;
		}else if("half boil"==foodName){
			price=60;
		}else if("egg bonda"==foodName){
			price=60;
		}else if("pepper dry"==foodName){
			price=30;
		}else if("egg masala"==foodName){
			price=250;
		}else if("egg curry"==foodName){
			price=300;
		}else if("egg dosa"==foodName){
			price=80;
		}else if("egg sambar"==foodName){
			price=60;
		}else if("egg"==foodName){
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