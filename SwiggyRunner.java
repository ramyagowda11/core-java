class SwiggyRunner
{
	public static void main(String [] youtube)
	{
		Swiggy tube=new Swiggy();
		boolean login=tube.login("ramya bk","ramya@123");
		System.out.println(login);
		String login1=tube.login("ramya@gmail.com","ramya@123","kjjghjbhjbjh");
		System.out.println(login1);
		String msg2=tube.search("Pizza");
		System.out.println(msg2);
		String msg3=tube.search("Pizza","3.5");
		System.out.println(msg3);
		String msg4=tube.search("Pizza","3.5","Pizza hut");
		System.out.println(msg4);
		String msg5=tube.search("Pizza","3.5","Pizza hut","2-04-2026");
		System.out.println(msg5);
		String msg6=tube.search("Pizza","3.5","Pizza hut","2-04-2026","ramya");
		System.out.println(msg6);
	}
}