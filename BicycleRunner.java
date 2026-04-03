class BicycleRunner {
    public static void main(String[] args) {

        Bicycle Hero = new Bicycle("Hero", "Sprint", "red", 8000, 26.0f);
        Hero.displayBicycleDetails();
        System.out.println("---");
        
        Bicycle Trek = new Bicycle("Trek", "Marlin 5", "green", 35000, 27.5f);
        Trek.displayBicycleDetails();
        System.out.println("---");

        Bicycle Firefox = new Bicycle("Firefox", "Rapidio", "black", 15000, 24.0f);
        Firefox.displayBicycleDetails();
        System.out.println("---");

        Bicycle Giant = new Bicycle("Giant", "Talon 3", "blue", 42000, 29.0f);
        Giant.displayBicycleDetails();
        System.out.println("---");

        Bicycle Specialized= new Bicycle("Specialized", "Rockhopper", "white", 55000, 27.5f);
        Specialized.displayBicycleDetails();
        System.out.println("---");

        Bicycle Cannondale= new Bicycle("Cannondale", "Trail 8", "orange", 48000, 26.0f);
        Cannondale.displayBicycleDetails();
        System.out.println("---");

        Bicycle Scott= new Bicycle("Scott", "Aspect 950", "grey", 32000, 29.0f);
        Scott.displayBicycleDetails();
        System.out.println("---");

        Bicycle Merida = new Bicycle("Merida", "Big Nine 20", "yellow", 38000, 29.0f);
        Merida.displayBicycleDetails();
        System.out.println("---");

        Bicycle Btwin = new Bicycle("Btwin", "Rockrider 520", "purple", 18000, 27.5f);
        Btwin.displayBicycleDetails();
        System.out.println("---");

        Bicycle Kona = new Bicycle("Kona", "Blast", "silver", 60000, 26.0f);
        Kona.displayBicycleDetails();
        System.out.println("---");

        
    }
}