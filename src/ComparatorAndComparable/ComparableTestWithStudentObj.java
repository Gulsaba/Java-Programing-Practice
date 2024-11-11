package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTestWithStudentObj {
	public static void main(String[] args) {
		Student s1 = new Student(11, "Meraj", 133);
		Student s2 = new Student(12, "Gulsaba", 124);
		Student s3 = new Student(13, "Moni", 145);
		Student s4 = new Student(14, "Dinesh", 123);
		
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		
		Collections.sort(stdList);
		
		for(Student student: stdList){
			System.out.println(student);
		}
	}
}
