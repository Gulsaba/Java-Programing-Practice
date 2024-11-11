package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinOperator {

	public static void main(String[] args) {
		int[] arr = {3, 9, 6, 8, 3, 7, 1, 2};
		int minNum = findMinNumofArr(arr);
		System.out.println("Min number : "+minNum);
		
		int maxNum = findMaxNumofArr(arr);
		System.out.println("Min number : "+maxNum);
		
		findMaxElUsingComparator();
		findMinElUsingComparator();

	}
	
	public static int findMinNumofArr(int[] arr) {
		int min = Arrays.stream(arr).min().getAsInt();
		return min;
	}

	public static int findMaxNumofArr(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		return max;
	}
	
	public static void findMaxElUsingComparator() {
		List<Integer> ls = List.of(1, 6, 3, 7, 9, 0);
		int value1 = ls.stream().max((x, y)->x.compareTo(y)).get();
		System.out.println("Max value of list : "+value1);
	}
	
	public static void findMinElUsingComparator() {
		List<Integer> ls = List.of(1, 6, 3, 7, 9, 0);
		int value1 = ls.stream().min((x, y)->x.compareTo(y)).get();
		System.out.println("Min value of list : "+value1);
	}
}
