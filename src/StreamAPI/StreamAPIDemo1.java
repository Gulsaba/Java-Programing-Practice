package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo1 {

	public static void main(String[] args) {
    
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		
		//Create stream object of list
		Stream<Integer> stream = list.stream();
		
		//filter odd number using stream API
		List<Integer> oddNumList = stream.filter(i->i%2 == 0).collect(Collectors.toList());
		
		//Print elements of oddNumList
		System.out.println(oddNumList);
				
		
	}

}
