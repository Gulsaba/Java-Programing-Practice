package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTestWithEmployeeObj {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Gulsaba", 2471, 25);
		Employee emp2 = new Employee("Aditi", 2342, 26);
		Employee emp3 = new Employee("Bhavook", 2341, 28);
		Employee emp4 = new Employee("Abhishekh", 2222, 27);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements
		Collections.sort(empList,new AgeComparator()); 
		
		//Traversing the elements of list 
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		System.out.println();
		
		System.out.println("sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(empList,new AgeComparator());  
		//Travering the list again 
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
