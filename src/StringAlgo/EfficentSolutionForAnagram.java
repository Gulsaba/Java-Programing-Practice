package StringAlgo;

public class EfficentSolutionForAnagram {

	public static void main(String[] args) {
		String s1 = "aabslug";
		String s2 = "aabsltg";
		boolean result = checkAnagram(s1, s2);
		if(result) {
			System.out.println("Anagram!!");
		} else {
			System.out.println("Not Anagram!!");
		}

	}
	public static boolean checkAnagram(String str1, String str2) {
	
		 final int CHAR = 256;
		 if(str1.length() != str2.length()) {
			 return false;
		 } else {
			 int[] arr = new int[CHAR];
			  for(int i=0; i<str1.length(); i++) {
				 char ch1 = str1.charAt(i);
				 char ch2 = str2.charAt(i);
				 
				 //Increase index value of ch by one. Intial value is 0 for each char.
				 //In arr[ch], ch will consider ASCII value for ch. e.g. ch = 'l' where ASCII of l = 11
				 //then arr[18] = 0 +1 = 1;
				
				 arr[ch1] = arr[ch1] + 1;				 
				 arr[ch2] = arr[ch2] - 1;
			  }
			
			  for(int j=0; j<str1.length(); j++) {
				  if(arr[str1.charAt(j)] != 0) {
					  return false;
				  }
			  }
		 }
		return true;
	}
}
