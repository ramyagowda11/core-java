class YouTubeRunner
{
	public static void main(String [] youtube)
	{
		YouTube tube=new YouTube();
		boolean login=tube.login("ramya bk","ramya@123");
		System.out.println(login);
		String msg1=tube.login("ramya@gmail.com","ramya@123","kjjghjbhjbjh");
		System.out.println(msg1);
		String msg2=tube.search("ninnindale");
		System.out.println(msg2);
		String msg3=tube.search("ninnindale","puneeth rajkumar");
		System.out.println(msg3);
	}
}