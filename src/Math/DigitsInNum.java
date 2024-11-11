package Math;

public class DigitsInNum {

	public static void main(String[] args) {
		int num = 011;
        int res  = countOfDigitsInNumber(num);
        System.out.println("Count of digits in given number : "+res);
	}
	public static int countOfDigitsInNumber(int num){
		int digits = 0;
		while(num > 0) {
			num = num / 10;
			digits = digits + 1;
		}
		return digits;
	}
}
