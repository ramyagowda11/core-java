class Foundation {

    //properties

    String brand;
    String shade;
    String type;
    int quantity;
    double price;
    String skinType;
    boolean isLongLasting;
    boolean hasSPF;
    int manufactureYear;
    String finish;
    static String category = "Cosmetics";
    static String use = "Face Makeup";
	
	//functionalities

    public String apply(String user){
	System.out.println("Applied:"+user);
	return user;
	}
    public String blend(String tool){
	System.out.println("Blended with:"+tool);
	return tool;
	}
    public String matchShade(String shade){
	System.out.println("Shade:"+shade);
	return shade;
	}
    public double prices(double price){
	System.out.println("Prices:"+price);
	return price;
	}
    public boolean longLasting(boolean s){
	System.out.println("Long lasting:"+s);
	return s;
	}
    public boolean spf(boolean s){
	System.out.println("SPF:"+s);
	return s;
	}
    public int quantity(int quantities){
	System.out.println("Qty:"+quantities);
	return quantities;
	}
    public String removedTools(String remove){
	System.out.println("Removed tools:"+remove);
	return remove;
	}
    public String packOf(String pack){
	System.out.println("Pack of:"+pack);
	return pack;
	}
    public boolean available(boolean s){
	System.out.println("Available:"+s);
	return s;}
}