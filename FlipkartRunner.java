class FlipkartRunner{
  public static void main(String []search){
	  
   FlipKart cart=new FlipKart();
   
   boolean login=cart.login("ramya bk","ramya@123");
   System.out.println(login);
   
   
   String login1=cart.login("ramya@gmail.com","ramya@123","nbvhghgh");
   System.out.println(login1);
   
   String msg=cart.search("godrej 308l");
   System.out.println(msg);
  
   String msg1=cart.search("godrej 308l","godrej");
   System.out.println(msg);
   
   String msg2=cart.search("godrej 308l","godrej","silver");
   System.out.println(msg2);
   
   String msg3=cart.search("godrej 308l","godrej","silver","5 year");
   System.out.println(msg3);
   
   String msg4=cart.search("godrej 308l","godrej","silver","5 year","12-03-2024");
   System.out.println(msg4);
   }
}