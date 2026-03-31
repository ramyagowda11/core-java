public class MriMachine {
    String brand;
    String model;
    int maxVolume;
    float fieldStrength;
    String madeIn;
    float weight;
    public MriMachine(){
        System.out.println("default constructor:");
    }
    public void getSpeakerDetails(){
        System.out.println("machine brand:"+brand);
        System.out.println("machine model:"+model);
        System.out.println("machine fieldStrength:"+fieldStrength);
        System.out.println("machine maxVolume:"+maxVolume);
        System.out.println("machine madeIn:"+madeIn);
        System.out.println("machine weight:"+weight);
    }
    public MriMachine(String brand,String model,int maxVolume,float fieldStrength,String madeIn,float weight){
        System.out.println("parameterized constructor:"+brand+","+model+","+fieldStrength+","+maxVolume+","+madeIn+","+weight);
    }

    
}
