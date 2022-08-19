package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student_comparable {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5, "revanth", 31));
		al.add(new Student(6,"anand", 28));
		al.add(new Student(3,"karki", 12));
		al.add(new Student(2,"vembu", 33));
		
		
		Collections.sort(al);
		
		for (Student a : al) {
			System.out.println(a);
		}

		
	}
}
