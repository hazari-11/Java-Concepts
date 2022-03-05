package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Ram"));
		students.add(new Student(35, "Shyam"));
		students.add(new Student(83, "Aman"));
		students.add(new Student(13, "Ram"));
		students.add(new Student(13, "Anuj"));
		
//		Collections.sort(students, new Comparator<Student>() {  // Anonymous Comparator Class // new SortByNameThenMarks()
//
//			@Override
//			public int compare(Student o1, Student o2) {  
//				
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;  
//				}else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			}
//			
//		);
		
//		Collections.sort(students, (o1, o2) -> {   // new SortByNameThenMarks()  // lambda function( -> )
//				
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;  
//				}else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			);
		
//		Collections.sort(students, (o1, o2) ->  o1.name.compareTo(o2.name)); // lambda function( -> ) // comparing through name
		
		Collections.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed()); // comparing through name then through marks and then reversing
		
		students.forEach(System.out::println);  // lambda function

	}
}

//class SortByNameThenMarks implements Comparator<Student> {  // Comparators
//
//	@Override
//	public int compare(Student o1, Student o2) {  
//		
//		if(o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;  
//		}else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//	
//}
