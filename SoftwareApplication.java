class SoftwareApplication {

    //properties

    String appName;
    String version;
    String developer;
    int numberOfUsers;
    double appSize;
    String platform;
    boolean isOpenSource;
    boolean hasUI;
    int releaseYear;
    String category;
    static String company = "TechSoft";
    static String type = "Application";
	
	
	//functionalities

    public String install(String device) {
        System.out.println("Installed on: " + device);
        return device;
    }

    public String update(String version) {
        System.out.println("Updated to: " + version);
        return version;
    }

    public String login(String user) {
        System.out.println("User logged in: " + user);
        return user;
    }

    public boolean run(boolean status) {
        System.out.println("Application running: " + status);
        return status;
    }

    public double calculateSize(double size) {
        System.out.println("App Size: " + size);
        return size;
    }

    public String crashReport(String issue) {
        System.out.println("Crash Report: " + issue);
        return issue;
    }

    public int totalUsers(int users) {
        System.out.println("Total Users: " + users);
        return users;
    }

    public String changeTheme(String theme) {
        System.out.println("Theme changed: " + theme);
        return theme;
    }

    public boolean enableNotification(boolean status) {
        System.out.println("Notification Enabled: " + status);
        return status;
    }

    public String logout(String user) {
        System.out.println("User logged out: " + user);
        return user;
    }
}