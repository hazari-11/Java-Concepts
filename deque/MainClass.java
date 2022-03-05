package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//		ad.addFirst(12);
//		ad.addFirst(23);
//		
//		ad.pop();                       // queue
//		System.out.println(ad.peek());  // 12 because queue removes the thing from front
		
		ad.push(12);
		ad.push(23);                   // stack
		ad.push(34);
		
		System.out.println(ad.pop());  // 34
		System.out.println(ad.pop());  // 23

	}

}
