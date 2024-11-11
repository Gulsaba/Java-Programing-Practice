package Math;

public class GCD {

	public static void main(String[] args) {
		int a = 20, b = 45;
		int gcd = gcdOfNumbers(a, b);
		System.out.println("GCD of a and b = "+gcd);

	}
	
	public static int gcdOfNumbers(int a, int b) {
		int min_num = min(a, b);
		while(min_num > 0) {
			if(a % min_num == 0 && b % min_num == 0){
				break;
			}
			
			min_num--;
			System.out.println(min_num);
		}
		
		return min_num;
	}
	
public static int min(int a, int b) {
		if(a > b) {
			return b;
		}
		else {
			return a;
		}
	}

}
