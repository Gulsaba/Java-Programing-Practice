package Array;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
	
		int arr[]  = {2, 4, 0, 1, 0, 0, 2, 0, 5, 0};
		moveAllzerosToTheEnd(arr);
		

	}
	public static void moveAllzerosToTheEnd(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		for(int i = 0; i<= n-1; i++) {
			if(arr[i] != 0) {
			 temp[j++] = arr[i];
			}
		}
		
		Array.printArray(temp);
	}

}
