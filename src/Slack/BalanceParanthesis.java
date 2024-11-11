package Slack;

import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {
		//String str = "{}([{}])";
		String str = "[{}])";
		boolean isBalanced = isBalanced(str);
		if(isBalanced) {
			System.out.println("Balanced!!");
		} else {
			System.out.println("Not balanced");
		}
	}

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack();
		for(int i = 0; i< str.length(); i++) {
			char x = str.charAt(i);
			if(x == '(' || x == '{' || x == '[') {
				stack.push(x);
			} else{
				if(stack.isEmpty()) {
					return false;
				} else if(!isMatching(stack.peek(), x)) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		System.out.println(stack);
		return stack.isEmpty();
	}
	
	public static boolean isMatching(char a, char b) {
		if((a == '(' && b == ')') ||
		  (a == '{' && b == '}') ||
		  (a == '[' && b == ']')) {
			return true;
		}	
		return false;
	}
}
