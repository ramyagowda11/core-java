class Paytm{
    Paytm()
	{
		this("sbi");
		System.out.println("default constructor 1");
	}
	
	Paytm(String bankName)
	{
		this("sbi","mandya");
		System.out.println("parameterized constructor 2");
		System.out.println("bank Name:"+bankName);
	}
	Paytm(String bankName,String branch)
	{
		this("sbi",50000.0);
		System.out.println("parameterized constructor 3");
		System.out.println("bank Name:"+bankName);
		System.out.println("branch:"+branch);
	}
	Paytm(String bankName,double limitOfTransferFund)
	{
		this("sbi",10);
		System.out.println("parameterized constructor 4");
		System.out.println("bank Name:"+bankName);
		System.out.println("limit of transfer fund:"+limitOfTransferFund);
	}
	Paytm(String bankName,int noOfWorkers)
	{
		System.out.println("parameterized constructor 5");
		System.out.println("bank Name:"+bankName);
		System.out.println("no of workers:"+noOfWorkers);
		
	}

}