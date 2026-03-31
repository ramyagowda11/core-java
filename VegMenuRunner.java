public class VegMenuRunner {
    public static void main(String[] args){
        VegMenu udupiVaibhavMenu=new VegMenu();
        udupiVaibhavMenu.getVegMenuDetails();
        System.out.println("--------");
        VegMenu adyarAnadaHotelMenu=new VegMenu();
        adyarAnadaHotelMenu.displayVegMenu("fried rice");
        adyarAnadaHotelMenu.displayVegMenu("aloo masala");
        adyarAnadaHotelMenu.displayVegMenu("kaju kofta");
        adyarAnadaHotelMenu.displayVegMenu("veg aangara");
        System.out.println("--------");
        VegMenu hotelHalliManeMenu=new VegMenu();
        hotelHalliManeMenu.displayVegMenu("paneer butter masala");
        hotelHalliManeMenu.displayVegMenu("singapore rice");
        hotelHalliManeMenu.displayVegMenu("kaju masala");
        hotelHalliManeMenu.displayVegMenu("cheese masala");
        System.out.println("------");
        VegMenu maharajaHotelMenu=new VegMenu();
        maharajaHotelMenu.displayVegMenu("cheese peas curry");
        maharajaHotelMenu.displayVegMenu("veggie burger");
        maharajaHotelMenu.displayVegMenu("mushroom masala");
        maharajaHotelMenu.displayVegMenu("kaju kofta");
        System.out.println("------");
        VegMenu ruchuiManeHotelMenu=new VegMenu();
        ruchuiManeHotelMenu.displayVegMenu("veg roll");
        ruchuiManeHotelMenu.displayVegMenu("paneer butter masala");
        ruchuiManeHotelMenu.displayVegMenu("aloo masala");
        ruchuiManeHotelMenu.displayVegMenu("veg aangara");
    }
}
