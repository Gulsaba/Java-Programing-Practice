package Sorting;

public class SelctionSort {

	public static void main(String[] args) {
		int[] arr = {70, 34, 12, 11, 4, 10, 35};
		int[] res = selectionSort(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		int minIndex = -1;
		for(int i=0; i<n-1; i++) {
			minIndex = i;
			for(int j = i+1; j<n; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			System.out.println(arr[minIndex]);
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
