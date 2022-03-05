package linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		
//		myLL.add(12);
//		myLL.add(56);
		
		for(int i=0 ; i<10 ; i++) {
			myLL.add(i + "added");
		}
		myLL.print();
		
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);
//
//	}
//	
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();  // current time
//		
//		for(int i=0 ; i<100000 ; i++) {
//		//	list.add(i); // 17,20
//			list.add(0,i); // 0th index  // 1319,21
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + " --> " + (end-start));
	}

}


