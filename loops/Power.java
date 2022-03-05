package loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Number:");
		int x = sc.nextInt();
		System.out.println("Power: ");
		int y= sc.nextInt();
		int result=1;
		
		for(int i=1;i<=y;i++)
		{
			result*=x;
		}
		System.out.println(result);

	}

}
