package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
public class StreaAPIWithObjects {

	public static void main(String[] args) {
		List<Student> students = listOfStudent();
		
		//Filter students whose name starts with 'R'
		List<Student> newList = students.stream().filter(student->student.getName().startsWith("R")).collect(Collectors.toList());
		for(Student st : newList) {
			System.out.print(st.getName()+" ");
		}
	}
	
	public static List<Student> listOfStudent(){
		Student s1 = new Student("Ram");
		Student s2 = new Student("Shyam");
		Student s3 = new Student("Radha");
		Student s4 = new Student("Krishna");
		Student s5 = new Student("Mohan");
		
		List<Student> sList = List.of(s1, s2, s3, s4, s5);
		return sList;
	}
	
 
}
