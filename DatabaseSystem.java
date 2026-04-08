class DatabaseSystem {

     //properties

    String dbName;
    String version;
    String vendor;
    int tables;
    double size;
    String type;
    boolean isRelational;
    boolean hasBackup;
    int createdYear;
    String language;
    static String company = "DataTech";
    static String category = "Database";
	
	
	//functionalities

    public String createTable(String table) {
        System.out.println("Table created: " + table);
        return table;
    }

    public String insertData(String data) {
        System.out.println("Data inserted: " + data);
        return data;
    }

    public String updateData(String data) {
        System.out.println("Data updated: " + data);
        return data;
    }

    public String deleteData(String data) {
        System.out.println("Data deleted: " + data);
        return data;
    }

    public boolean backup(boolean status) {
        System.out.println("Backup: " + status);
        return status;
    }

    public boolean restore(boolean status) {
        System.out.println("Restore: " + status);
        return status;
    }

    public int totalTables(int count) {
        System.out.println("Tables: " + count);
        return count;
    }

    public double size(double size) {
        System.out.println("DB Size: " + size);
        return size;
    }

    public String query(String q) {
        System.out.println("Query: " + q);
        return q;
    }

    public boolean secure(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }
}