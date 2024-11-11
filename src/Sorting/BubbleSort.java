package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {70, 34, 12, 11, 4, 10, 35};
		int[] res = bubbleSort(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}

	}
	
	public static int[] bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
