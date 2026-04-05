class Jewellery{
    Jewellery()
	{
		this("bangle");
		System.out.println(" i bought something bangle 1");
	}
	
	Jewellery(String jewelleryName)
	{
		this("bangle","bhima jewellers");
		System.out.println("i bought something bangle 2");
		System.out.println("jewellery Name:"+jewelleryName);
	}
	Jewellery(String jewelleryName,String shopName)
	{
		this("bangle",78000.0);
		System.out.println("i bought something bangle 3");
		System.out.println("jewellery Name:"+jewelleryName);
		System.out.println("shop name:"+shopName);
	}
	Jewellery(String jewelleryName,double jewelleryPrice)
	{
		this("puma shoes",10);
		System.out.println("i bought something bangle 4");
		System.out.println("jewellery Name:"+jewelleryName);
		System.out.println("jewellery Price:"+jewelleryPrice);
	}
	Jewellery(String jewelleryName,int noOfBranches)
	{
		System.out.println("i bought something bangle 5");
		System.out.println("jewellery Name:"+jewelleryName);
		System.out.println("shop no of branches:"+noOfBranches);
		
	}
}