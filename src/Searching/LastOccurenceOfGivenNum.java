package Searching;

public class LastOccurenceOfGivenNum {

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 30, 30, 30, 50};
		int index = findIndexOfLastOccurance(arr, 50);
		System.out.println("Last occurence of given element : "+index);
	}
	
 public static int findIndexOfLastOccurance(int[] arr, int num) {
	 int n = arr.length;
	 int l = 0;
	 int r = n-1;
	 while(l<=r) {
		 int mid = (l + r)/2;
		 if(num < arr[mid]) {
			 r = mid - 1;
		 } else if(num > arr[mid]) {
			 l = mid + 1;
		 } else{
			 if(mid == n - 1 || arr[mid] != arr[mid+1]) {
				 return mid;
			 } else {
				 l = mid + 1;
			 }
		 }
	 }
			 
	 return -1;
 }
}
