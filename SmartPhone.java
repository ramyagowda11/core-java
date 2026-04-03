class SmartPhone{
	String brand;
	String model;
	static String type="Android";
	String color;
	int price;
	float screenSize;
	
	public SmartPhone(){
		System.out.println("default constructor:");
		
	}
	public SmartPhone(String brand,String model,String color,int price,float screenSize){
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.screenSize=screenSize;	
	}
	
	public void displaySmartPhoneDetails(){
		System.out.println("phone brand:"+brand);
		System.out.println("phone model:"+model);
		System.out.println("phone type:"+type);
		System.out.println("phone color:"+color);
		System.out.println("phone price:"+price);
		System.out.println("phone screenSize:"+screenSize);
		
		
	}


}