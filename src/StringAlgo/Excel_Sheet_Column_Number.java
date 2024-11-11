package StringAlgo;

public class Excel_Sheet_Column_Number {

	public static void main(String[] args) {
//		System.out.println(titleToNumber("A"));    // Output: 1
//        System.out.println(titleToNumber("B"));    // Output: 2
//        System.out.println(titleToNumber("Z"));    // Output: 26
//        System.out.println(titleToNumber("AA"));   // Output: 27
        System.out.println(titleToNumber("AB"));   // Output: 28
	}
	public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            System.out.println(columnTitle.charAt(i) - 'A');
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
