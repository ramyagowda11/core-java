public class NonVegMenu {
    public void getNonVegMenuDetails(){
        System.out.println("invoking nonvegmenu details");
    }
    public void displayNonVegMenu(String nonVegFoodName){
        System.out.println("invoking displaynonveg menu");
        if(nonVegFoodName=="chicken biryani"){
            System.out.println("Available");
        }else if(nonVegFoodName=="egg fried rice"){
            System.out.println("Available");
        }else if(nonVegFoodName=="mutto biryani"){
            System.out.println("Available");
        }else if(nonVegFoodName=="chicken lallipop"){
            System.out.println("Available");
        }else if(nonVegFoodName=="lemon chicken"){
            System.out.println("Available");
        }else if(nonVegFoodName=="chilli chicken"){
            System.out.println("Available");
        }else if(nonVegFoodName=="pepper chicken"){
            System.out.println("Available");
        }else if(nonVegFoodName=="chicken manchurian"){
            System.out.println("Availability");
        }else if(nonVegFoodName=="leg piece"){
            System.out.println("Available");
        }else if(nonVegFoodName=="chicken noodles"){
            System.out.println("Available");
        }else{
            System.out.println("not Available");
        }
        
    }
    public double checkFoodPriceByFoodName(String foodName){
        System.out.println("invoking checkFoodPriceByFoodName:"+foodName);
        double foodPrice=0.0;
        if(foodName=="chicken lallipop"){
            foodPrice=120.10;
        }else if(foodName=="egg fried rice"){
            foodPrice=90.00;
        }else if(foodName=="mutto biryani"){
            foodPrice=110.20;
        }else if(foodName=="chicken fry"){
            foodPrice=80.0;
        }else if(foodName=="lemon chicken"){
            foodPrice=75.30;
        }else if(foodName=="chilli chicken"){
            foodPrice=90.00;
        }else{
            System.out.println(foodName+ ":not available");
        }
        return foodPrice;

    }
    
}
