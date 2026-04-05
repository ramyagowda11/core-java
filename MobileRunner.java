 class MobileRunner {
    public static void main(String[] args){
        Mobile.getMobileFunction();
        Mobile.getMobileBrand("apple");
        int price=Mobile.getMobilePrice(5000);
        System.out.println("Mobile price:"+price);
        int battery=Mobile.getMobileBattery();
        System.out.println("Mobile battery:"+battery);
    }
    
}
