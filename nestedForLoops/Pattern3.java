package nestedForLoops;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {  //for no of outer loops
			for(int j=1 ; j<=i-1 ; j++) {   //for spaces
				System.out.print("  ");
			}
		for(int j = 1 ; j<=n-i+1 ; j++) {  // for star
			System.out.print("* ");
		}
		System.out.println();
		}

	}

}
