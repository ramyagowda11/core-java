public class LightBulb {
    String brand;
    int wattage=60;
    float brightness;
    boolean isOnOrOff;
    int dimLevel;
    String manufactureDate;
    public LightBulb(){
        System.out.println("default constructor:");
    }
    public void getLightBulbDetails(){
        System.out.println("bulb brand:"+brand);
        System.out.println("bulb wattage:"+wattage);
        System.out.println("bulb brightness:"+brightness);
        System.out.println("bulb is on or off:"+isOnOrOff);
        System.out.println("bulb dim level:"+dimLevel);
        System.out.println("bulb manufacture date:"+manufactureDate);
    }
    public LightBulb(String brand,int wattage,float brightness,boolean isOnOrOff,int dimLevel,String manufactureDate){
        System.out.println("parameterized constructor:"+brand+","+wattage+","+brightness+","+isOnOrOff+","+dimLevel+","+manufactureDate);
    }
}
