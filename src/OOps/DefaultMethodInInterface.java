package OOps;

interface Vehical{
	default void stop() {
		System.out.println("Stop vehical");
	}
	public void run();
}

class Car implements Vehical{
	public void run() {
		System.out.println("Car is running..");
	}
}
class Bike implements Vehical{
	public void run() {
		System.out.println("Bike is running..");
	}
	/*default void stop() {
		System.out.println("Bike stopped");
	}*/
}


public class DefaultMethodInInterface {
	public static void main(String[] args) {
	Vehical cr = new Car();	
	cr.run();
	cr.stop();
	
	Bike bk = new Bike();
	bk.run();


	}
}
