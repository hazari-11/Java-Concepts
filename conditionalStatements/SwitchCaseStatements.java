package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
//		int dayOfWeek = 8;
//		
//		switch(dayOfWeek) {
//		case 1:
//			System.out.println("I am on leave.");
//			break;
//		case 2:
//			System.out.println("I am on duty.");
//			break;
//		case 3:
//			System.out.println("I am in playground.");
//			break;
//		case 4:
//			System.out.println("I am with family.");
//			break;
//		default:
//			System.out.println("I am drunk today.");
//		}
        
		int rating = 5;
		
		switch (rating) {
		case 1:
		case 2:
			System.out.println("Bad review");
			break;
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:
			System.out.println("Good review");
			break;
		}
	}

}
