class PressureCooker{
	String brand;
	String capacity;
	static String material="aluminimum";
	String color;
	int price;
	float itemWeight;
	
	public PressureCooker(){
		System.out.println("default constructor:");
		
	}
	public PressureCooker(String brand,String capacity,String color,int price,float itemWeight){
		this.brand=brand;
		this.capacity=capacity;
		this.color=color;
		this.price=price;
		this.itemWeight=itemWeight;	
	}
	
	public void displayPressureCookerDetails(){
		System.out.println("cooker brand:"+brand);
		System.out.println("cooker capacity:"+capacity);
		System.out.println("cooker material:"+material);
		System.out.println("cooker color:"+color);
		System.out.println("cooker price:"+price);
		System.out.println("cooker itemWeight:"+itemWeight);
		
		
	}


}