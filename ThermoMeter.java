public class ThermoMeter {
    String type;
    float range;
    float accuracy;
    float sensitivity;
    float responseTime;
    String material;
    String scale;
    boolean digitalDisplay;
    public ThermoMeter(){
        System.out.println("default constructor:");
    }
    public void getThermoMeterDetails() {
        System.out.println("Thermometer type:"+type);
        System.out.println("Range:"+range);
        System.out.println("Accuracy:"+accuracy);
        System.out.println("Sensitivity:"+sensitivity);
        System.out.println("Response Time:"+responseTime);
        System.out.println("Material:"+material);
        System.out.println("Scale:"+scale);
        System.out.println("Digital Display:"+digitalDisplay);
    }
    public ThermoMeter(String type,float range,float accuracy,float sensitivity,float responseTime,String material,String scale){
        System.out.println("parameterized constructor:"+type+","+range+","+accuracy+","+sensitivity+","+responseTime+","+material+","+scale);
    }
    
}
