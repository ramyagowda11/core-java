class MusicPlayer{
	String playerName;
	String brand;
	String currentSong;
	String singerName;
	int volumeLevel;
	boolean isPlaying;
	
	public  MusicPlayer(String playerName,String brand,String currentSong,String singerName,int volumeLevel,boolean isPlaying){
		this.playerName=playerName;
		this.brand=brand;
		this.currentSong=currentSong;
		this.singerName=singerName;
		this.volumeLevel=volumeLevel;
		this.isPlaying=isPlaying;
	}
	public void display(){
		System.out.println("player name:"+playerName);
		System.out.println("brand:"+brand);
		System.out.println("current song:"+currentSong);
		System.out.println("singer name:"+singerName);
		System.out.println("volume level:"+volumeLevel);
		System.out.println("is playing:"+isPlaying);
		
	}

}