public class pencilRunner {
    public static void main(String[] args){
        Pencil pencil1=new Pencil("fabercastell","hb",190,2.0f,"high","black");
        pencil1.brand="faber-castell";
        pencil1.pencilGrade="hb";
        pencil1.length=190;
        pencil1.thickness=2.0f;
        pencil1.color="black";
        pencil1.breakResistance="high";
        pencil1.getPencilDetails();
        Pencil pencil2=new Pencil();

    }
    
}
