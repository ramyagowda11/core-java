public class NonVegMenuRunner {
    public static void main(String[] args){
        NonVegMenu gowdruMilitaryHotelMenu=new NonVegMenu();
        gowdruMilitaryHotelMenu.getNonVegMenuDetails();
        System.out.println("--------");
        NonVegMenu samruddiHotelMenu=new NonVegMenu();
        samruddiHotelMenu.displayNonVegMenu("egg fried rice");
        samruddiHotelMenu.displayNonVegMenu("mutton biryani");
        samruddiHotelMenu.displayNonVegMenu("lallipoppepper");
        samruddiHotelMenu.displayNonVegMenu("chilli chicken");
        System.out.println("--------");
        NonVegMenu rmhMilitaryHotelMenu=new NonVegMenu();
        rmhMilitaryHotelMenu.displayNonVegMenu("egg biryani");
        rmhMilitaryHotelMenu.displayNonVegMenu("egg noodles");
        rmhMilitaryHotelMenu.displayNonVegMenu("chicken biryani");
        rmhMilitaryHotelMenu.displayNonVegMenu("lemon chicken");
        System.out.println("------");
        NonVegMenu amburDumBiryaniMenu=new NonVegMenu();
        amburDumBiryaniMenu.displayNonVegMenu("leg piece");
        amburDumBiryaniMenu.displayNonVegMenu("pepper chicken");
        amburDumBiryaniMenu.displayNonVegMenu("chicken manchurian");
        amburDumBiryaniMenu.displayNonVegMenu("chicken 65");
        System.out.println("------");
        NonVegMenu hotelSipayiMenu=new NonVegMenu();
        hotelSipayiMenu.displayNonVegMenu("chicken noodels");
        hotelSipayiMenu.displayNonVegMenu("chicken lallipop");
        hotelSipayiMenu.displayNonVegMenu("egg fried rice");
        hotelSipayiMenu.displayNonVegMenu("sholay kabab");
        System.out.println("-------");

        
        double price=hotelSipayiMenu.checkFoodPriceByFoodName("chicken lallipop");
        System.out.println("the price is:"+price);
        double price1=hotelSipayiMenu.checkFoodPriceByFoodName("chicken lallipop");
         System.out.println("the price is:"+price1);
        double price2=hotelSipayiMenu.checkFoodPriceByFoodName("egg fried rice");
        System.out.println("the price is:"+price2);
        double price3=hotelSipayiMenu.checkFoodPriceByFoodName("chicken fried rice");
        System.out.println("the price is:"+price3);
        
    }
}
