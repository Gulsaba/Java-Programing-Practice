package Array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachElements {

	public static void main(String[] args) {
		
			int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
			System.out.println("Using map...");
			printFrqOfEl(arr);
			
			System.out.println();
	
			int result[] = frequencyOfArray(arr);
			for(int i = 0; i<result.length; i++) {
				if(result[i] != -1) {
					System.out.println(result[i]);
				}
			}
	}
	
	public static int[] frequencyOfArray(int []arr){
		int rs[] = new int [arr.length];
		for(int i=0; i<arr.length; i++) {
			int count  = 1;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count = count + 1;
					arr[j] = -1;
				}
			}
			
			if(arr[i] != -1) {
				arr[i] = count;
			}
		}
		return arr;
	}
	
	public static void printFrqOfEl(int[] arr){
       Map<Integer, Integer> map = new LinkedHashMap<>();
       int val = 1;
       for(Integer el : arr){
           if(map.containsKey(el)){
               map.put(el, map.get(el)+1);
           } else{
               map.put(el, 1);
           }
       }
	  map.entrySet().forEach(el -> System.out.println(el.getKey() + " : " + el.getValue()));
	 }

}
