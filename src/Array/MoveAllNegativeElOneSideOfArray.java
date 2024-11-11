package Array;

public class MoveAllNegativeElOneSideOfArray {

	public static void main(String[] args) {
		int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
		segregateElements(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void segregateElements(int[] arr) {
        int[] temp = new int[arr.length];
        int pos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                temp[pos++] = arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                temp[pos++] = arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }
    }
}
