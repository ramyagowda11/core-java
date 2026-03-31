public class Apps {
    String name;
    String appCategory;
    float currentVersion;
    float appSizeInMb;
    String language;
    String developers;
    public Apps(){
        System.out.println("default parameter");
    }
    public void getAppDetails(){
        System.out.println("app name:"+name);
        System.out.println("app category:"+appCategory);
        System.out.println("app current version:"+currentVersion);
        System.out.println("app size in mb:"+appSizeInMb);
        System.out.println("app language:"+language);
        System.out.println("app developers:"+developers);
    }
    public Apps(String name,String appCategory,float currentVersion,float appSizeInMb,String language,String developers){
        System.out.println("Construcytor with parameter:"+name+","+appCategory+","+currentVersion+","+appSizeInMb+","+language+","+developers);
        
    }
    
}
