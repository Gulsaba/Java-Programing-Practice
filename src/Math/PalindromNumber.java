package Math;

public class PalindromNumber {

	public static void main(String[] args) {
		//int num = 3431;
		int num = 212;
		boolean isNumPalindrom = checkNumIsPalindrom(num);
		if(isNumPalindrom) {
			System.out.println("Palindrom!!");
		}
		else {
			System.out.println("Non palidrom");
		}

	}
	

	public static boolean checkNumIsPalindrom(int num) {
		int initialValueOfNum = num;;
		int reminder, rev = 0;
		while(num > 0) {
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;
		}
		if(rev == initialValueOfNum) {
			return true;
		}
		return false;
	}
}
