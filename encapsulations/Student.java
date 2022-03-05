package encapsulations;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {   // make a method and then get
		return age;
	}
	
	public void setAge(int age) {  // make a method and then set 
		
		if(age>20) {
			System.out.println("you are too old");
		}
		else {
		this.age = age;
		}
	}
	
	
}
