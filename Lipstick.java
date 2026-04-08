class Lipstick {

     //properties

    String brand;
    String shade;
    String type;
    int quantity;
    double price;
    String finish;
    boolean isWaterproof;
    boolean isMatte;
    int manufactureYear;
    String color;
    static String category = "Cosmetics";
    static String use = "Makeup";
	
	
	//functionalities

    public String apply(String user) {
        System.out.println("Applied by: " + user);
        return user;
    }

    public String remove(String method) {
        System.out.println("Removed using: " + method);
        return method;
    }

    public String checkShade(String shade) {
        System.out.println("Shade checked: " + shade);
        return shade;
    }

    public double getPrice(double price) {
        System.out.println("Price: " + price);
        return price;
    }

    public boolean waterproof(boolean status) {
        System.out.println("Waterproof: " + status);
        return status;
    }

    public boolean matte(boolean status) {
        System.out.println("Matte Finish: " + status);
        return status;
    }

    public int quantity(int qty) {
        System.out.println("Quantity: " + qty);
        return qty;
    }

    public String manufacture(String brand) {
        System.out.println("Manufactured by: " + brand);
        return brand;
    }

    public String pack(String pack) {
        System.out.println("Packed in: " + pack);
        return pack;
    }

    public boolean available(boolean status) {
        System.out.println("Available: " + status);
        return status;
    }
}