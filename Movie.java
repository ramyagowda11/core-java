class Movie{
    Movie()
	{
		this("milana");
		System.out.println("default constructor 1");
	}
	
	Movie(String movieName)
	{
		this("milana","puneet rajkumar");
		System.out.println("parameterized constructor 2");
		System.out.println("movie Name:"+movieName);
	}
	Movie(String movieName,String heroName)
	{
		this("milana",150.6);
		System.out.println("parameterized constructor 3");
		System.out.println("movie Name:"+movieName);
		System.out.println("hero name:"+heroName);
	}
	Movie(String movieName,double ticketPrice)
	{
		this("milana",2000);
		System.out.println("parameterized constructor 4");
		System.out.println("movie Name:"+movieName);
		System.out.println("ticket Price:"+ticketPrice);
	}
	Movie(String movieName,int noOfTicketSold )
	{
		System.out.println("parameterized constructor 5");
		System.out.println("movie Name:"+movieName);
		System.out.println("no of ticket sold hold:"+noOfTicketSold);
		
	}
}