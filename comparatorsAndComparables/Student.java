package comparatorsAndComparables ;  

public class Student{    //  implements Comparable<Student>
	
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     // @Override
	public int compareTo(Student obj) {   // Comparables
		
//		if(this.marks > obj.marks) return 1; // if here 1 then o/p will be in increasing order , if -1 then decreasing order 
//		else if(this.marks < obj.marks) return -1; // if here -1 then o/p will be in increasing order , if 1 then decreasing order 
//		
//		return this.name.compareTo(obj.name); // as name is String and String already implements Comparables
//		// if both have same marks then it will sort through the name
		
		return this.marks - obj.marks; // will do in decreasing order
	}
}
