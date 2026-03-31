public class Chair {
    String material;
    String chairType;
    int weightCapacity;
    float chairHeight;
    String availableColor;
    int chairWidth;
    public Chair(){
        System.out.println("default constructor:");
    }
    public void getChairDetails(){
        System.out.println("chair material:"+material);
        System.out.println("chair type:"+chairType);
        System.out.println("chair weight capacity:"+weightCapacity);
        System.out.println("chair chair height:"+chairHeight);
        System.out.println("chair  available color:"+availableColor);
        System.out.println("chair chair width:"+chairWidth);
    }
    public Chair( String material,String chairType,int weightCapacity,float chairHeight,String availableColor,int chairWidth){
        System.out.println("parameterized constructor:"+material+","+chairType+","+weightCapacity+","+chairHeight+","+availableColor+","+chairWidth);

    }
    
}
