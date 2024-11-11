package StringAlgo;

public class IsStatementPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean isPalindrome = isPalindrome(s);
		if(isPalindrome) {
			System.out.println("Palindrome!!");
		} else {
			System.out.println("Not Palindrome!");
		}

	}
	 public static boolean isPalindrome(String s) {
	        String original = "";
	        String reversed = "";
	        for(int i=0; i<s.length(); i++){
	            char ch = Character.toUpperCase(s.charAt(i));
	            if(Character.isLetter(ch) || Character.isDigit(ch)){
	                original = original + ch;
	                reversed = ch + reversed;
	            }
	        } 
	        //System.out.println(reversed);
	        if(reversed.equals(original)){
	            return true;
	        }
	        return false;
	    }
}
