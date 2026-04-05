 class Lakme{
    Lakme()
	{
		this("lakme lipstick ");
		System.out.println("I am using lakme product 1");
	}
	
	Lakme(String productName)
	{
		this("lakme lipstick","lakme");
		System.out.println("I am using lakme product 2");
		System.out.println("product Name:"+productName);
	}
	Lakme(String productName,String brand)
	{
		this("lakme lipstick",150.0);
		System.out.println("I am using lakme product 3");
		System.out.println("product Name:"+productName);
		System.out.println("brand:"+brand);
	}
	Lakme(String productName,double productPrice)
	{
		this("lakme lipstick",4.9f);
		System.out.println("I am using lakme product 4");
		System.out.println("product Name:"+productName);
		System.out.println("product Price:"+productPrice);
	}
	Lakme(String productName,float productRatings)
	{
		System.out.println("I am using myntra 5");
		System.out.println("product Name:"+productName);
		System.out.println("product Ratings:"+productRatings);
		
	}
 }