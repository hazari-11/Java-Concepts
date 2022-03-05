package polymorphism;

public class Dog extends Pet {
	
	String name = "Dobby";
	
	public void walk() {    // method overriding 
		System.out.println("Dog is walking");
	}

}
