class Swiggy
{
	public boolean login(String username,String psw)
	{
		System.out.println("Invoking login using username :" +username+  " and password : " +psw);
		boolean isLogin=false;
		String regusername="ramya bk";
		String regpsw="ramya@123";
		
		if(username == regusername && psw == regpsw)
		{
			isLogin=true;
		}
		else
		{
			isLogin=false;
		}
		return isLogin;
	}
	
	public String login(String emailId,String psw,String captcha)
	{
		System.out.println("Invoking login using email id :" +emailId+ " and password :" +psw);
		String msg=null;
		String regemailId="ramya@gmail.com";
		String regpsw="ramya@123";
		
		if(emailId == regemailId && psw == regpsw)
		{
			msg="login successful";
		}
		else
		{
			msg="login failed";
		}
		return msg;
	}
	
	public String search(String foodName)
	{
		System.out.println("Invoking search by food name :" +foodName);
		String msg=null;
		
		if(foodName!=null)
		{
			msg="Searched foodname :" +foodName+ " is available";
		}
		return msg;
	}
	
	public String search(String foodName,String ratings)
	{
		System.out.println("Invoking search by food name :" +foodName+ " and ratings :" +ratings);
		String msg=null;
		
		if(foodName!=null && ratings!=null)
		{
			msg="searched foodname :" +foodName+ " and ratings :" +ratings;
		}
		return msg;	
	}
	public String search(String foodName,String ratings,String hotelName){
		System.out.println("invoking search by food name:"+foodName+ "and ratings :"+ratings+" and hotelName" +hotelName);
		String msg=null;
		 
		if(foodName!=null && ratings!=null && hotelName!=null){
			msg="search foodName:" +foodName+ "and ratings:"+ratings+" and hotelName:" +hotelName;
		}
		return msg;
	}
    public String search(String foodName,String ratings,String hotelName,String delivaryDate){
		System.out.println("invoking search by food name:"+foodName+ "and ratings :"+ratings+" and hotelName" +hotelName+ "and delivaryDate:" +delivaryDate);
		String msg=null;
		 
		if(foodName!=null && ratings!=null && hotelName!=null && delivaryDate!=null){
			msg="search foodName:" +foodName+ "and ratings:"+ratings+" and hotelName:" +hotelName+ "and delivaryDate:" +delivaryDate;
		}
		return msg;
	}
	public String search(String foodName,String ratings,String hotelName,String delivaryDate,String customerName){
		System.out.println("invoking search by food name:"+foodName+ "and ratings :"+ratings+" and hotelName" +hotelName+ "and delivaryDate:" +delivaryDate+ "and customerName:" +customerName);
		String msg=null;
		if(foodName!=null && ratings!=null && hotelName!=null && delivaryDate!=null && customerName!=null){
			msg="search foodName:" +foodName+ "and ratings:"+ratings+" and hotelName:" +hotelName+ "and delivaryDate:" +delivaryDate+ "and customerName:" +customerName;
		}
		return msg;
	}
}
