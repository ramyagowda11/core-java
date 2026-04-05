class LaptopsRunner{
	public static void main(String []args){
		Laptops.getLaptopsDetails();
		Laptops.getLaptopsName("ascer");
		int battery=Laptops.getLaptopsBattery();
		System.out.println("battery deatails:"+battery);
		int price=Laptops.getLaptopsPrice(23000);
		System.out.println("price deatails:"+price);
	}
}