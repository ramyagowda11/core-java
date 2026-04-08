class Toothpaste {

    // 10 Properties
	
	
    String brand;
    String flavor;
    String type;
    int quantity;
    double price;
    boolean isWhitening;
    boolean isFluoride;
    String targetProblem;
    int manufactureYear;
    String color;
    static String category = "OralCare";
    static String use = "Teeth Cleaning";

    // functionality
	
	
    public String brush(String user) {
	System.out.println("Brushed by: " + user);
	return user;
	}
    public String showFlavor(String flavour) { 
	System.out.println("Flavor: " + flavour);
	return flavour; 
	}
    public double showPrice(double price) {
	System.out.println("Price: " + price);
	return price;
	}
    public boolean checkWhitening(boolean s) {
	System.out.println("Whitening: " + s); 
	return s;
	}
    public boolean checkFluoride(boolean s) {
	System.out.println("Fluoride: " + s);
	return s;
	}
    public String showBrand(String brand) { 
	System.out.println("Brand: " + brand);
	return brand;
	}
    public String showType(String type) {
	System.out.println("Type: " + type);
	return type;
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