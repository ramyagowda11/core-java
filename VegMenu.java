public class VegMenu {
    public void getVegMenuDetails(){
        System.out.println("invoking vegmenu details");
    }
    public void displayVegMenu(String vegFoodName){
        System.out.println("invoking displayveg menu");
        if(vegFoodName=="veggie burger"){
            System.out.println("Available");
        }else if(vegFoodName=="veg roll"){
            System.out.println("Available");
        }else if(vegFoodName=="fried rice"){
            System.out.println("Available");
        }else if(vegFoodName=="singapore rice"){
            System.out.println("Available");
        }else if(vegFoodName=="aloo masala"){
            System.out.println("Available");
        }else if(vegFoodName=="paneer burji"){
            System.out.println("Available");
        }else if(vegFoodName=="mushroom masala"){
            System.out.println("Available");
        }else if(vegFoodName=="paneer butter masala"){
            System.out.println("Availability");
        }else if(vegFoodName=="paneer masala"){
            System.out.println("Available");
        }else if(vegFoodName=="cheese peas curry"){
            System.out.println("Available");
        }else{
            System.out.println("not Available");
        }
        
    }
    
}
