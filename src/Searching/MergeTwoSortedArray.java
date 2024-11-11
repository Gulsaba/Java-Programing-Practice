package Searching;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {10, 15, 20, 23};
		int arr2[] = {5, 3, 7, 8};
		int[] res = mergedArray(arr1, arr2);
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}
	
	public static int[] mergedArray(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int res[] = new int[m + n];
		
		int i = 0, j = 0, k=0;
		while(i < m || j < n) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			} else if(arr1[i] > arr2[j]) {
				res[k] = arr2[j];
				j++;
				k++;
			} else {
				res[k] = arr1[i];
				i++;
				k++;
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		return res;
	}

}
