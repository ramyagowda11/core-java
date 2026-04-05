class Fastrack{
    Fastrack()
	{
		this("analog watch");
		System.out.println("I am using fastrack watch 1");
	}
	
	Fastrack(String watchName)
	{
		this("analog watch","fastrack");
		System.out.println("I am using fastrack watch 2");
		System.out.println("watch Name:"+watchName);
	}
	Fastrack(String watchName,String brand)
	{
		this("analog watch",1499.0);
		System.out.println("I am using fastrack watch 3");
		System.out.println("watch Name:"+watchName);
		System.out.println("brand:"+brand);
	}
	Fastrack(String watchName,double watchPrice)
	{
		this("analog watch",4.1f);
		System.out.println("I am using fastrack watch 4");
		System.out.println("watch Name:"+watchName);
		System.out.println("watch Price:"+watchPrice);
	}
	Fastrack(String watchName,float productRatings)
	{
		System.out.println("I am using fastrack watch 5");
		System.out.println("watch Name:"+watchName);
		System.out.println("product Ratings:"+productRatings);
		
	}
}
	