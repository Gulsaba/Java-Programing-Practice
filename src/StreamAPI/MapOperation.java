package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] newArr = squreRootOfEachElementsOfArr(arr);
		
		//Object of stream can be created by Arrays.stream(Object obj)
		Arrays.stream(newArr).forEach(System.out::println);
	}
	
	//Map:- map is used to apply any function to each elements of the array
	public static int[] squreRootOfEachElementsOfArr(int arr[]) {
         int[] res = Arrays.stream(arr).map(i->i*i).toArray();
		return res;
	}

}
