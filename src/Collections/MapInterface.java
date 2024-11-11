package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    
	    for(Map.Entry<Integer, String> m:map.entrySet()){
	    	System.out.println(m.getKey()+" : "+m.getValue());
	    }

	}
	

}
