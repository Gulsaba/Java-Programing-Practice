package MultiThreading;

class Test extends Thread{
	public void run() {
		System.out.println("Child thread!!");
		Thread childRef = Thread.currentThread();
		String threadName = childRef.getName();
		System.out.println("Defult child thread name : "+threadName);
	}
}
public class ChangeThreadName {
	public static void main(String[] args) {
		System.out.println("Defualt main thread name : "+Thread.currentThread().getName());
		Thread.currentThread().setName("Main Thread");
		System.out.println("After change thread name : "+Thread.currentThread().getName());
		Test t = new Test();
		t.start();
		Thread.currentThread().setName("Child Thread");
		System.out.println("After change thread name : "+Thread.currentThread().getName());
	}
}
