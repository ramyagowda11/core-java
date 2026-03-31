public class Pencil {
    String brand;
    String pencilGrade;
    int length;
    float thickness;
    String breakResistance;
    String color;
    public Pencil(String brand,String pencilGrade,int length,float thickness,String breakResistance,String color){
        System.out.println("constructor with parameter:"+brand+","+pencilGrade+","+length+","+thickness+","+breakResistance+","+color);
    }
    public void getPencilDetails(){
        System.out.println("pencil brand:"+brand);
        System.out.println("pencil grade:"+pencilGrade);
        System.out.println("pencil length:"+length);
        System.out.println("pencil thickness:"+thickness);
        System.out.println("pencil break resistance:"+breakResistance);
        System.out.println("pencil color:"+color);
    }
    public Pencil(){
    System.out.println("default constructor");
}
    
}
