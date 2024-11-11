package Array;

public class ReverseArr {
  public static void main(String[] args) {
	  
	  int arr[] = {3, 6, 8, 1, 9, 0};
	  for(int i = 0; i< arr.length/2; i++) {
		 int temp =  arr[i];
		 arr[i] = arr[arr.length-1 -i];
		 arr[arr.length-1-i] = temp; 
	  }
	  
	  Array.printArray(arr);
  }
  
}
