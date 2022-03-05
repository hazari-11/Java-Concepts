package inheritance;

public class Teacher extends Person {
	
	public Teacher(String name) {
		super(name);  // parent class constructor called 
		System.out.println("inside Teacher constructor");
	}
	
	public void teach() {
		System.out.println(name + " is teaching");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Teacher "+name +" is eating");  //method overriding
	}
	public static void laughing() {
		System.out.println("Teacher is laughing");
	}
	

}
