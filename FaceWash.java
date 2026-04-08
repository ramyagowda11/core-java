class FaceWash {

    //properties

    String brand;
    String type;
    String skinType;
    int quantity;
    double price;
    String fragrance;
    boolean isOrganic;
    boolean isFoaming;
    int manufactureYear;
    String color;
    static String category="Cosmetics";
    static String use="SkinCare";
	
	//functionalities

    public String apply(String user){
	System.out.println("Applied:"+user);
	return user;
	}
    public String wash(String face){
	System.out.println("Face washed:"+face);
	return face;
	}
    public String fragrance(String smell){
	System.out.println("Fragrance:"+smell);
	return smell;
	}
    public double price(double price){
	System.out.println("Price:"+price);
	return price;
	}
    public boolean organic(boolean s){
	System.out.println("Organic:"+s);
	return s;
	}
    public boolean foam(boolean s){
	System.out.println("Foam:"+s);
	return s;
	}
    public int quantity(int q){
	System.out.println("Qty:"+q);
	return q;
	}
    public String manufacture(String manufactureName){
	System.out.println("Brand:"+manufactureName);
	return manufactureName;
	}
    public String packOf(String pack){
	System.out.println("Pack of:"+pack);
	return pack;
	}
    public boolean available(boolean s){
	System.out.println("Available:"+s);
	return s;
	}
}