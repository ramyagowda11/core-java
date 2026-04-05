class Camera{
String cameraName;
String cameraColor;
int price;

public Camera(){
	System.out.println("default constructor:");
	
}

public Camera(String cameraName,String cameraColor,int price){
	this.cameraName=cameraName;
	this.cameraColor=cameraColor;
	this.price=price;
}

public void display(){
	System.out.println("camera name:"+cameraName);
	System.out.println("camera color:"+cameraColor);
	System.out.println("camera price:"+price);
	
}
}