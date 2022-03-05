package finalkeyword;

public final class Student {
	
//	final int rollNo ;  // blank final variable
//	final String name;  // blank final variable
//	
//	{
//		rollNo = 4;  // initializer block;
//	}
//	
//	public Student() {  // constructor
//		
//		name = "Rupesh";
//				
//	}
	
	int rollNo;
	String name;
	
	public final void getDescription() {
		System.out.println("The student name is " + name);
	}
}
