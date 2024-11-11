package Array;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 6, 7};
	   int[] result = CopyOneArrayToAnotherArray(arr);
        for (int j : result) {
            System.out.print(j+" ");
        }
	}
	
public static int[] CopyOneArrayToAnotherArray(int[] arr) {
	int[] copiedArray = new int [arr.length];
	int i = 0;
    for(int num : arr){
		copiedArray[i] = arr[i];
		i++;
	}
	return copiedArray;
 }

}
