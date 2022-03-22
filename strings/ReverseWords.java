package strings;

import java.util.Scanner;


class Soution{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s = sc.nextLine();
		
		int i = s.length()-1 ;
		
		String ans = "";
		
		while(i>0) {
			
			while(i>=0 && s.charAt(i) == ' ') i-- ; //for spaces in last
			
			int j = i;
			
			if(i<0) break;    // for spaces in beginning
			
			while(i>=0 && s.charAt(i) != ' ') i-- ;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring (i+1,j+1) );
			}
			else
			{
				ans = ans.concat(" " + s.substring (i+1,j+1) ); //for spaces in between
			}
		}
		System.out.println(ans);
	}
}

