package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList(); 
	 //   List<String> vegetables = new ArrayList();
		
		fruits.add("Apple");   // add method
		fruits.add("Orange"); 
		fruits.add("Hi");
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp) ;
		
		for(String e:temp) {
			System.out.println(e);
		}
		
//		System.out.println(fruits.isEmpty());  // empty method
		
//		System.out.println(fruits.contains("Guava"));  // contains method
		
//		System.out.println(fruits.size());  // size method
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
//		
//		fruits.removeAll(toRemove); // removeAll method
		
	//	fruits.clear(); // clear method
		
//		fruits.set(1, "Banana"); // set method
//		
//		fruits.remove(2);  // remove method
		
		
	//	System.out.println(fruits.get(1));  // get method
		
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		
//		fruits.addAll(vegetables);  // addAll method
		
//		System.out.println(fruits);
		
//		ArrayList<Integer> marks = new ArrayList();
//	
//	    Pair<String, Integer> p1 = new Pair("Rupesh", 654);
//        Pair<Boolean,  String> p2 = new Pair(true, "Hello");
//        
//        p1.getDescription();
//        p2.getDescription();
        

	}

}
