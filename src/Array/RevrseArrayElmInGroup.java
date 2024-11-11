package Array;

public class RevrseArrayElmInGroup {

	public static void main(String[] args) {
		 int []arr = {16, 17, 4, 3, 5, 2, 7, 8};
		 int num = 3;
		 int []res = reversedArrayInGroup(arr, num);
		 for(int i=0; i<res.length; i++) {
			 System.out.print(res[i]+" ");
		 }

	}
	
	public static int[] reversedArrayInGroup(int []arr, int num){
		int l, r;
		for(int i=0; i<arr.length; i = i+num) {
			l = i;
			r = Math.min(i+num-1, arr.length-1);
			while(l<r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			
		}
		return arr;
	}

}
