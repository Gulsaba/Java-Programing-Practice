package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class StudentData{
	int id;
	String name;
	int age;
	public StudentData(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class ConvertListToMapUsint_toMap_Method {

	public static void main(String[] args) {
		StudentData st1 = new StudentData(1, "Ram", 20);
		StudentData st2 = new StudentData(2, "Shyam", 21);
		StudentData st3 =new StudentData(3, "Radha", 20);
		StudentData st4 = new StudentData(4, "Rohan", 22);
		StudentData st5 = new StudentData(5, "Raman", 23);
		
		List<StudentData> list = List.of(st1, st2, st3, st4, st5);
		Map<Integer, String> stdMap = listToMap(list);
		stdMap.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
	}
	
	public static Map<Integer, String> listToMap(List<StudentData> stdList) {
		return stdList.stream().collect(Collectors.toMap(s->s.id, s->s.name));
	}

}
