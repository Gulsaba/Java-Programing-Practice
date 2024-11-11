package MultiThreading;

public class GetReferenceOfMainThread {

	public static void main(String[] args) {
		GetReferenceOfMainThread mth = new GetReferenceOfMainThread();
		//Refernce of main thread
		Thread ref = Thread.currentThread();
		
		System.out.println("Thread name : "+ref.getName());
		System.out.println("Thread priority : "+ref.getPriority());

	}

}
