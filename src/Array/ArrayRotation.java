package Array;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 3, 5, 7, 8, 9};
		leftRotationOfArrayByOneEl(arr);
		
		System.out.println();
		
		rightRotationOfArrayByOne(arr);
		System.out.println();
		leftRotationOfArrayByDplace(arr, 3);

	}
	
	public static void leftRotationOfArrayByOneEl(int[] arr) {
		int temp = arr[0];
		for(int i =1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]  = temp;
	    System.out.println("-----------------Array Left Rotation-----------------");
		Array.printArray(arr);
	}
	
	public static void rightRotationOfArrayByOne(int arr[]) {
		
		int n = arr.length;
		int temp = arr[n-1];
		for(int i =n-1; i>0; i--) {
			arr[i] = arr[i-1]; 
			
    	}
		 arr[0] = temp;
		 System.out.println("-----------------Array Right Rotation-----------------");
		 Array.printArray(arr);
  }
	
	public static void leftRotationOfArrayByDplace(int[] arr, int d) {
		int n = arr.length;
		
		int first[] = new int[d];
		int second[] = new int[arr.length - d];
		
		//Copied elements in first array
		for(int i =0; i<d; i++) {
			first[i] = arr[i];
		}
		//Rotate first array
		first = Array.reverseArray(first);
	    
		//Copied elements in second array
		for(int j = d; j<arr.length; j++) {
			second[j-d] = arr[j];
			
		}
		//Reverse second array
		second = Array.reverseArray(second);
	    int rotatedArray[] = Array.mergeArrays(first, second);
		
		System.out.println("-----------------Array Left Rotation By Given Number-----------------");
		Array.printArray(Array.reverseArray(rotatedArray));
		
	}
}
