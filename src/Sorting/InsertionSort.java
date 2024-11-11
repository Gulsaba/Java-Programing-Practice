package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {70, 34, 12, 11, 4, 10, 35};
		int[] res = insertSort(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] insertSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int k = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > k) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = k;
		}
		return arr;
	}
}
