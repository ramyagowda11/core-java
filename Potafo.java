public class Potafo {
    public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("sambar idli"==foodName){
			price=60;
		}else if("plan dosa"==foodName){
			price=60;
		}else if("butter masala dosa"==foodName){
			price=100;
		}else if("masala dosa"==foodName){
			price=70;
		}else if("paneer dosa"==foodName){
			price=100;
		}else if("onion paneer dosa"==foodName){
			price=180;
		}else if("paper plan dosa"==foodName){
			price=80;
		}else if("onion butter masala dosa"==foodName){
			price=100;
		}else if("dal vada"==foodName){
			price=60;
		}else if("fry idli"==foodName){
			price=70;
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
