package Math;

public class LCD {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		
		int lcd = findLcdOfTwoNum(num1, num2);
		System.out.println("LCD of num1 & num2 : "+lcd);
	}
	
	public static int findLcdOfTwoNum(int num1, int num2) {
		int maximum = max(num1, num2);
		while(true) {
			if(maximum % num1 == 0 && maximum %num2 == 0 ) {
				break;
			}
			maximum++;
		}
		return maximum;
	}
	
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

}
