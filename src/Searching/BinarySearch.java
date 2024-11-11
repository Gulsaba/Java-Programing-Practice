package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 8,  9, 20};
        int target = 5;
        int indexOfTarget = binarySearch(arr, target);

        System.out.println("Linear search using recursion...");
        System.out.println(target+" is at index "+indexOfTarget);

        System.out.println("Binary search using recursion...");
        int index = recursiveBinarySearch2(arr, target, 0, arr.length-1);
        System.out.println("Index of target valur = "+target+" is at index "+index);


    }

    private static int binarySearch(int[] arr, int el) {
    	 int l  = 0;
         int r = arr.length-1;
         if(l>r){
             return -1;
         }
        while(l<=r){
        	//mid should be declare inside the loop
        	int mid = (l+r)/2;
            if(arr[mid] == el){
                return mid;
            } else if(arr[mid] > el){
                r = mid-1;
            } else if(arr[mid] < el){
                l = mid+1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch2(int[] arr, int target, int l, int r) {
        if(l > r) {
            return -1;
        }
        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){
                return recursiveBinarySearch2(arr, target, l, mid-1);
            } else if(target > arr[mid]){
                return recursiveBinarySearch2(arr, target, mid+1, r);
            }
        }
        return -1;
    }
}
