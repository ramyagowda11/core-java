class Phone2 {                                                                               

    Phone2() {
        this("ramya");
		System.out.println("default consructor 1:");
    }

    Phone2(String userFirstName) {
        this("ramya","bk");
		System.out.println("parameterized consructor 2:");
		System.out.println("user First name:"+userFirstName);
    }

    Phone2(String userFirstName, String userLastName) {
        this("ramya",9999.9f);
		System.out.println("parameterized constructor 3");
		System.out.println("user First name:"+userFirstName);
		System.out.println("user Last name:" +userLastName);
    }

    Phone2(String userFirstName,float price)
	{
        this("ramya",563);
		System.out.println("parameterized constructor 4");
		System.out.println("user First name:"+userFirstName);
		System.out.println("price:"+price);
    }
	Phone2(String  userFirstName, int storage) {
        System.out.println("parameterized constructor 5");
		System.out.println("user First name:"+userFirstName);
		System.out.println("storage:"+storage);
    }
	
}