package Slack;
import java.util.*;  
public class StackCollection {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();   
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		
		System.out.println("Poped element : "+stack.pop());
		System.out.println("Peek element : "+stack.peek());
		System.out.println("Is stack empty : "+stack.isEmpty());
		
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}

}
