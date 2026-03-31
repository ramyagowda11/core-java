public class MriMachineRunner {
     public static void main(String[] args){
       MriMachine mriMachine1=new MriMachine();
        mriMachine1.madeIn="usa";
        mriMachine1.fieldStrength=125.8f;
        mriMachine1.maxVolume=300;
        mriMachine1.weight=3.2f;
        mriMachine1.model="echo dotgen";
        mriMachine1.brand="MRI";
        mriMachine1.getSpeakerDetails();
        MriMachine mriMachine2=new MriMachine("MRI","echo dotgen",300,125.8f,"usa",3.2f);
    }
    
    
}
