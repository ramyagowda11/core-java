class Refrigerator1 {
    String brand;
    String model;
    static String type = "electric";
    String color;
    int price;
    float capacity;

    public Refrigerator1() {
        System.out.println("default constructor:");
    }

    public Refrigerator1(String brand, String model, String color, int price, float capacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
    }

    public void displayRefrigerator1Details() {
        System.out.println("fridge brand:" + brand);
        System.out.println("fridge model:" + model);
        System.out.println("fridge type:" + type);
        System.out.println("fridge color:" + color);
        System.out.println("fridge price:" + price);
        System.out.println("fridge capacity:" + capacity);
    }
}