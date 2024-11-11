package Array;

public class Array {

	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void printArrWithGivenSize(int arr[], int size) {
		for(int i =0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int[] reverseArray(int arr[]) {
		for(int i = 0; i< arr.length/2; i++) {
			 int temp =  arr[i];
			 arr[i] = arr[arr.length-1 -i];
			 arr[arr.length-1-i] = temp; 
		  }

		return arr;
	 }
	
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		
		int n = arr1.length + arr2.length;
		int[] res = new int[n];
		for(int i=0; i<arr1.length; i++) {
			res[i] = arr1[i];
		}
		for(int j= 0; j<arr2.length; j++) {
			res[j+arr1.length] = arr2[j];
		}
		return res;
	}
	
}
