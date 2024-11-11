package Array;

public class RemoveDuplicateElFromShortedArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 30, 30, 40, 50, 50, 60};
		int res[] = removeDuplicateElements(arr);
		
		for(int i = 0; i<res.length-1; i++) {
			if(res[i] != 0) {
				System.out.print(res[i]+" ");
			}
		}
	}
	
	public static int[] removeDuplicateElements(int[] arr) {
		
		int[] temp = new int[arr.length];
		int j =0;
		for(int i = 0; i< arr.length-1; i++) {
			if(arr[i]!= arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		
		return temp;
	}

}
