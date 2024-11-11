package Array;

public class DeleteElFromArr {

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 5, 7, 1};
		
		int[] arrAfterDeletion = deletionOperation(arr, 5);
		Array.printArray(arrAfterDeletion);
		

	}

	public static int[] deletionOperation(int[] arr, int ele) {
		int res[] = new int[arr.length-1];
		
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ele) {
				index = i;
				break;
			}
		}
		
		for(int j=0; j< arr.length-1; j++) {
			if(j < index) {
				res[j] = arr[j];
			}else {
				res[j] = arr[j+1];
			}
		}
		
		return res;
	}
	
}
