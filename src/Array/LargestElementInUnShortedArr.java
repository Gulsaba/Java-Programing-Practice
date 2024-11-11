package Array;

public class LargestElementInUnShortedArr {

	public static void main(String[] args) {
		int[] arr = {102, 67, 7, 2, 6, 9, 13, 1, 0, 1, 4, 11};
		
		int largest = findLargestElement(arr);
		System.out.println("First largest element : "+largest);
		
		System.out.println("Second largest element : "+secondLargestNum(arr));

	}
	
 public static int findLargestElement(int[] arr) {
	 int largest = 0;
	 if(arr.length == -1) {
		 return -1;
	 }
	 for(int i=0; i<arr.length; i++) {
		 if(arr[i] > largest) {
			 largest = arr[i];
		 }
	 }
	 return largest;
 }
 
 public static int secondLargestNum(int[] arr) {
	 int first = findLargestElement(arr);
	 int second = 0;
	                                                  //{102, 67, 7, 2, 6, 9, 13, 1, 0, 1, 4, 11};
	 for(int i = 0; i< arr.length; i++) {
		 if(arr[i] < first && arr[i] > second) {
			 second = arr[i];
		 }
	 }
	 
	 return second;
 }
}
