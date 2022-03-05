package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12, b = 18, c = 100;
		int result = 0;
		
//		if (a > b) {
//			if (a > c) {
//				result = a;
//			}
//			else {
//				result = c;
//			}
//		}
//		else{
//			 if (b>c) 
//			 {
//				result = b;
//			}
//			else {
//				result = c;
//			}}
		result = a>b ? a>c ? a : c : b>c ? b : c ;
		System.out.println("largest = " +result);
	}

}
