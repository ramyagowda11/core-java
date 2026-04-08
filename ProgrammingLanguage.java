class ProgrammingLanguage {

     //properties

    String name;
    String version;
    String developer;
    int users;
    double popularity;
    String type;
    boolean isCompiled;
    boolean isObjectOriented;
    int releaseYear;
    String platform;
    static String category = "Language";
    static String field = "Software";
	
	
	//functionalities

    public String compile(String code) {
        System.out.println("Compiling: " + code);
        return code;
    }

    public String run(String code) {
        System.out.println("Running: " + code);
        return code;
    }

    public String debug(String code) {
        System.out.println("Debugging: " + code);
        return code;
    }

    public boolean install(boolean status) {
        System.out.println("Installed: " + status);
        return status;
    }

    public boolean update(boolean status) {
        System.out.println("Updated: " + status);
        return status;
    }

    public int totalUsers(int count) {
        System.out.println("Users: " + count);
        return count;
    }

    public double popularity(double rate) {
        System.out.println("Popularity: " + rate);
        return rate;
    }

    public String writeCode(String code) {
        System.out.println("Writing code: " + code);
        return code;
    }

    public String execute(String code) {
        System.out.println("Executing: " + code);
        return code;
    }

    public boolean secure(boolean status) {
        System.out.println("Secure: " + status);
        return status;
    }
}