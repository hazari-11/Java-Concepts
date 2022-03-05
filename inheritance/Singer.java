package inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		super(name);
		
	}
	public void sing() {
		System.out.println(name +" is singing");
	}
	public void eat() {
		System.out.println("Singer "+name +" is eating");  //method overriding
	}
	public static void laughing() {
		System.out.println("Singer is laughing");
	}

}
