public class SpeakerRunner {
     public static void main(String[] args){
       Speaker speaker1=new Speaker();
        speaker1.madeIn="usa";
        speaker1.outputPower=125.8f;
        speaker1.maxVolume=100;
        speaker1.developers="meta platform inc";
        speaker1.model="echo dotgen";
        speaker1.name="boltie";
        speaker1.getSpeakerDetails();
        Speaker speaker2=new Speaker("boltie","echo dotgen",100,125.8f,"usa","meta platform inc");
    }
    
}
