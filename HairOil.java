class HairOil {

    // 10 Properties
    String brand;
    String type;
    String hairType;
    int quantity;
    double price;
    String keyIngredient;
    boolean isHeatProtect;
    boolean isAntiHairFall;
    int manufactureYear;
    String fragrance;
    static String category = "HairCare";
    static String use = "Hair Nourishment";

    //functionalities
	
    public String apply(String user) {
	System.out.println("Applied by: " + user); 
	return user;
	}
    public String showIngredient(String ingredient) {
	System.out.println("Key Ingredient: "+ingredient);
	return ingredient;
	}
    public double showPrice(double price) {
	System.out.println("Price: " + price);
	return price;
	}
    public boolean checkHeatProtect(boolean s) {
	System.out.println("Heat Protection: " + s);
	return s;
	}
    public boolean checkAntiHairFall(boolean s) {
	System.out.println("Anti Hair Fall: " + s); 
	return s; 
	}
    public String showBrand(String brand) {
	System.out.println("Brand: " + brand);
	return brand;
	}
    public String showHairType(String hair) {
	System.out.println("Hair Type: " + hair);
	return hair;
	}
    public int showQuantity(int quantity) {
	System.out.println("Quantity: " + quantity);
	return quantity;
	}
    public int showYear(int year) {
	System.out.println("Manufacture Year: " + year); 
	return year;
	}
    public String showFragrance(String fragrance) {
	System.out.println("Fragrance: " + fragrance);
	return fragrance;
	}
}