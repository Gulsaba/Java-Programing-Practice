package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find sum of array using reduce() of stream api
public class ReduceMethod {

	public static void main(String[] args) {
		int[] arr = {1, 2 , 3, 4, 5, 20};
		int sum1 = findSumOfArr1(arr);
		System.out.println("Using reduce() mehtod");
		System.out.println("Sum of arr : "+sum1);
		
		System.out.println();
		System.out.println("Using sum() and  mehtod of Arrays.stream()");
		int sum2 = findSumOfArr2(arr);
		System.out.println(sum2);
		
		System.out.println();
		System.out.println("Using Collectors() and  mehtodof Stream.stream()");
		
		List<Integer> ls = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum3 = findSumOfArr3(ls);
		System.out.println(sum3);
		
		
	}
	
	//Using reduce() mehtod of stream()
	public static int findSumOfArr1(int[] arr) {
		int total = Arrays.stream(arr).reduce(0,(sum, el)->sum+el);
		return total;
	}
	
	//Using sum() and  mehtod of Arrays.stream()
	public static int findSumOfArr2(int[] arr) {
		int total = Arrays.stream(arr).sum();
		return total;
	}
	
	public static int findSumOfArr3(List<Integer> list) {
		int total = list.stream().collect(Collectors.summingInt(el->el));
		return total;
	}
	
	

}
