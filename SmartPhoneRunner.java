class SmartPhoneRunner{
	public static void main(String[] phone){
		SmartPhone spark=new SmartPhone();
		spark.brand="spark 50 5g";
		spark.model="spark 14 pro";
		spark.color="black";
		spark.price=16999;
		spark.screenSize=6.56f;
		spark.displaySmartPhoneDetails();
		System.out.println("---------");
		
		SmartPhone onePlus=new SmartPhone("onePlus","onePlus 15","pink",72999,6.78f);
		onePlus.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone redmi=new SmartPhone("redmi","redmi note 15 5g","blue",11999,6.5f);
		redmi.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone samsungGalaxy=new SmartPhone("samsungGalaxy","samsung galaxy s26","black",12999,6.5f);
		samsungGalaxy.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone vivo=new SmartPhone("vivoT4Lite","vivo v70","white",14899,6.0f);
		vivo.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone IqooZ11=new SmartPhone("IqooZ11","iqoo 10 pro","silver",3099,6.85f);
		IqooZ11.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone onePlusNord=new SmartPhone("onePlusNord","onePlus nord 4","nexus blue",24996,6.4f);
		onePlusNord.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone oppoK14x=new SmartPhone("oppoK14x","oppo x9 pro","silver",13999,6.7f);
		oppoK14x.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone motorola=new SmartPhone("motorola g57","motorola razr ultra","pantone regatta",15698,6.7f);
		motorola.displaySmartPhoneDetails();
		System.out.println("--------");
		
		SmartPhone pocoM75G=new SmartPhone("pocoM75G","poco m7","silver",3279,6.88f);
		pocoM75G.displaySmartPhoneDetails();
		System.out.println("--------");
		
	}


}