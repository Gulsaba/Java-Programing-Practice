package Searching;

public class FirstOccurenceOfGivenNum {

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 30, 30, 30, 50};
		int index = findFirstOccurenceOfElUsingBinarySerach(arr, 50);
		System.out.println("First occurence of given element : "+index);

	}
	
	// Naive solution
	public static int findFirstOccurenceOfGivenElement(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	//Using binary search
	public static int findFirstOccurenceOfElUsingBinarySerach(int[] arr, int num) {
		int l = 0;
		int r = arr.length;
		
		while(l <= r) {
			int mid = (l + r)/2;
			if(num < arr[mid]){
				r = mid - 1;
			} else if(num > arr[mid]) {
				l = mid + 1;
			} else{
				if(mid == 0 || arr[mid-1] != arr[mid]) {
					return mid;
				} else{
					r = mid -1;
				}
			}
		}
		
		return -1;
	}

}
