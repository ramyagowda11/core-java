class Refrigerator1Runner {
    public static void main(String[] args) {
        Refrigerator1 r1 = new Refrigerator1();
        r1.brand = "Samsung";
        r1.model = "RT28";
        r1.color = "silver";
        r1.price = 25000;
        r1.capacity = 253.5f;
        r1.displayRefrigerator1Details();
        System.out.println("---");

        Refrigerator1 r2 = new Refrigerator1("LG", "GL-T302", "white", 32000, 302.0f);
        r2.displayRefrigerator1Details();
		System.out.println("---");
        
        Refrigerator1 r3 = new Refrigerator1("Whirlpool", "IF305", "black", 28000, 305.5f);
        r3.displayRefrigerator1Details();
		System.out.println("---");
		
        Refrigerator1 bosch=new Refrigerator1("bosch","bosch 187l","feather blue",16990,187.3f);
		bosch.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 whirlpool=new Refrigerator1("whirlpool","whirlpool 300l","black",32490,300.3f);
		whirlpool.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 haier=new Refrigerator1("haier","haier 268l","ge black",28690,268.3f);
		haier.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 godrejEonRegails=new Refrigerator1("godrejEonRegails","godrejEonRegails 472l","champagne gold",42990,472.3f);
		godrejEonRegails.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 samsung=new Refrigerator1("samsung","samsung 550l","real stainless",62990,500.3f);
		samsung.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 lg=new Refrigerator1("lg","lg 630l","matte black",191390,630.3f);
		lg.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 media=new Refrigerator1("media","media 560l","silver",44990,560.3f);
		media.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 hitachi=new Refrigerator1("hitachi","hitachi 563l","black",15698,563.3f);
		hitachi.displayRefrigerator1Details();
		System.out.println("--------");
		
		Refrigerator1 haierCool=new Refrigerator1("haierCool","haier 190","silver",32790,190.3f);
		haierCool.displayRefrigerator1Details();
		System.out.println("--------");
        
        
    }
}