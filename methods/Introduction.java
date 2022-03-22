package methods;

public class Introduction {

	public static void main(String[] args) {    // its also a method
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber , secondNumber);   //method calling
		
		maxOf(100,200);
		maxOf(2,4);
		
		System.out.println(result);
		sayHi();
		sayHi();
				
	}
	static int maxOf(int a , int b) {  //method creation
		if(a>b){
			return a;  //return a>b ? a : b;	
		}
		else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning!");
		System.out.println("This is Hazari");
	}

}
