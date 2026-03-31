public class ChairRunner {
    public static void main(String[] args){
        Chair chair1=new Chair();
        chair1.availableColor="brown";
        chair1.chairHeight=0.95f;
        chair1.chairType="office";
        chair1.chairWidth=55;
        chair1.material="wood";
        chair1.weightCapacity=120;
        chair1.getChairDetails();
        Chair chair2=new Chair("wood","office",120,0.95f,"brown",55);
    }
    
}
