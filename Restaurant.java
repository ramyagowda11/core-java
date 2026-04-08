class Restaurant {

    //properties

    String restaurantName;
    String location;
    int numberOfTables;
    int numberOfStaff;
    String managerName;
    double averageCost;
    boolean hasDelivery;
    boolean hasParking;
    int establishedYear;
    String cuisineType;
    static String country = "India";
    static String serviceType = "Food Service";
	
	
	//functionalities

    public String takeOrder(String order) {
        System.out.println("Order Taken: " + order);
        return order;
    }

    public String serveFood(String dish) {
        System.out.println("Food Served: " + dish);
        return dish;
    }

    public double generateBill(double amount) {
        System.out.println("Bill Amount: " + amount);
        return amount;
    }

    public String assignChef(String chefName) {
        System.out.println("Chef Assigned: " + chefName);
        return chefName;
    }

    public boolean startDelivery(boolean status) {
        System.out.println("Delivery Started: " + status);
        return status;
    }

    public boolean openRestaurant(boolean status) {
        System.out.println("Restaurant Open: " + status);
        return status;
    }

    public String bookTable(String customer) {
        System.out.println("Table Booked for: " + customer);
        return customer;
    }

    public int totalCustomers(int count) {
        System.out.println("Total Customers: " + count);
        return count;
    }

    public String organizeEvent(String event) {
        System.out.println("Event Organized: " + event);
        return event;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}