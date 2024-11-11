package ComparatorAndComparable;

public class Student implements Comparable<Student>{
	int id;
	String name;
	long rollNum;
	
	Student(int id, String name, long rollNum){
		this.id = id;
		this.name = name;
		this.rollNum = rollNum;
	}
	

	@Override
	public int compareTo(Student student) {
		return (int) (this.rollNum - student.rollNum);
	}
	
	public String toString() {
        return "[Id: " + id + ", Name: " + name + ", Roll Number: " + rollNum+"]";
    }

}
