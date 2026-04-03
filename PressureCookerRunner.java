class PressureCookerRunner{
	public static void main(String[] cooker){
		PressureCooker prestige=new PressureCooker();
		prestige.brand="prestige";
		prestige.capacity="5 liters";
		prestige.color="silver";
		prestige.price=5000;
		prestige.itemWeight=5.6f;
		prestige.displayPressureCookerDetails();
		System.out.println("---------");
		
		PressureCooker pigeon=new PressureCooker("pigeon","5 liters","silver",657,5.2f);
		pigeon.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker hawkins=new PressureCooker("hawkins","3 liters","silver",2240,4.4f);
		hawkins.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker butterflyCurve=new PressureCooker("butterflyCurve","5 liters","black",1405,4.1f);
		butterflyCurve.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker berger=new PressureCooker("berger","5 liters","silver",4779,4.4f);
		berger.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker butterflyCordial=new PressureCooker("butterflyCordial","3 liters","silver",3099,3.9f);
		butterflyCordial.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker bergerArgent=new PressureCooker("bergerArgent","1 liters","silver",2949,4.2f);
		bergerArgent.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker butterflyCuteInduction=new PressureCooker("butterflyCuteInduction","5 liters","silver",1895,4.1f);
		butterflyCuteInduction.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker pigeonStoveKraft=new PressureCooker("pigeonStoveKraft","3 liters","silver",1685,3.8f);
		pigeonStoveKraft.displayPressureCookerDetails();
		System.out.println("--------");
		
		PressureCooker indusValley=new PressureCooker("indusValley","5 liters","silver",3279,3.5f);
		indusValley.displayPressureCookerDetails();
		System.out.println("--------");
		
	}


}