package Math;

public class TotalNumberOfPrimeNums {

	public static void main(String[] args) {
		int num = 12;
		pritnt_Total_Primes(num);

	}
	public static void pritnt_Total_Primes(int num) {
		
		for(int i = 2; i <= num; i++) {
			if(efficient_Method_to_checkPrimeNum(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean efficient_Method_to_checkPrimeNum(int num) {
		boolean res = true;
		if(num == 0 || num == 1) {
			res =  false;
		} else {
			for(int i = 2; i*i <= num; i++) {
				if(num % i == 0) {
					res =  false;
				}
			}
		}
		return res;
	}

}
