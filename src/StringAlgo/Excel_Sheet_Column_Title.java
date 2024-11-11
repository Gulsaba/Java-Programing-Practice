package StringAlgo;

public class Excel_Sheet_Column_Title {

	public static void main(String[] args) {
		int columnNumber = 701;
		String res =  convertToTitle(columnNumber);
		System.out.println(res);
	}
	public static String convertToTitle(int columnNumber) {
        String res = "";
        while (columnNumber > 0) {
            columnNumber--;
            System.out.println(columnNumber % 26);
         //   System.out.println(('A' + (columnNumber % 26))); //will return ASCII value
            char ch = (char) ('A' + (columnNumber % 26));
            res = ch + res;
            columnNumber /= 26;
        }
        return res;
    }
}
