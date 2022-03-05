package abstraction;

public abstract class Car {
	
	public abstract void accelerate();  // abstract method
	
	public abstract void brake();  // abstract method
	
	public void honk() {            // Concrete method (regular method)
		System.out.println("Car is honking");
	}

}
