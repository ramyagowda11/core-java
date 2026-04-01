class AmazonRunner{
  public static void main(String []amazon){
	  
    Amazon app =new Amazon();
   
   boolean login=app.login("ramya bk","ramya@123");
   System.out.println(login);
   
   
   String login1=app.login("ramya@gmail.com","ramya@123","nbjhjjhbhghf");
   System.out.println(login1);
   
   String msg1=app.search("vivo");
   System.out.println(msg1);
  
   String msg2=app.search("vivo","vivo v27 pro");
   System.out.println(msg2);
   
   String msg3=app.search("vivo","vivo v27 pro","blue");
   System.out.println(msg3);
   
   String msg4=app.search("vivo","vivo v27 pro","blue","funtouch os");
   System.out.println(msg4);
   
   String msg5=app.search("vivo","vivo v27 pro","blue","funtouch","5 tb");
   System.out.println(msg5);
   }
}