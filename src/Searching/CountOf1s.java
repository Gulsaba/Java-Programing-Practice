package Searching;

public class CountOf1s {
	//Array should be sorted 
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1};
		int count = countOfOnesInSortedArr(arr);
		System.out.println("Total count of 1's : "+count);
	}
	
	//Naive solution
	public static int count1sfromSortedArray(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		return count; 
	}
	
	//Efficient solution
	public static int countOfOnesInSortedArr(int[] arr) {
		int n = arr.length;
		int l =0; 
		int r = n-1;
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid] == 0) {
				l = mid + 1;
			} else {
				if(mid == 0 || arr[mid-1] == 0) {
					return n-mid;
				} else {
					r = mid-1;
				}
			}
		}
		return 0;
	}
}
