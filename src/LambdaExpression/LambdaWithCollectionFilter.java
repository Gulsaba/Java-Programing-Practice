package LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{  
    int id;  
    String name;  
    long empid;  
    int age;
    public Employee(int id, String name, long empid, int age) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.empid = empid; 
        this.age = age;
    }  
    
    public String toString() {
    	return "[Id: "+id+", Name: "+name+", Employee id: "+empid+", Age: "+age+"]";
    }
}  
public class LambdaWithCollectionFilter {

	public static void main(String[] args) {
		 List<Employee> list=new ArrayList<Employee>();  
		 
        	list.add(new Employee(1,"Aditi",2345, 26));  
	        list.add(new Employee(3,"Abhay",2247, 28));  
	        list.add(new Employee(2,"Abhinav",2145, 25));
	        list.add(new Employee(2,"Gulsaba",2471, 24));
	          
	        Stream<Employee> filtered_data = list.stream().filter(employee -> employee.age > 25);
	        filtered_data.forEach((emp)->{
	        	System.out.println(emp);
	        });
	}

}
