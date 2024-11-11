package StringAlgo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = myObj.nextLine();
		
		if(isStringPalindrome(str)) {
			System.out.printf("String '%s", str +"' is palindrome.");
		}	else {
			System.out.println("Not palindrom!!");
		}
		
		System.out.println();
		System.out.println("Efficent method of palindrome");
		
		if(efficentMethodToCheckPalindrome(str)) {
			System.out.printf("String '%s", str +"' is palindrome.");
		}	else {
			System.out.println("Not palindrom!!");
		} 
		
	}
	
	public static boolean isStringPalindrome(String ostr) {
		String nstr = "";
		int l = ostr.length()-1;	
		for(int i = l; i>=0; i--) {
			nstr = nstr + ostr.charAt(i);
		}
		if(ostr.equals(nstr)) {
			return true;
		}
		return false;
	}
	
	public static boolean efficentMethodToCheckPalindrome(String str) {
		int end = str.length() - 1;
		int begine = 0;
		
		while(begine < end) {
			if(str.charAt(begine) != str.charAt(end)) {
				return false;
			}
			begine++;
			end--;
			
		}
		return true;
	}

}
