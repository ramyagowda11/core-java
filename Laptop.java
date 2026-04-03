class Laptop {
    String brand;
    String model;
    static String type = "portable";
    String color;
    int price;
    float weight;

    public Laptop() {
        System.out.println("default constructor:");
    }

    public Laptop(String brand, String model, String color, int price, float weight) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public void displayLaptopDetails() {
        System.out.println("laptop brand:" + brand);
        System.out.println("laptop model:" + model);
        System.out.println("laptop type:" + type);
        System.out.println("laptop color:" + color);
        System.out.println("laptop price:" + price);
        System.out.println("laptop weight:" + weight);
    }
}