package Array;

public class MoveZeroAtFirst {

	public static void main(String[] args) {
		int arr[] = {1, 0, 4, 1, 0, 5};
		int res[] = moveZeroAtStart(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}

	}
   public static int[] moveZeroAtStart(int arr[]) {
	   int[] arranged = new int[arr.length];
	   int index = arr.length-1;
	   for(int i=arr.length-1; i>=0; i--){    
		   if(arr[i] != 0){       
		    arranged[index--] = arr[i];    
		   }}
	  return arranged;
   }
}
