class Shampoo {

    // 10 Properties
	
	
    String brand;
    String type;
    String hairType;
    int quantity;
    double price;
    String fragrance;
    boolean isOrganic;
    boolean isAntiDandruff;
    int manufactureYear;
    String color;
    static String category = "HairCare";
    static String use = "Cleaning";

    // functionality
	
    public String apply(String user) {
	System.out.println("Applied by: " + user);
	return user;
	}
    public String wash(String hair) {
	System.out.println("Hair washed: " + hair);
	return hair;
	}
    public String showFragrance(String smell) { 
	System.out.println("Fragrance: " + smell);
	return smell;
	}
    public double showPrice(double price) { 
	System.out.println("show Price: " + price);
	return price;
	}
    public boolean checkOrganic(boolean s) {
	System.out.println("Is Organic: " + s); 
	return s;
	}
    public boolean checkDandruff(boolean s) {
	System.out.println("Anti Dandruff: " + s);
	return s; 
	}
    public String showBrand(String brand) { 
	System.out.println("Brand: " + brand);
	return brand; 
	}
    public String showHairType(String hairType) {
	System.out.println("Hair Type: " + hairType); 
	return hairType;
	}
    public int showQuantity(int quantity) {
	System.out.println("Quantity: " + quantity );
	return quantity;
	}
    public int showYear(int year) { 
	System.out.println("Manufacture Year: " + year);
	return year;
	}
}