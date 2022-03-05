package conditionalStatements;

public class IfElseIfElseStatements {

	public static void main(String[] args) {
		

		int number = 300;
		
		if(number <= 10) {
			System.out.println("Number is less than or eqaul to 10.");
		}
		else if(number > 10 && number <=20) {
			System.out.println("Number is between 10 and 20.");
		}
		else if(number > 20 && number <=30) {
			System.out.println("Number is between 20 and 30.");
		}
		else {
			System.out.println("Number is greater than 30.");	}
		
		
	}

}
