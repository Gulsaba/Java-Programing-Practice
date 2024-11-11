package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<Integer>();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(6);
		arr.add(5);
		arr.add(2);
		arr.add(5);
		arr.add(1);
		arr.add(5);
		arr.add(2);
		
        st.addAll(arr);
        
        System.out.println(st);
	}

}
