class Jewellery1{
    Jewellery1()
	{
		this("bangle");
		System.out.println(" i bought something bangle 1");
	}
	
	Jewellery1(String jewelleryName)
	{
		this("bangle","bhima jewellers");
		System.out.println("i bought something bangle 2");
		System.out.println("jewellery Name:"+jewelleryName);
	}
	Jewellery1(String jewelleryName,String shopName)
	{
		this("bangle","bhima jewellers",78000.0);
		System.out.println("i bought something bangle 3");
		System.out.println("jewellery Name:"+jewelleryName);
		System.out.println("shop name:"+shopName);
	}
	Jewellery1(String jewelleryName,String shopName,double jewelleryPrice)
	{
		this("bangle","bhima jewellers",78000.0,10);
		System.out.println("i bought something bangle 4");
		System.out.println("jewellery Name:"+jewelleryName);
		System.out.println("jewellery Price:"+jewelleryPrice);
	}
	Jewellery1(String jewelleryName,String shopName,double jewelleryPrice,int noOfBranches)
	{
		System.out.println("i bought something bangle 5");
		System.out.println("jewellery Name:"+jewelleryName);
		System.out.println("shop no of branches:"+noOfBranches);
		
	}
}