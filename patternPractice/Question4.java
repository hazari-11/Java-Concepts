package patternPractice;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=1;
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=1 ; j<=1 ; j++) {
				
				System.out.print(number +" ");}
			for(int j=2;j<=2*i-2;j++) {
				System.out.print("0 ");
			}if(i>1) {
			for(int j=2 ; j<=2 ; j++) {
				System.out.print(number+" ");
			}}
			
			number++;
			System.out.println();
		}

	}

}
