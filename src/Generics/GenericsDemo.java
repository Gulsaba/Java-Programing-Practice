package Generics;

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

//Generic Class
class GenericsClass<T>{
	T obj;
	GenericsClass(T obj){
		this.obj = obj;
	}

	//Generic Method
	public <T> void operatorOnGenericObj() {
		if(obj instanceof  String) {
			System.out.println("Object is string type of length : "+obj.toString().length());
		} else if(obj instanceof Integer){
			System.out.println("Object is Integer type : "+obj);
		} else if(obj instanceof Student) {
			Student std = (Student) obj;
			String details = std.toString();
			System.out.println(std.toString());
		}
	}
}

class GenericsDemo{
	public static void main(String[] args) {
		
		GenericsClass<String> str = new GenericsClass<String>("Gulsaba");
		
		//str.obj = 89; compile time error
		str.operatorOnGenericObj();
		
		GenericsClass<Integer> intObj = new GenericsClass<Integer>(34);
		intObj.operatorOnGenericObj();
		
		Student std = new Student("Gulsaba", 25);
		GenericsClass<Student> stdObj = new GenericsClass<Student>(std);
		stdObj.operatorOnGenericObj();
		
		
	}
}

