public class LightBulbRunner {
    public static void main(String[] args){
        LightBulb lightBulb1=new LightBulb();
        lightBulb1.brand="philips";
        lightBulb1.wattage=60;
        lightBulb1.brightness=800.5f;
        lightBulb1.dimLevel=75;
        lightBulb1.isOnOrOff=true;
        lightBulb1.manufactureDate="2024-04-31";
        lightBulb1.getLightBulbDetails();
        LightBulb lightBulb2=new LightBulb("philips",60,800.5f,true,75,"2024-04-31");

    }
}
