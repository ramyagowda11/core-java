public class Rappi {
     public double getPriceByFoodName(String foodName){
		System.out.println("invoking getPriceByFoodName:"+foodName);
		double price=0.0;
		
		if("noodles"==foodName){
			price=40;
		}else if("bisibele bath"==foodName){
			price=60;
		}else if("vangi bath"==foodName){
			price=60;
		}else if("pongal"==foodName){
			price=70;
		}else if("paddu"==foodName){
			price=50;
		}else if("rice bath"==foodName){
			price=30;
		}else if("ghree rice"==foodName){
			price=180;
		}else if("chapati"==foodName){
			price=30;
		}else if("parota"==foodName){
			price=60;
		}else if(" butter dosa"==foodName){
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
    
