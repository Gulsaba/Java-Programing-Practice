package Generics;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class GenericsList{
	public <T> void printList(Collection<T> list) {
        System.out.println("List values are being printed...");
        for (T el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println();
    }
}

public class GenericListDemo {

	public static void main(String[] args) {
		GenericsList gl = new GenericsList();
		List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        gl.printList(intList);
        
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("AB", "BC", "CD"));
        gl.printList(strList);
        
        LinkedList<Character> ldlist = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D'));
        gl.printList(ldlist);
        
	}

}
