package recursion;
import java.util.*;

public class AdvancedProblems {
	
	static Set<String> set = new HashSet<>(); // now the strings will not repeat

	public static void main(String[] args) {
		
//		int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
//				     {1, 1, 1, 1, 1, 1, 0, 0},
//				     {1, 0, 0, 1, 1, 0, 1, 1},
//				     {1, 2, 2, 2, 2, 0, 1, 0},
//				     {1, 1, 1, 2, 2, 0, 1, 0},
//				     {1, 1, 1, 2, 2, 2, 2, 0},
//				     {1, 1, 1, 1, 1, 2, 1, 1},
//				     {1, 1, 1, 1, 1, 2, 2, 1},
//		};
//		
//		floodFill(a, 4 ,3 ,3 ,2);
//		printMatrix(a);
		
		//permutations("abcc", 0 , 3);
		
		int a[] = {1, 5, 700, 2};
		System.out.println(coinMax(a, 0, a.length-1));

	}
	
//	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
//		int rows = a.length;
//		int cols = a[0].length;
//		
//		if(r < 0 || r>= rows || c < 0 || c >= cols) {
//			return;
//		}
//		if(a[r][c] != prevFill) {
//			return;
//		}
//		a[r][c] = toFill;
//		
//		floodFill(a, r-1, c, toFill, prevFill);
//		floodFill(a, r, c-1 , toFill, prevFill);
//		floodFill(a, r+1, c, toFill, prevFill);
//		floodFill(a, r, c+1 , toFill, prevFill);
//	}
//   static void printMatrix(int a[][]) {  // error
//	   System.out.println(a);            // error
//   }                                     // error
	
	
//    static void permutations(String s, int l, int r) {
//    	if(l == r) {                        // base condition
//    		if(set.contains(s)) return;     // to not repeat the string
//    		set.add(s);
//    		System.out.println(s);
//    		return;
//    	}
//    	
//    	for(int i=l; i<=r ; i++) {
//    		s = interchangeChar(s, l , i); // replace character at i with left character
//    		permutations(s, l+1, r);
//    		s = interchangeChar(s, l ,i);  // again moving to abc (means original position) (backtracking)
//    	}
//    }
//    static String interchangeChar(String s, int a , int b) {
//    	char array[] = s.toCharArray();
//    	char temp = array[a];
//    	array[a] = array[b];
//    	array[b] = temp;
//    	return String.valueOf(array);
//    }
	
	static int coinMax(int a[] , int l , int r) {
		
		if(l+1 == r) {         // base condition
			return Math.max(a[l],  a[r]);
		}
		return Math.max(a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1 )),
				        a[r] + Math.min(coinMax(a, l+1 , r-1), coinMax(a, l ,r-2)));   // recursive faith
		
	}
}
