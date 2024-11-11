package StreamAPI;

import java.util.List;

public class ReduceOperation {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int res = reduceMethodDemo(list);
		System.out.println("sum of list : "+res);
	}
	
	//reduce() method combine all elements into single elements
	public static int reduceMethodDemo(List<Integer> list) {
		int sum = list.stream().reduce((n1, n2)->n1+n2).get();
		return sum;
	}

}
