package conditionalStatements;

public class IfElseStatements {

	public static void main(String[] args) {
		
//		int noOfPetals = 5;
//		
//		if(noOfPetals % 2 == 0) {
//			System.out.println("He loves me not.");
//		} 
//		else {
//			System.out.println("He loves me.");
//		}
		
		int a = 15;
		int b = 18; 
		
		int maxOfBoth = 0;
		
		maxOfBoth = a>b ? a : b ; //   ternary operator is shorthand for if else statements
		
		System.out.println("Max of both numbers is : " + maxOfBoth);

	}

}
