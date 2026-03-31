public class Car {
    String color;
    String brand;
    String fuelType;
    int yearOfManufactur;
    float engineSize;
    String licenseNumber;
    double price;
    String registrationDate;
    public Car(){
        System.out.println("default constructor:");
    }
    public Car(String color,String brand,String fuelType,int yearOfManufactur,float engineSize,String licenseNumber,double price,String registrationDate){
        System.out.println("Construcytor with parameter:"+color+","+brand+","+fuelType+","+yearOfManufactur+","+engineSize+","+licenseNumber+","+price+","+registrationDate);

    }
    public void carDetails(){
        System.out.println("car color:"+color);
         System.out.println("car brand:"+brand);
          System.out.println("car fuel type:"+fuelType);
           System.out.println("car year OfvManufactur:"+yearOfManufactur);
            System.out.println("car engine Size:"+engineSize);
             System.out.println("car license Number:"+licenseNumber);
              System.out.println("car price:"+price);
               System.out.println("car registration Date:"+registrationDate);
    }
}
