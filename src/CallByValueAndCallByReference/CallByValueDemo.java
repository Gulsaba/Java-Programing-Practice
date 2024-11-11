package CallByValueAndCallByReference;

//By using call by value, Original value does not affect
public class CallByValueDemo {
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		int c = 50;
		int d = 100;
		System.out.println("Before swapping...");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println();
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		swap(a, b);
		System.out.println("After swapping...");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println();
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		
		
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
