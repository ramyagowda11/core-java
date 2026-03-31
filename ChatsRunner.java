public class ChatsRunner {
    public static void main(String[] args){
        Chats gupta=new Chats();
        gupta.getChatsMenuDetails();
        System.out.println("---------");
        Chats shreya=new Chats();
        shreya.displayMenu("bhel puri");
        shreya.displayMenu("papadi chaat");
        shreya.displayMenu("aloo chat");
        shreya.displayMenu("samosa");
        System.out.println("-------");
        Chats mysore=new Chats();
        mysore.displayMenu("sev puri");
        mysore.displayMenu("corn chaat");
        mysore.displayMenu("dahi vada");
        mysore.displayMenu("raj kachori");
        System.out.println("-------");
        Chats bharadwaj=new Chats();
        bharadwaj.displayMenu("dabeli");
        bharadwaj.displayMenu("matar");
        bharadwaj.displayMenu("ragada pattice");
        bharadwaj.displayMenu("samosa");
        System.out.println("---------");
        Chats gokulChatsHouse=new Chats();
        gokulChatsHouse.displayMenu("katori chaat");
        gokulChatsHouse.displayMenu("raj kachori");
        gokulChatsHouse.displayMenu("corn chaat");
        gokulChatsHouse.displayMenu("matar");
    }
    
}
