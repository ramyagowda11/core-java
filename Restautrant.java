class Restautrant{
    Restautrant()
	{
		this("biryani");
		System.out.println("restautrant constructor 1");
	}
	
	Restautrant(String foodName)
	{
		this("biryani","ravi donne biryani");
		System.out.println("restautrant constructor 2");
		System.out.println("food Name:"+foodName);
	}
	Restautrant(String foodName,String restautrantName)
	{
		this("biryani",100.6);
		System.out.println("restautrant constructor 3");
		System.out.println("food Name:"+foodName);
		System.out.println("restautrant Name:"+restautrantName);
	}
	Restautrant(String foodName,double foodPrice)
	{
		this("biryani",6);
		System.out.println("restautrant constructor 4");
		System.out.println("food Name:"+foodName);
		System.out.println("food Price:"+foodPrice);
	}
	Restautrant(String foodName,int noOfWorkers)
	{
		System.out.println("restautrant constructor 5");
		System.out.println("food Name:"+foodName);
		System.out.println("no of workers in restautrant:"+noOfWorkers);
		
	}
}