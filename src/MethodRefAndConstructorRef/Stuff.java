package MethodRefAndConstructorRef;

public class Stuff{
   // Static method
	public static void printMsg() {
		System.out.println("Printing msg...");
		System.out.println("Hello world");
	}
	
	//Not static method
	public int getLength(String str) {
		System.out.println("Length of str...");
		return str.length();
	}
	
	//Stuff contructor
	Stuff(){
		System.out.println("Creating the object of stuff class");
	}
	
	//Display method
	public void displayMethod() {
		System.out.println("Display method of Stuff class which is non static");
	}
}
