class Amazon
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
	
	public String search(String productName)
	{
		System.out.println("Invoking search by product name :" +productName);
		String msg=null;
		boolean isLogin=login("ramya bk","ramya@123");
		if(isLogin){
			System.out.println("login successful");
		if(productName!=null)
		{
			msg="Searched productname :" +productName+ " is available";
		}
		
		}else{
			msg="invalid username and psw";
		}
		return msg;
		
	}
	
	public String search(String productName,String productBrand)
	{
		System.out.println("Invoking search by product name :" +productName+ " Product Brand  :"+productBrand);
		String msg=null;
		
		if(productName!=null &&  productBrand !=null)
		{
			msg="searched productname :" +productName+ "  and Product Brand:"+productBrand;
		}
		return msg;	
	}
	public String search(String productName,String productBrand,String color){
		System.out.println("invoking search by product name:" +productName+ " Product Brand :" +productBrand+ " Color:" +color);
		String msg=null;
		 
		if(productName!=null && productBrand !=null &&  color!=null){
			msg="searched productName:" +productName+ "  and Product Brand:" +productBrand+ " Color:" +color;
		}
		return msg;
	}
    public String search(String productName,String productBrand,String color,String operatingSystem){
		System.out.println("invoking search by product name:" +productName+ " Product Brand :" +productBrand+ " Color:" +color+ " Operating System :" +operatingSystem);
		String msg=null;
		 
		if(productName!=null && productBrand !=null &&  color!=null  && operatingSystem!=null){
			msg="searched productName:" +productName+ " Product Brand :" +productBrand+ "Color:" +color+ " Operating System:" +operatingSystem;
		}
		return msg;
	}
	public String search(String productName,String productBrand,String color,String operatingSystem,String memoryStorageCapacity){
		System.out.println("invoking search by product name:" +productName+ " Product Brand :"+ productBrand+ "Color:" +color+ "Operating System:" +operatingSystem+ "memoryStorageCapacity:" +memoryStorageCapacity);
		String msg=null;
		if(productName!=null && productBrand !=null &&  color!=null && operatingSystem!=null && memoryStorageCapacity!=null){
			msg="searched productName:" +productName+ "Product Brand :" +productBrand+ "Color:" +color+ "Operating System:" +operatingSystem+ "memoryStorageCapacity:" +memoryStorageCapacity;
		}
		return msg;
	}
}
