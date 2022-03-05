package oops;

class Cat{
	boolean hasFur ;  //state(properties)
	String color, breed; //state
	int legs,eyes; //state
	
	public void walk() {        // behaviour in methods(in Java)(functions in C)
		System.out.println("Cat is walking.");
	}
	public void eat() {
		System.out.println("Cat is eating.");  // behaviour in methods
	}
	
	public void description() {   //state
		System.out.println("My cat has "+ legs +" legs and " + eyes + " eyes.");
	}
	
}

//class Dog{
//	
//	String breed , name;
//	
//	public void jump() {    //state
//		System.out.println("My dog " + name + " jumped ");
//	}
//	
//	public void description() {   //behaviour
//		System.out.println("My dog name is "+ name + " and its breed is " + breed);
//	}
//}

public class MainClass {

	public static void main(String[] args) {
	
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.walk();
        cat2.eat();
		
		cat1.legs = 3;  //properties
		cat1.eyes = 2;  //properties
		
		cat2.legs = 4;
		cat2.eyes = 1;
		
		cat1.description();
		cat2.description();
		
//		Dog husky = new Dog();
//		Dog poodle = new Dog();
//		
//		husky.breed = "Husky";
//		husky.name = "Browny";
//		
//		poodle.breed = "Poodle";
//		poodle.name = "Rocky";
//		
//		husky.jump();
//		husky.description();
//		
//		poodle.jump();
//		poodle.description();
	}

}
