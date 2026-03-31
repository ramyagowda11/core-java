public class Speaker {
    String name;
    String model;
    int maxVolume;
    float outputPower;
    String madeIn;
    String developers;
    public Speaker(){
        System.out.println("default constructor:");
    }
    public void getSpeakerDetails(){
        System.out.println("Speaker name:"+name);
        System.out.println("Speaker model:"+model);
        System.out.println("Speaker maxVolume:"+maxVolume);
        System.out.println("Speaker outputPower:"+outputPower);
        System.out.println("Speaker madeIn:"+madeIn);
        System.out.println("Speaker developers:"+developers);
    }
    public Speaker(String name,String model,int maxVolume,float outputPower,String madeIn,String developers){
        System.out.println("parameterized constructor:"+name+","+model+","+maxVolume+","+outputPower+","+madeIn+","+developers);
    }
}
