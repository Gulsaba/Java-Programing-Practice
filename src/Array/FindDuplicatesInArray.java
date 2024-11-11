package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {1, 8, 4, 3, 6, 9, 5, 7, 2, 7, 0};
		List<Integer> list = findDuplicatesInArray(arr);
		System.out.println(list);
		

	}
	public static List<Integer> findDuplicatesInArray(int[] arr) {
	       Map<Integer, Integer> map = new LinkedHashMap<>();
	       for(int el : arr){
	           if(map.containsKey(el)){
	               map.put(el, map.get(el)+1);
	           } else{
	               map.put(el, 1);
	           }
	       }
	       
	       List<Integer> duplicates = new ArrayList<Integer>();
	       Set<Integer> keySet = map.keySet();
	       for(Integer el : keySet){
	           if(map.get(el) > 1){
	               duplicates.add(el);
	           }
	       }
	       Collections.sort(duplicates);
	       return duplicates;
	    }

}
