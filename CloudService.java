class CloudService {

    //properties

    String serviceName;
    String provider;
    String region;
    int users;
    double storage;
    String plan;
    boolean hasBackup;
    boolean isSecure;
    int launchYear;
    String type;
    static String category = "Cloud";
    static String industry = "IT";
	
	
	//functionalities

    public String deploy(String app) {
        System.out.println("Deployed: " + app);
        return app;
    }

    public double storeData(double size) {
        System.out.println("Stored Data: " + size);
        return size;
    }

    public boolean backup(boolean status) {
        System.out.println("Backup: " + status);
        return status;
    }

    public boolean secure(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }

    public String scale(String level) {
        System.out.println("Scaling: " + level);
        return level;
    }

    public int totalUsers(int count) {
        System.out.println("Users: " + count);
        return count;
    }

    public String monitor(String service) {
        System.out.println("Monitoring: " + service);
        return service;
    }

    public String update(String version) {
        System.out.println("Updated: " + version);
        return version;
    }

    public boolean run(boolean status) {
        System.out.println("Running: " + status);
        return status;
    }

    public String shutdown(String service) {
        System.out.println("Shutdown: " + service);
        return service;
    }
}