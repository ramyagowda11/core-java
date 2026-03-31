public class RefrigeratorRunner {
    public static void main(String[] args){
        Refrigerator refrigerator1=new Refrigerator();
        refrigerator1.availableColor="silver";
        refrigerator1.brand="samsung";
        refrigerator1.currentTemperature=3.5f;
        refrigerator1.price=49000.0f;
        refrigerator1.refrigeratorType="double door";
        refrigerator1.storageCapacity=350;
        refrigerator1.getRefrigeratorDetails();
        Refrigerator refrigerator2=new Refrigerator("samsung","double door",350,3.5f,"silver",49000.0f);

        }
    
}
