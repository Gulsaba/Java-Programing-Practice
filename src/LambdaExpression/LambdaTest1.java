package LambdaExpression;

@FunctionalInterface  
interface Calculation{  
    int add(int a, int b);  
}  

public class LambdaTest1 {
	public static void main(String[] args) {
		//Using anonymous class
		System.out.println("Using anonymous class");
		Calculation calci1 = new Calculation(){
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		System.out.println("Sum of 'a' and 'b' : "+calci1.add(8,  2));
		System.out.println();
		
		//Using Lambda Expression 
		System.out.println("Using Lambda Expression ");
		Calculation calci2 = (a, b)->a+b;
		int sum = calci2.add(8, 2);
		System.out.println("Sum of 'a' and 'b' : "+sum);
	}
}
