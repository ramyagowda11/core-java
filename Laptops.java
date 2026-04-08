class Laptops {

    // 10 Properties
	
	
    String brand;
    String model;
    String processor;
    int ram;
    int storage;
    double price;
    boolean isTouch;
    boolean isBacklit;
    int batteryLife;
    String color;
    static String category = "Electronics";
    static String use = "Computing";

    // 10 Functionalities

    public String showBrand(String brand) {
        System.out.println("Brand: " + brand);
        return brand;
    }

    public String showModel(String model) {
        System.out.println("Model: " + model);
        return model;
    }

    public String showProcessor(String processor) {
        System.out.println("Processor: " + processor);
        return processor;
    }

    public int showRAM(int ram) {
        System.out.println("RAM: " + ram);
        return ram;
    }

    public int showStorage(int storage) {
        System.out.println("Storage: " +storage);
        return storage;
    }

    public double showPrice(double price) {
        System.out.println("Price: " + price);
        return price;
    }

    public boolean checkTouch(boolean s) {
        System.out.println("Touch Screen: " + s);
        return s;
    }

    public boolean checkBacklit(boolean b) {
        System.out.println("Backlit Keyboard: " + b);
        return b;
    }

    public int showBattery(int batttery) {
        System.out.println("Battery Life: " + battery);
        return battery;
    }

    public String showColor(String color) {
        System.out.println("Color: " + color);
        return color;
    }
}