class UberEats{
	public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("egg rice"==foodName){
			price=76;
		}else if("biryani"==foodName){
			price=120;
		}else if("button biryani"==foodName){
			price=280;
		}else if("fish fry"==foodName){
			price=70;
		}else if("dragen chicken"==foodName){
			price=180;
		}else if("crab fry"==foodName){
			price=180;
		}else if("prawns fry"==foodName){
			price=300;
		}else if("chicken kabab"==foodName){
			price=50;
		}else if("gotti gojju"==foodName){
			price=100;
		}else if("butter roti"==foodName){
			price=30;
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