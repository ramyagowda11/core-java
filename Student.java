class Student{
	
	//properties
	
	String name;
	int rollNumber;
	int age;
	String gender;
	static String schoolName="svvm";
	static String className="section A";
	double percentage;
	String address;
	String parentName;
	String contactNumber;
	
	//functionalities
	 public String study(String subject){
		 System.out.println("subject name:"+subject);
		 return subject;
	 }
	 public int attendClass(int noOfClassAttend){
		 System.out.println("no of class student attended:"+noOfClassAttend);
		 return noOfClassAttend;
	 }
	 public String exam(String examDate){
		 System.out.println("exam date:"+examDate);
		 return examDate;
	 }
	 public String readBook(String bookName){
		 System.out.println("book name:"+bookName);
		 return bookName;
	 }
	 public String goToSchool(String schoolName){
		 System.out.println("school name:"+schoolName);
		 return schoolName;
	 }
	 public double getMarksCard(double percentage){
		 System.out.println("marks scored:"+percentage);
		 return percentage;
	 }
	 public String eatLunch(String lunchName){
		 System.out.println("lunch name:"+lunchName);
		 return lunchName;
	 }
	 public boolean checkScholarship(boolean s){
		 System.out.println("get scholtarship:"+s);
		 return s;
	 }
	 public String showGender(String showGender){
		 System.out.println("show gender:"+showGender);
		 return showGender;
	 }
	 public int getRollNumber(int rollNumber){
		 System.out.println("get roll number:"+rollNumber);
		 return rollNumber;
	 }
}