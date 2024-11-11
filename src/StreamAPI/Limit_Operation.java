package StreamAPI;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit_Operation {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		getFirstThreeEvenNumbers(stream);
		
		System.out.println("Print string after skip 3 elements of given list");
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		List<Character> charList = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
		limitDemo(list, charList);
	}
	//limit() method is used to limit the number of elements in a stream to a 
	//specified maximum count.
	public static void limitDemo(List<Integer> list, List<Character> charList) {
		Stream<Integer> stream = list.stream();
			//copy only 3 elements and after index 2
		List<Integer> copiedList = stream.skip(3).limit(3).toList();
		copiedList.forEach(System.out::println);
		
		System.out.println("Character list after skipping 3 elements");
				List<Character> copiedList2 = charList.stream().skip(3).limit(3).toList();
		copiedList2.forEach(System.out::println);
				
	}
	
	public static void getFirstThreeEvenNumbers(Stream<Integer> stream) {
		List<Integer> listOfFirst3EvenNumIntegers = 
				stream.filter(n->n%2==0).limit(3).collect(Collectors.toList());
		listOfFirst3EvenNumIntegers.forEach(System.out::println);
	}
}
