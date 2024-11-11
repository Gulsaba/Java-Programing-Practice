package Generics;

import java.util.ArrayList;

class WildCardInGenerics{
	public void operationOnELementsList(ArrayList<?> alist) {
		if(!alist.isEmpty() && alist.get(0) instanceof Integer) {
			int sum = 0;
			for(Object obj : alist) {
				if (obj instanceof Integer) {
                    sum += (Integer) obj;
                }
			}
			System.out.println(sum);
			
		} else if(!alist.isEmpty() && alist.get(0) instanceof String) {
			for(Object obj: alist) {
				System.out.print((String) obj+", ");
			}
		}
	}
}

public class WildcardCharacter {

	public static void main(String[] args) {
		WildCardInGenerics wg = new WildCardInGenerics();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		
		wg.operationOnELementsList(alist);
		System.out.println();
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("AB");
		slist.add("BC");
		slist.add("CD");
		slist.add("ED");
		slist.add("FG");
		
		wg.operationOnELementsList(slist);

	}

}
