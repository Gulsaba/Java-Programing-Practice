package Slack;

import java.util.ArrayList;

class MyStack{
	ArrayList<Integer> arr;
	int capacity;
	int top;
	
	MyStack(int size){
		this.capacity = size;
		arr = new ArrayList<Integer>(capacity);
		top = -1;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack is full. Can not push : "+x);
		} else {
			top++;
			arr.add(x);
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty. Element can not poped.");
			return -1;
		} else {
			int res = arr.remove(top);
			top--;
			return res;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty. Nothing to pop");
			return -1;
		} else {
			return arr.get(top);
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == capacity-1);
	}
	
}
public class StackImplUsingArrayList {

	public static void main(String[] args) {
		MyStack stack = new MyStack(3);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		System.out.println("Poped element : "+stack.pop());
		System.out.println("Peek element : "+stack.peek());
		System.out.println("Is stack empty : "+stack.isEmpty());
	}

}
