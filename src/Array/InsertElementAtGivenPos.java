package Array;

public class InsertElementAtGivenPos {

	public static void main(String[] args) {
		int arr[] = {1, 4, 7, 9};
		int el = 3;
		int pos = 2;
		
		int res[] = insert(arr, el, pos);
		for(int i = 0; i<res.length; i++) {
			System.out.println(res[i]);
		}

	}
	
	public static int[] insert(int[] arr, int el, int pos) {
		int n = arr.length;
		int res[] = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			if(i < pos -1) {
				res[i] = arr[i];
				
			}else if(i == pos-1) {
				res[i] = el;
			}else {
				res[i] = arr[i-1];
			}
		
		}
		
		return res;
	}

}
