package StringAlgo;

public class IsValidString {

	public static void main(String[] args) {
		String word = "aya";
		boolean isValid = checkStringISValid(word);
		System.out.println("Is string vailid : "+isValid);

	}
	public static boolean checkStringISValid(String word) {
		 if(word.length() < 3){
	            return false;
	        }

	        String vowels = "aeiouAEIOU";
	        boolean isDigit = false;
	        boolean isLetter = false;
	        boolean isVowels = false;
	        boolean isConsonant = false;
	       for(int i = 0; i<word.length(); i++){
	            char ch = word.charAt(i);
	            if(Character.isDigit(ch)){
	                isDigit = true;
	            }
	            if(vowels.indexOf(ch) != -1){
	               isVowels = true;
	           } else if(Character.isLetter(ch) && vowels.indexOf(ch) == -1){
	               isConsonant = true;
	           }
	            
	        }
	    return (isVowels && isConsonant) || isDigit; 
    }
	
}
