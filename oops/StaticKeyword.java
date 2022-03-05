package oops;

import oops.A.B;  // or A.B objB = objA.new B();  in 10th line
import oops.A.C;

public class StaticKeyword {
	
	static {
		
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}

	public static void main(String[] args) {
		
//		A objA = new A();
//		B objB = objA.new B(); //here B is so coupled with A like teacher-student and classes-school
//		
//		C objC = new A.C(); // objA not made just accessed with class name due to static keyword
     
		
		System.out.println("inside main");
	}
	static {
		System.out.println("in block 3");
	}

}
