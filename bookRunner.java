class bookRunner{
	public static void main(String []args){
		Book ref=new Book();
		ref.bookName="the journey to the stars";
		ref.publisher="harper colloins";
		ref.price=676;
		ref.noOfPages=56;
		ref.display();
		System.out.println("-----");
		
		Book ref2=new Book("the silent forest","pengvin random house",5654,67);;
		ref2.display();
		 
		
	}
}