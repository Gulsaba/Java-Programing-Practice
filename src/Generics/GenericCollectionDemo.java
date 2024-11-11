package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class GenericCollection{
	public <T, U, V> void printCollection(Object obj){
        if (obj instanceof Collection) {
            Collection<T> collections = (Collection<T>) obj;
            for (Object collection : collections) {
                System.out.print(collection + " ");
            }
            
        } else if (obj instanceof Map) {
            Map<U, V> map = (Map<U, V>) obj;
            for (Map.Entry<U, V> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " ");
            }
            System.out.println();
        } else {
            System.out.println("Unsupported type");
        }
	}
	
	public <E> void printArray(E[] arr) {
		for(E element : arr){
			System.out.print(element+" ");
		}
	}
}
public class GenericCollectionDemo {
	public static void main(String[] args) {
		GenericCollection gc = new GenericCollection();
		
		//Print integer type array
		Integer[] arr = {2, 4, 6, 8, 9};
		gc.printArray(arr);
		
		System.out.println();
		
		//Print string type array
		String[] strArray = {"abc", "cde", "efg"};
		gc.printArray(strArray);
		
		System.out.println();
		
		//Print ArrayList element
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(121);
		arrList.add(122);
		arrList.add(123);
		arrList.add(124);
		gc.printCollection(arrList);
		
		System.out.println();
		
		//Print Map element
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Gulsaba");
		map.put(2, "Meraj");
		map.put(3, "Moni");
		
		gc.printCollection(map);
		

	}
}
