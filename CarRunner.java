public class CarRunner {
    public static void main(String[] args){
        
        Car car1=new Car("blue","toyota","electric",2023,2.4f,"DL-987654",344656.0d,"2023-03-12");
        car1.color="blue";
        car1.brand="toyota";
        car1.engineSize=2.4f;
        car1.fuelType="electric";
        car1.price=344656.0d;
        car1.registrationDate="2023-03-12";
        car1.yearOfManufactur=2023;
        car1.licenseNumber="DL-987654";
        car1.carDetails();
        Car car2=new Car();
    }
    
}
