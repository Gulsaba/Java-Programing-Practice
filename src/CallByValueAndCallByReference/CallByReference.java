package CallByValueAndCallByReference;

public class CallByReference {
	int a = 10;
	int b = 50;
	public static void main(String[] args) {
		CallByReference cb = new CallByReference();
		swap(cb);
		System.out.println("a : "+cb.a);
		System.out.println("b : "+cb.b);

	}
	
	public static void swap(CallByReference obj) {
		int temp = obj.a;
		obj.a = obj.b;
		obj.b = temp;
	}

}
