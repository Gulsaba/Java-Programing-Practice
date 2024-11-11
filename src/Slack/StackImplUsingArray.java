package Slack;

class Stack1{
	 int arr[];
	 int capacity;
	 int top;
	
	 Stack1(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
	}
	
	public void push(int x) {
		if(isFull()) {
			 System.out.println("Stack is full. Cannot push " + x);
		} else {
			top++;
			arr[top] = x ;
		}
	}
	
	public int pop() {
		if(isEmplty()) {
			System.out.println("Stack is empty. Nothing to pop");
			return -1;
		} 
		int res = arr[top];
		top--;
		return res;
	}
	
	public int peek(){
		if(isEmplty()) {
			System.out.println("Stack is empty. Nothing to peek");
			return -1;
		} else {
			return arr[top];
		}
	}
	
	public boolean isEmplty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
}
public class StackImplUsingArray {

	public static void main(String[] args) {
		Stack1 stack = new Stack1(3);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		System.out.println("Poped element from stack : "+stack.pop());
		System.out.println("Peek element of stack : "+stack.peek());
		System.out.println("Is stack empty : "+stack.isEmplty());
	}
	
}
