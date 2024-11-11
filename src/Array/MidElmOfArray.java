package Array;

public class MidElmOfArray {
	public static void main(String[] args) {
		int[] arr = {3, 1, 5, 2, 2};
		//int[] arr = new int[0];
		int equilibriumPoint = equilibriumPointElementOfArry(arr);
		System.out.println(equilibriumPoint);
 	}
	
	public static int equilibriumPointElementOfArry(int[] arr) {
		int mid = 0 + arr.length-1;
		int sum = sumOfArray(arr);
		int i = 0;
		if(arr.length == 0) {
			return -1;
		}
		while(sum > mid) {
			mid = mid + arr[i];
			sum = sum - arr[i];
			i++;
		}
		
		return mid;
	}
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
}
