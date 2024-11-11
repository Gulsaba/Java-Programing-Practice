package Math;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int factorial = factorialOfNum1(num);
		System.out.println("Factorial of num  : "+factorial);
		
		int recursive_res = factorialOfNum2(num);
		System.out.println("Factorial of given number calculated by recursive method: "+ recursive_res);
		
	}
	
	//Using non-recursive method (Time complexity O(n) )
	public static int factorialOfNum1(int num){
		if(num == 0) {
			return 1;
		}
		int fact = num;
		for(int i = (num-1); i>=1; i--) {
			fact = fact * i;
		}
		return fact;
	}

   //Using recursive method (Time complexity O(2 ^ N)  )
	public static int factorialOfNum2(int num){
		if(num == 0) {
			return 1;
		}
		else {
			return num * factorialOfNum2(num - 1);
		}
		
	}
}
