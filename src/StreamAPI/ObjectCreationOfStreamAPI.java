package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ObjectCreationOfStreamAPI {

	public static void main(String[] args) {
		//Create empty stream usint ]empty()
		Stream<Integer> emptyStream = Stream.empty();
		
		//operation on empty stream 
		emptyStream.forEach(el->{
			System.out.println(el);
		});
		
		//Create empty stream using builder()
		Stream<Object> empStream = Stream.builder().build();
		empStream.forEach(el->{
			System.out.println(el.toString());
		});
	    
		//Create stream for collection using stream()
		List<Integer> ls = List.of(1, 2, 3, 4, 5);
		Stream<Integer> lsStream = ls.stream();
		
		lsStream.forEach(el->{
			System.out.print(el+2+" ");
		});
		
		System.out.println();
		
		//Create stream for group of object like int[] arr or str[] arr using of() method
		String[] strArr = {"Adeptia", "Amazon", "Google", "IBM"};
		Stream<String> strArrStream = Stream.of(strArr);
		strArrStream.forEach(str->{
			System.out.print(str+" ");
		});
		
		System.out.println();
		
		int[] intArr = {1, 3, 5, 6};
		IntStream intArrStream = Arrays.stream(intArr);
		intArrStream.forEach(el->{
			System.out.print(el+" ");
		});
		

	}

}
