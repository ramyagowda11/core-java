class Netflix{
    Netflix()
	{
		this("stranger things");
		System.out.println("I am using Netflix 1");
	}
	
	Netflix(String showName)
	{
		this("stranger things","netflix");
		System.out.println("I am using Netflix 2");
		System.out.println("show Name:"+showName);
	}
	Netflix(String showName,String brand)
	{
		this("stranger things",70.6);
		System.out.println("I am using Netflix 3");
		System.out.println("show Name:"+showName);
		System.out.println("brand:"+brand);
	}
	Netflix(String showName,double subscriptionPrice)
	{
		this("stranger things",4.5f);
		System.out.println("I am using Netflix 4");
		System.out.println("show Name:"+showName);
		System.out.println("subscription Price:"+subscriptionPrice);
	}
	Netflix(String showName,float showRatings)
	{
	    System.out.println("I am using Netflix 5");
		System.out.println("show Name:"+showName);
		System.out.println("show Ratings:"+showRatings);
		
		
	}
}