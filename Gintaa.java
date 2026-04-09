public class Gintaa {
    public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("veg fried rice"==foodName){
			price=100;
		}else if("chilli garlic rice"==foodName){
			price=110;
		}else if("butter rice"==foodName){
			price=130;
		}else if("paneer rice"==foodName){
			price=150;
		}else if("singapuri chicken rice"==foodName){
			price=170;
		}else if("chicken manchurian rice"==foodName){
			price=180;
		}else if("butter fried rice"==foodName){
			price=130;
		}else if("steam veg momos"==foodName){
			price=80;
		}else if("fry veg momos"==foodName){
			price=100;
		}else if("gravy veg momos"==foodName){
			price=100;
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
    

