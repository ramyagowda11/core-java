public class RobotMachineRunner {
    public static void main(String[] args){
       RobotMachine robotMachine1=new RobotMachine();
        robotMachine1.name="atlas";
        robotMachine1.ram=125.8f;
        robotMachine1.batteryLevel=100;
        robotMachine1.height=3.2f;
        robotMachine1.robotType="humaniod robot";
        robotMachine1.madeIn="china";
        robotMachine1.getRobotMachineDetails();
        RobotMachine robotMachine2=new RobotMachine("atlas","humaniod robot",100,125.8f,"china",3.2f);
    }
    
}
