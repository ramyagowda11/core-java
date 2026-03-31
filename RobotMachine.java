public class RobotMachine{
    String name;
    String robotType;
    int batteryLevel;
    float ram;
    String madeIn;
    float height;
    public RobotMachine(){
        System.out.println("default constructor:");
    }
    public void getRobotMachineDetails(){
        System.out.println("machine name:"+name);
        System.out.println("robot Type:"+robotType);
        System.out.println("machine ram:"+ram);
        System.out.println("machine battery Level:"+batteryLevel);
        System.out.println("machine madeIn:"+madeIn);
        System.out.println("machine height:"+height);
    }
    public RobotMachine(String name,String robotType,int batteryLevel,float ram,String madeIn,float height){
        System.out.println("parameterized constructor:"+name+","+robotType+","+ram+","+batteryLevel+","+madeIn+","+height);
    }

     
}
