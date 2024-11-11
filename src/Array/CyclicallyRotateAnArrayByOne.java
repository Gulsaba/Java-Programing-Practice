package Array;

public class CyclicallyRotateAnArrayByOne {

	public static void main(String[] args) {
       int arr[] = {7278, 14578, 18545, 22911, 23458, 6535, 9822, 12790};
        rotate(arr);
       for(int i = 0; i<arr.length; i++) {
    	   System.out.print(arr[i]+" ");
       }
	}
	
	public static void rotate(int arr[]) {
		int temp = arr[arr.length-1];
		int index = arr.length-1;
		for(int i = arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
			index--;
		}
		arr[0] = temp;
	}
	
}
//12790 7278 14578 18545 22911 23458 6535 9822
