package exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
//		try {             // Exception Handling  (try keyword)
////		int a = 5 ;
////		
////		int b = 0 ;
////		
////		int c = a/b ;
////		
////		System.out.println(c);
//			
//			int[] a = new int[5];
//			
//			System.out.println(a[6]);
//
//	} catch(ArithmeticException e) {        // Exception Handling  (catch keyword)
//		
//		System.out.println(e.getMessage() + " occured, please check your code.");
//		
//	}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index should be in the range of 0 and size of  array.");
//	}
//		catch(IllegalArgumentException e) {
//			System.out.println("Check your casting carefully.");
//		}
//		finally {                // finally keyword
//			System.out.println("Sorry for the inconvenience");
//		}
//		
//		System.out.println("Very iportant code");
//	    System.out.println("Need to run");	
//		
		fun1();
  }
     
	static void fun1() {
		
		int a = 5 ;
		
		int b = 3 ;
		
		int c = a/b ;
		
		System.out.println(c);
		
		try {
		Thread.sleep(1000); // fun2() ;
		} catch(Exception e) {
			System.out.println(e.getMessage() + " occured");
		}
//		boolean isDanger = true;
//		
//		if(isDanger) {
//			
//			throw new ArrayIndexOutOfBoundsException("danger was coming");  //exception object
//			
//		}
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{   //throws keyword (used in methods)
        boolean isDanger = true;
		
		if(isDanger) {
			
			throw new ArrayIndexOutOfBoundsException("danger was coming");  // throw keyword (exception object)
			
		}
	}
}
