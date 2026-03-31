public class Refrigerator {
    String brand;
    String refrigeratorType;
    int storageCapacity;
    float currentTemperature;
    String availableColor;
    double price;
    public Refrigerator(){
        System.out.println("default constructor:");
    }
    public void getRefrigeratorDetails(){
        System.out.println("refrigerator brand:"+brand);
        System.out.println("refrigerator type:"+refrigeratorType);
        System.out.println("refrigerator  storage capacity:"+storageCapacity);
        System.out.println("refrigerator current temperature:"+currentTemperature);
        System.out.println("refrigerator available color:"+availableColor);
        System.out.println("refrigerator price:"+price);

    }
    public Refrigerator(String brand,String refrigeratorType,int storageCapacity,float currentTemperature,String availableColor,double price){
        System.out.println("parameterized constructor:"+brand+","+refrigeratorType+","+storageCapacity+","+currentTemperature+","+availableColor+","+price);
    }
    
}
