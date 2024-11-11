package Array;

public class FindMinAndMaxElInArray {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2, 7, 8};
		findMinAndMaxElInArray(arr);

	}
	
	public static void findMinAndMaxElInArray(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
				
	}

}
