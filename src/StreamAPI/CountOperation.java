package StreamAPI;

import java.util.List;

public class CountOperation {

	public static void main(String[] args) {
		List<Integer> list 
		= List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		int countOfEvenNums = getCountOfEvenNumsInList(list);
		System.out.println("Total count to even numbers : "+countOfEvenNums);
		}

	private static int getCountOfEvenNumsInList(List<Integer> list) {
		int countOfEvenNums = (int) list.stream().filter(n->n%2==0).count();
		return countOfEvenNums;
	}
	

}
