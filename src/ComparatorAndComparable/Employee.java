package ComparatorAndComparable;

public class Employee {
	String name;
	long empid;
	int age;
	Employee(String name, long empid, int age){
		this.name = name;
		this.empid = empid;
		this.age = age;
	}
	public String toString(){
		return "[Name : "+name+", Employee id : "+empid+", Age : "+age+"]";
	}
}
