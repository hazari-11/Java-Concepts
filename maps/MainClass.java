package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
//		Map<String , Integer> numbers = new HashMap<>();  // <Key , Value>
//		
//		numbers.put("one", 1);
//		numbers.put("two", 2);
//		numbers.put("five", 5);
//		
//		//numbers.put("one", 10);
//		
//		//numbers.putIfAbsent("one", 10);
//		
//		//System.out.println(numbers); // {one=1(10), two=2, five=5}
//		
//		//System.out.println(numbers.get("two"));
//		
//        //System.out.println(numbers.containsKey("three"));
//		
//		//System.out.println(numbers.containsValue(5));
//		
//		numbers.remove("two", 4);
//		
//		System.out.println(numbers);
//		System.out.println(numbers.keySet()); // [one , two , five]
//		System.out.println(numbers.values()); // [1, 2, 5]
//		System.out.println(numbers.entrySet()); // [one=1 , two=2, five=5]
//		
//		Set<Entry<String , Integer>> entries = numbers.entrySet();  // entry set
//		
//		for(Entry<String, Integer> entry: entries) {   // for each loop
//			
//			entry.setValue(entry.getValue() * 100);
//			
//		}
//		
//		System.out.println(numbers);
		
		System.out.println(getHash("GOD"));

	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0 ; i<s.length() ; i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
