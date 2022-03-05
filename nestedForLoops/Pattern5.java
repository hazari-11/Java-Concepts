package nestedForLoops;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {     //for no of loops
			for(int j=1;j<=n-i;j++) {     //for spaces
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {   //for no of stars
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
