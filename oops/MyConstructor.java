package oops;

class Vehicle{
	
	int wheels;
	int headLights;
	String color;
	
	Vehicle() {  //default constructor
		
	}
	
	Vehicle(int wheels) {
		this.wheels = wheels; //this keyword
		headLights = 2;
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		//car.wheels = 4;   //if there will be no constructor, we would do like it
		
		Vehicle eRikshaw = new Vehicle(3,"Yellow");
		
		Vehicle random = new Vehicle();  //default constructor
		
		System.out.println(eRikshaw.wheels + " wheels and color = "+ eRikshaw.color);

	}

}
