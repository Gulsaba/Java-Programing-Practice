package Math;

public class ComputePowerOfNOfNum {

	public static void main(String[] args) {
		int num = 3;
		int power = 4;
		
		int result = power(num, power);
		System.out.println("Power of num : "+result);
		

	}
	public static int power(int num, int power) {
		
		int res = num;
		for(int i =1; i<power; i++) {
			res = res * num;
		}
		
		return res;
	}

}
