package queue;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(451);
		System.out.println(mq.dequeue());
		
	//	Queue<Integer> q = new LinkedList<>();
		
	//	q.remove(); // exception thrown
		
	//	System.out.println(q.poll()); // null
		
//		q.add(12);
//		q.add(23);  // add
//		q.add(34);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());  // remove  // 12
//		System.out.println(q.remove());  // 23
//		
//		System.out.println(q.element());  // element // 34

	}

}
