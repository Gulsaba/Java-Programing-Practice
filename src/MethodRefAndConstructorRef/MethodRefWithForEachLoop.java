package MethodRefAndConstructorRef;

import java.util.List;

public class MethodRefWithForEachLoop {

	public static void main(String[] args) {
		List<Integer>  list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream().filter(e->e%2==0).forEach(System.out::println);
	}

}
