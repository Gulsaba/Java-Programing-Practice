package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int arr[] = {1, 4, 6, 8, 4, 6, 1};
	       int n = arr.length;
	       removeDuplicateElement(arr);
	       
		
	}
	
	public static void removeDuplicateElement(int[] arr) {
		 int res[] = new int[arr.length];
		 int n = arr.length;
		 
		 Set<Integer> set = new HashSet<Integer>();
		 int k = 0;
		 for(int i=0; i<n; i++){
	           int el = arr[i];
	           if(!set.contains(el)) {
	        	   set.add(el);
	        	   res[k++] = arr[i];
	           }
	      }
		 
		 for(int j =0; j<k; j++){
	         System.out.println(res[j]);
	     }
	}

}
