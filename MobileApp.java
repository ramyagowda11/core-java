class MobileApp {
    
	//properties

    String appName;
    String version;
    String developer;
    int downloads;
    double rating;
    String platform;
    boolean hasAds;
    boolean hasLogin;
    int releaseYear;
    String category;
    static String company = "AppWorld";
    static String type = "Mobile";
	
	
	//functionalist

    public String download(String user) {
        System.out.println("Downloaded by: " + user);
        return user;
    }

    public String install(String device) {
        System.out.println("Installed on: " + device);
        return device;
    }

    public String update(String version) {
        System.out.println("Updated version: " + version);
        return version;
    }

    public double rate(double rating) {
        System.out.println("Rating given: " + rating);
        return rating;
    }

    public boolean showAds(boolean status) {
        System.out.println("Ads Displayed: " + status);
        return status;
    }

    public boolean login(boolean status) {
        System.out.println("Login status: " + status);
        return status;
    }

    public String share(String platform) {
        System.out.println("Shared via: " + platform);
        return platform;
    }

    public int totalDownloads(int count) {
        System.out.println("Total Downloads: " + count);
        return count;
    }

    public String search(String keyword) {
        System.out.println("Searching: " + keyword);
        return keyword;
    }

    public boolean logout(boolean status) {
        System.out.println("Logout: " + status);
        return status;
    }
}