public class Chats {
    public void getChatsMenuDetails(){
        System.out.println("invoking getChatsMenuDetails");
    }
    public String displayMenu(String chatsName){
        System.out.println("invoking displaymenu:"+chatsName);
        String result="null";
        if(chatsName=="bhel piri"){
            result="Available";
        }else if(chatsName=="pani puri"){
            result="Available";
        }else if(chatsName=="papdi chaat"){
             result="Available";
        }else if(chatsName=="aloo tikki"){
             result="Available";
        }else if(chatsName=="sev puri"){
             result="Available";
        }else if(chatsName=="dahi vada"){
             result="Available";
        }else if(chatsName=="samosa"){
             result="Available";
        }else if(chatsName=="masala puri"){
             result="Available";
        }else if(chatsName=="raj kachori"){
             result="Available";
        }else if(chatsName=="corn chaat"){
             result="Available";
        }else{
            System.out.println(chatsName+" not Available");
        }
        return result;
    }
    
    
}
