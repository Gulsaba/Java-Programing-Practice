package StreamAPI;

import java.util.Collection;
import java.util.List;

public class SkipOperation {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> list1= getFirst3OddNumberExcluding2(list);
		printList(list1, 1);
	}
	
	public static List<Integer> getFirst3OddNumberExcluding2(List<Integer> list) {
		List<Integer> firt3OddNumList =  list.stream().skip(3).filter(n-> n%2==0).limit(3).toList();
		return firt3OddNumList;
	}
	
	
	public static <T> void printList(Collection<T> list, int i) {
        System.out.println("List"+i+ " values are being printed...");
        for (T el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

}
