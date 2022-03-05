package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		
//		pq.add(45);
//		pq.add(100);
//		pq.add(12);
//		pq.add(1);
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove()); // 1 is of highest priority here
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		
		
		
		PriorityQueue<String> pq = new PriorityQueue<>();
	
        pq.add("Kiwi");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Banana");
        
        System.out.println(pq);
        
        System.out.println(pq.remove()); // Apple is of highest priority here
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
	}

}
