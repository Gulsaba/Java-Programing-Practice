package Array;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] arr = {9, 5, 6, 7, 8, 5, 7, 9, 4};
	      int rs = secondLargestNum(arr);
	      System.out.println(rs);

	}
	
	public static int secondLargestNum(int num[]) {
	    if (num.length < 2) {
	        throw new IllegalArgumentException("Array must have at least two elements");
	    }

	    int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;

	    for (int i = 0; i < num.length; i++) {
	        if (num[i] > first) {
	            second = first;
	            first = num[i];
	        } else if (num[i] > second && num[i] != first) {
	            second = num[i];
	        }
	    }
	    if (second == Integer.MIN_VALUE) {
	        throw new IllegalArgumentException("No second largest element, all elements might be the same");
	    }

	    return second;
	}


}
