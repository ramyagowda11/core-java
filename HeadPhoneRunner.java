public class HeadPhoneRunner {
    public static void main(String[] args){
        HeadPhone.getHeadPhoneFunction();
        HeadPhone.getHeadPhoneBrand("apple");
        int price=HeadPhone.getHeadPhonePrice(5000);
        System.out.println("head phone price:"+price);
        int battery=HeadPhone.getHeadPhoneBattery();
        System.out.println("head phone battery:"+battery);
    }
    
}
