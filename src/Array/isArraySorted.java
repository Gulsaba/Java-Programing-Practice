package Array;

public class isArraySorted {
	public static void main(String[] args) {
		int[] arr = {100, 10, 200};
		boolean isSorted = checkIsArraySorted(arr);
		if(isSorted) {
			System.out.println("Sorted!!");
		} else {
			System.out.println("Unsorted!!");
		}
		
	}
	
	public static boolean checkIsArraySorted(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
}

