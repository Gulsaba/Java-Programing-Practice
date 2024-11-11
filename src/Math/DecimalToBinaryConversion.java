package Math;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		
		int decimal_num = 2;
		String bits = "";
		while(decimal_num > 0) {
			int bit = decimal_num % 2;
			bits = bit + bits;
			decimal_num = decimal_num/2;
		}
		System.out.print(bits);

	}

}
