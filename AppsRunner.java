public class AppsRunner {
    public static void main(String[] args){
        Apps app1=new Apps("instagram","social media",125.8f,4.5f,"english","meta platform inc");
        app1.appCategory="social media";
        app1.appSizeInMb=125.8f;
        app1.currentVersion=4.5f;
        app1.developers="meta platform inc";
        app1.language="english";
        app1.name="instagram";
        app1.getAppDetails();
        Apps app2=new Apps();
        
    }
    
}
