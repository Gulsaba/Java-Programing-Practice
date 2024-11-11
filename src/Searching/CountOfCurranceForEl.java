package Searching;

public class CountOfCurranceForEl{

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 30, 30, 30, 50};
		int count = efficientSolutionForCountOccuranceOfGiventEl(arr, 30);
		System.out.println("Count occurence of given element : "+count);
	}
	
	//Naive solution to count occurrence of given element
	public static int countOccuranceOfGiventEl(int[] arr, int num) {
		//Array should be sorted
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		return count;
	}
	
	//Efficient solution for count occurrence of given element
	public static int efficientSolutionForCountOccuranceOfGiventEl(int[] arr, int num) {
		int firstOcc = firstOccurence(arr, num);
		int lastOcc = lastOccurence(arr, num);
		if(firstOcc == -1) {
			return 0;
		} else {
			int count = (lastOcc - firstOcc) + 1;
			return count;
		}
	}
	
	public static int firstOccurence(int[] arr, int num) {
		int n = arr.length;
		int l = 0; 
		int r = n-1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(num < arr[mid]) {
				r = mid -1;
			} else if(num > arr[mid]) {
				l = mid +1;
			} else {
				if(mid == 0 || arr[mid-1] != arr[mid]) {
					return mid;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}
	
	public static int lastOccurence(int[] arr, int num) {
		int n = arr.length;
		int l = 0; 
		int r = n-1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(num < arr[mid]) {
				r = mid -1;
			} else if(num > arr[mid]) {
				l = mid +1;
			} else {
				if(mid == (n-1) || arr[mid] != arr[mid+1]) {
					return mid;
				} else {
					l = mid + 1;
				}
			}
		}
		return -1;
	}

	
}
