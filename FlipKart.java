class FlipKart{
	public boolean login(String userName,String psw){
		System.out.println("Invoking login using User name " +userName+ " and psw:" +psw);
        String regUserName="ramya bk";
        String regPsw="ramya@123";
        boolean isLogin=false;
		
        if(userName ==regUserName && psw==regPsw){
		    isLogin=true;
        }else{
            isLogin=false;
		}
        return isLogin;	
	}
    public String login(String email,String psw,String captcha){
		System.out.println("Invoking login using email Id " +email+ " and psw:" +psw);
		String regEmail="ramaya@gmail.com";
		String regPsw="ramya@123";
		String isLogin=null;
		
		if(email ==regEmail && regPsw ==psw){
			isLogin="Login Succesfully";
		}else{
			isLogin="Login Failed";
		}
		return isLogin;
  		
	}		
	public String search(String productName){
		System.out.println("Invoking search By Product Name :" +productName);
		String msg=null;
		
		if(productName!=null){
			msg="searched Product Name :" +productName+ "is Available";
		}
		return msg;
	}
	public String search(String productName,String productBrand){
		System.out.println("Invoking search By Product Name :" +productName+ " Product Brand  :" +productBrand);
		String msg=null;
		if(productName!=null && productBrand!=null){
			msg="searched Product Name :" +productName+ " and Product Brand:" +productBrand;
		}
		return msg;
	}
	public String search(String productName,String productBrand,String color){
		System.out.println("Invoking search By Product Name :" +productName+ " Product Brand  :" +productBrand+ " color:" +color);
		String msg=null;
		if(productName!=null && productBrand !=null && color!=null){
			msg="searched Product Name :" +productName+ " and Product Brand:" +productBrand+ "color:" +color;
		}
		return msg;
	}
	public String search(String productName,String productBrand,String color,String warrenty){
		System.out.println("Invoking search By Product Name :" +productName+ " Product Brand  :" +productBrand+ " Color:" +color+ "warrenty:" +warrenty);
		String msg=null;
		if(productName!=null && productBrand !=null && color!=null && warrenty!=null){
			msg="searched Product Name :" +productName+ " and Product Brand:" +productBrand+" Color:" +color+ "warrenty:" +warrenty;
		}
		return msg;
	}
	public String search(String productName,String productBrand,String color,String Warranty,String deliveryDate){
		System.out.println("Invoking search By Product Name :" +productName+ " Product Brand  :" +productBrand+ " Color:" +color+ " warranty:" +Warranty+ "delivery date:" +deliveryDate );
		String msg=null;
		if(productName!=null && productBrand !=null && color!=null&& Warranty!=null && deliveryDate!=null){
			msg="searched Product Name :" +productName+ " and Product Brand:" +productBrand+ " Color:" +color+ " warranty:" +Warranty+ "delivery Date:" +deliveryDate;
		}
		return msg;
	}
}