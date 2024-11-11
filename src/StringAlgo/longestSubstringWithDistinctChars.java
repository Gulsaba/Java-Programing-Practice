package StringAlgo;

import java.util.HashSet;

public class longestSubstringWithDistinctChars {

	public static void main(String[] args) {		
		String res = longestSubstringWithDistinctChars("aabcdedf");
		System.out.println(res);	
	}

	public static String longestSubstringWithDistinctChars(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int start = 0;
        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            while (set.contains(currentChar)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(currentChar);
            if (i - left + 1 > maxLength) {
                maxLength = i - left + 1;
                start = left;
            }
     }
        longestSubstring = str.substring(start, start + maxLength);
        return longestSubstring;
    }
}
