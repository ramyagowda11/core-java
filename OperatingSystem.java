class OperatingSystem {

    //properties

    String osName;
    String version;
    String developer;
    int users;
    double size;
    String platform;
    boolean isOpenSource;
    boolean hasGUI;
    int releaseYear;
    String type;
    static String company = "SystemSoft";
    static String category = "OS";
	
	//functionalities

    public String boot(String mode) {
        System.out.println("Boot mode: " + mode);
        return mode;
    }

    public String shutdown(String status) {
        System.out.println("Shutdown: " + status);
        return status;
    }

    public String update(String version) {
        System.out.println("Updated to: " + version);
        return version;
    }

    public boolean install(boolean status) {
        System.out.println("Installed: " + status);
        return status;
    }

    public double memory(double size) {
        System.out.println("Memory: " + size);
        return size;
    }

    public boolean run(boolean status) {
        System.out.println("Running: " + status);
        return status;
    }

    public int totalUsers(int count) {
        System.out.println("Users: " + count);
        return count;
    }

    public String openApp(String app) {
        System.out.println("Opening app: " + app);
        return app;
    }

    public String closeApp(String app) {
        System.out.println("Closing app: " + app);
        return app;
    }

    public boolean secure(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }
}