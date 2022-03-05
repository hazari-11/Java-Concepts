package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();	
		
		Pet p = d;  // upcasting (Implicit Casting) 
		
		System.out.println(d.name); // o/p - Dobby 
		System.out.println(p.name); // o/p - Mike hence,we cannot override variables , we can override only methods
		
		//Animal a = d; // upcasting (Implicit Casting)
		
		//d.walk();
		//p.walk(); // output = Dog is walking -> Runtime Polymorphism
        
//		greetings("Good morning", 4);
	}
	
	public static void greetings() {    // method overloading
		System.out.println("Hi, there");
	}
	
	public static void greetings(String s) {    // method overloading
		System.out.println(s);
	}
	
	public static void greetings(String s, int count) {   // method overloading
		for(int i = 0 ; i<count ; i++) {
		System.out.println(s);
		}
	}

}
