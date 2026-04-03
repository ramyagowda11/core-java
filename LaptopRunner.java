class LaptopRunner {
    public static void main(String[] args) {
	
        Laptop Dell = new Laptop("Dell", "Inspiron 15", "grey", 55000, 1.8f);
        Dell.displayLaptopDetails();
        System.out.println("---");

        
        Laptop HP = new Laptop("HP", "Pavilion x360", "silver", 62000, 1.5f);
        HP.displayLaptopDetails();
        System.out.println("---");

       
        Laptop Lenovo = new Laptop("Lenovo", "IdeaPad Slim 3", "blue", 48000, 1.6f);
        Lenovo.displayLaptopDetails();
        System.out.println("---");

        
        Laptop Apple= new Laptop("Apple", "MacBook Air", "gold", 99000, 1.2f);
        Apple.displayLaptopDetails();
        System.out.println("---");

        
        Laptop Asus = new Laptop("Asus", "VivoBook 15", "black", 45000, 1.7f);
        Asus.displayLaptopDetails();
        System.out.println("---");

        
        Laptop Acer = new Laptop("Acer", "Aspire 5", "white", 42000, 1.9f);
        Acer.displayLaptopDetails();
        System.out.println("---");

        
        Laptop Microsoft = new Laptop("Microsoft", "Surface Pro", "platinum", 120000, 1.1f);
        Microsoft.displayLaptopDetails();
        System.out.println("---");

        Laptop MSI= new Laptop("MSI", "GF63 Thin", "red", 75000, 2.0f);
        MSI.displayLaptopDetails();
        System.out.println("---");

        
        Laptop Samsung = new Laptop("Samsung", "Galaxy Book2", "silver", 85000, 1.4f);
        Samsung.displayLaptopDetails();
        System.out.println("---");

        
        Laptop Toshiba = new Laptop("Toshiba", "Satellite Pro", "black", 38000, 2.1f);
        Toshiba.displayLaptopDetails();
        System.out.println("---");
    }
}