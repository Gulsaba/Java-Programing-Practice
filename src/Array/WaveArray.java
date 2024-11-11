package Array;

public class WaveArray {

	public static void main(String[] args) {
		int arr[] = {4, 2, 8, 7, 10, 9};
		convertToWave(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

/*
   Given a sorted array arr[] of distinct integers. Sort the array into a wave-like 
   array(In Place). In other words, arrange the elements into a sequence 
   such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
   
   Input: arr[] = [1, 2, 3, 4, 5]
   Output: [2, 1, 4, 3, 5]
   
   Input: arr[] = [2, 4, 7, 8, 9, 10]
   Output: [4, 2, 8, 7, 10, 9]
   */
	
	public static void convertToWave(int[] arr) {
        int res[] = new int[arr.length];
        for(int i = 0; i<arr.length-1; i= i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
	
}
