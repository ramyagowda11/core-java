class BodyLotion {

    // 10 Properties
	
    String brand;
    String type;
    String skinType;
    int quantity;
    double price;
    String fragrance;
    boolean isSPF;
    boolean isOrganic;
    int manufactureYear;
    String texture;
    static String category = "BodyCare";
    static String use = "Moisturizing";

    // functionality
	
	
    public String apply(String user) {
	System.out.println("Applied by: " + user);
	return user; 
	}
    public String showFragrance(String fragrance) {
	System.out.println("Fragrance: " + fragrance); 
	return fragrance; 
	}
    public double showPrice(double price) {
	System.out.println("Price: " + price);
	return price;
	}

    public boolean checkgGlowness(boolean s) {
	System.out.println("check the lotion glowness: " + s);
	return s;
	}
    public boolean checkOrganic(boolean organic) {
	System.out.println("Is Organic: " + organic);
	return organic;
	}
    public String showBrand(String brand) {
	System.out.println("Brand: " + brand);
	return brand; 
	}
    public String showSkinType(String skin) {
	System.out.println("Skin Type: " + skin);
	return skin;
	}
    public int showQuantity(int quantity) { 
	System.out.println("Quantity: " + quantity);
	return quantity;
	}
    public int showYear(int year) {
	System.out.println("Manufacture Year: " + year);
	return year;
	}
    public String showTexture(String texture) {
	System.out.println("Texture: " + texture);
	return texture;
	}
}