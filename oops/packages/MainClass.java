package oops.packages;

//import java.util.Scanner;
import java.util.*;

//import oops.packages.models.Student;
//import oops.packages.models.Teacher;

import oops.packages.models.*;

public class MainClass {

	public static void main(String[] args) {
		
		Student obj = new Student("Tom");
		
//		obj.name = "Jerry";  // giving error as name is private in student.java
		
		obj.getPassword();  // as its private in student.java
		
		Teacher teacher = new Teacher();
		
		Scanner sc = new Scanner(System.in);

	}

}
