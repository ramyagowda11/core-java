class CameraRunner{
	public static void main(String []args){
		Camera ref=new Camera();
		ref.cameraName="compact";
		ref.cameraColor="black";
		ref.price=676576;
		ref.display();
		System.out.println("-----");
		
		Camera compact=new Camera("compact1","silver",5654);;
		compact.display();
		 
		
	}
}