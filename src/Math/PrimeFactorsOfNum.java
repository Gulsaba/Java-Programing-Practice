package Math;

public class PrimeFactorsOfNum {

	public static void main(String[] args) {
 
		int num = 12;
		findAllPrimeNums(num);
		
	}
	
	public static void findAllPrimeNums(int num) {
	if(num <=1) {
		return;
	}
		for(int i = 2; i*i <= num; i++) {
			// check num is prime of not
			while(num % i == 0 ) {
				System.out.println(i);
				num = num/i;
			}
		}
		if(num > 1){
			System.out.println(num);
		}
	}
}
