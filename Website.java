class Website {

    //properties

    String siteName;
    String domain;
    String owner;
    int visitors;
    double loadTime;
    String hosting;
    boolean isSecure;
    boolean hasLogin;
    int launchYear;
    String category;
    static String company = "WebTech";
    static String type = "Web";
	
	//functionalities

    public String open(String url) {
        System.out.println("Opening URL: " + url);
        return url;
    }

    public String login(String user) {
        System.out.println("User login: " + user);
        return user;
    }

    public String logout(String user) {
        System.out.println("User logout: " + user);
        return user;
    }

    public double speed(double time) {
        System.out.println("Load time: " + time);
        return time;
    }

    public boolean secure(boolean status) {
        System.out.println("Secure: " + status);
        return status;
    }

    public boolean host(boolean status) {
        System.out.println("Hosting active: " + status);
        return status;
    }

    public int totalVisitors(int count) {
        System.out.println("Visitors: " + count);
        return count;
    }

    public String search(String keyword) {
        System.out.println("Search: " + keyword);
        return keyword;
    }

    public String updateContent(String content) {
        System.out.println("Content updated: " + content);
        return content;
    }

    public boolean maintain(boolean status) {
        System.out.println("Maintenance: " + status);
        return status;
    }
}