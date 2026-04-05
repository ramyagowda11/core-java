class Myntra
{
	
	Myntra()
	{
		this("puma shoes");
		System.out.println("I am using myntra 1");
	}
	
	Myntra(String productName)
	{
		this("puma shoes","puma");
		System.out.println("I am using myntra 2");
		System.out.println("product Name:"+productName);
		
	}
	Myntra(String productName,String brand)
	{
		this("puma shoes",70.6);
		System.out.println("I am using mybtra 3");
		System.out.println("product Name:"+productName);
		System.out.println("brand:"+brand);
	}
	Myntra(String productName,double productPrice)
	{
		this("puma shoes",4.5f);
		System.out.println("I am using myntra 4");
		System.out.println("product Name:"+productName);
		System.out.println("product Price:"+productPrice);
		
	}
	Myntra(String productName,float productRatings)
	{
		System.out.println("I am using myntra 5");
		System.out.println("product Name:"+productName);
		System.out.println("product Ratings:"+productRatings);
		
	}
	
}
