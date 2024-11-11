package StringAlgo;

public class AddTwoBinaryString {

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		String binaryString = addBinary(a, b);
		System.out.println("sum of two binary string : "+binaryString);

	}
	
	public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int res = num1 + num2;
        return Integer.toBinaryString(res);
    }

}
