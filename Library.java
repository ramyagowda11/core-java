class Library {

    //properties

    String libraryName;
    String location;
    int numberOfBooks;
    int numberOfMembers;
    String librarianName;
    double membershipFee;
    boolean hasDigitalAccess;
    boolean hasReadingRoom;
    int establishedYear;
    String libraryType;
    static String country = "India";
    static String serviceType = "Education";
	
	//functionalities

    public String issueBook(String bookName) {
        System.out.println("Book Issued: " + bookName);
        return bookName;
    }

    public String returnBook(String bookName) {
        System.out.println("Book Returned: " + bookName);
        return bookName;
    }

    public String addBook(String bookName) {
        System.out.println("Book Added: " + bookName);
        return bookName;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean openLibrary(boolean status) {
        System.out.println("Library Open: " + status);
        return status;
    }

    public boolean allowReading(boolean status) {
        System.out.println("Reading Allowed: " + status);
        return status;
    }

    public String registerMember(String member) {
        System.out.println("Member Registered: " + member);
        return member;
    }

    public int totalBooks(int count) {
        System.out.println("Total Books: " + count);
        return count;
    }

    public String organizeEvent(String event) {
        System.out.println("Event Organized: " + event);
        return event;
    }

    public boolean maintainSilence(boolean status) {
        System.out.println("Silence Maintained: " + status);
        return status;
    }
}