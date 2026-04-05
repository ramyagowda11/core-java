class Book{
String bookName;
String publisher;
int price;
int noOfPages;

public Book(){
	System.out.println("default constructor:");
	
}

public Book(String bookName,String publisher,int price,int noOfPages){
	this.bookName=bookName;
	this.publisher=publisher;
	this.price=price;
	this.noOfPages=noOfPages;
}

public void display(){
	System.out.println("book name:"+bookName);
	System.out.println("publisher name"+publisher);
	System.out.println("book price:"+price);
	System.out.println("book no of pages:"+noOfPages);
	
}
}