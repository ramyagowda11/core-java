class Bank {
      
     //properties
	 
    String bankName;
    String branch;
    int numberOfAccounts;
    int numberOfEmployees;
    String managerName;
    double minimumBalance;
    boolean hasLoanFacility;
    boolean hasATM;
    int establishedYear;
    String bankType;
    static String country = "India";
    static String serviceType = "Financial";
	
	//functionalities

    public String openAccount(String customerName) {
        System.out.println("Account opened for: " + customerName);
        return customerName;
    }

    public double deposit(double amount) {
        System.out.println("Deposited: " + amount);
        return amount;
    }

    public double withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
        return amount;
    }

    public String assignManager(String name) {
        System.out.println("Manager Assigned: " + name);
        return name;
    }

    public boolean provideLoan(boolean status) {
        System.out.println("Loan Provided: " + status);
        return status;
    }

    public boolean activateATM(boolean status) {
        System.out.println("ATM Active: " + status);
        return status;
    }

    public String generateStatement(String account) {
        System.out.println("Statement Generated for: " + account);
        return account;
    }

    public int totalAccounts(int count) {
        System.out.println("Total Accounts: " + count);
        return count;
    }

    public String organizeMeeting(String meeting) {
        System.out.println("Meeting Organized: " + meeting);
        return meeting;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }
}