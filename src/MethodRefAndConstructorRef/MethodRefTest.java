package MethodRefAndConstructorRef;

public class MethodRefTest {

	public static void main(String[] args) {
		//Method reference
		WorkInterface wf1 = Stuff::printMsg;
		wf1.msg();
		
		System.out.println();
		
		//Instance method reference for particular clas object
		// or
		//Non static method reference
		Stuff st = new Stuff();
		WorkInterface wf2 = st::displayMethod;
		wf2.msg();
		
		System.out.println();
		
		//Constructor reference
		WorkInterface2 wf23 = Stuff::new;
		Stuff sfw2 = wf23.getObjOfStuffClass();
		int length = sfw2.getLength("hello");
		System.out.println(length);
	}

}
