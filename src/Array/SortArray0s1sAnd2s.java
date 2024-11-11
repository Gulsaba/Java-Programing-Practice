package Array;

import java.util.Map;
import java.util.TreeMap;

public class SortArray0s1sAnd2s {

	public static void main(String[] args) {
		int arr[] = {1, 0, 2};
		sort012(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort012(int[] arr) {
       Map<Integer, Integer> map = new TreeMap<>();
       for(int num : arr){
           if(map.containsKey(num)){
               map.put(num, map.get(num)+1);
           } else{
               map.put(num, 1);
           }
       }
       
       int k = 0;
       for(Map.Entry<Integer, Integer> mapSet: map.entrySet()){
           int key = mapSet.getKey();
           int value = mapSet.getValue();
           while(value > 0){
               arr[k] = key;
               k++;
               value--;
           }
       }
    }
}
