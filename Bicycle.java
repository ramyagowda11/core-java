class Bicycle {
    String brand;
    String model;
    static String type = "mountain";
    String color;
    int price;
    float wheelSize;

    public Bicycle() {
        System.out.println("default constructor:");
    }

    public Bicycle(String brand, String model, String color, int price, float wheelSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.wheelSize = wheelSize;
    }

    public void displayBicycleDetails() {
        System.out.println("bicycle brand:" + brand);
        System.out.println("bicycle model:" + model);
        System.out.println("bicycle type:" + type);
        System.out.println("bicycle color:" + color);
        System.out.println("bicycle price:" + price);
        System.out.println("bicycle wheelSize:" + wheelSize);
    }
}