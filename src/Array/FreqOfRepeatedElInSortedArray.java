package Array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfRepeatedElInSortedArray {

	 public static void main(String[] args) {
		int[] arr = {10, 10, 10, 20, 30, 30, 40, 40, 50};
		printFrqOfEl(arr);
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
