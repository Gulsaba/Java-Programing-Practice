package Math;

public class CheckNumIsPrime {

	public static void main(String[] args) {
		
		int num  = 11;
		boolean isPrime1 = isPrime_Naive_Method(num);
		System.out.println("Check given number is prime or not using Naive method where time complexity O(n)");
		if(isPrime1) {
			System.out.println("Given number is prime!!");
		} else {
			System.out.println("Not prime !!!");
		}
		System.out.println();
		System.out.println("Check given number is prime or not using efficent method where time complexity O(root n)");
		boolean isPrime2 = efficient_Method_to_checkPrimeNum(num);
		if(isPrime2) {
			System.out.println("Given number is prime!!");
		} else {
			System.out.println("Not prime !!!");
		}

	}
	
	public static boolean isPrime_Naive_Method(int num) {
		boolean res = true;
		if(num == 0 || num == 1) {
			res =  false;
		} else {
			for(int i = 2; i<num; i++) {
				//System.out.println("Condition checked at "+i);
				if(num % i == 0) {
					res =  false;
				}
			}
		}
		return res;
	}
	
	public static boolean efficient_Method_to_checkPrimeNum(int num) {
		boolean res = true;
		if(num == 0 || num == 1) {
			res =  false;
		} else {
			for(int i = 2; i*i <= num; i++) {
				//System.out.println("Condition checked at "+i);
				if(num % i == 0) {
					res =  false;
				}
			}
		}
		return res;
	}

}
