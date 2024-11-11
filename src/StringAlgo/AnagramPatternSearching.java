package StringAlgo;

public class AnagramPatternSearching {
	public static void main(String[] args) {
		String s1 = "ABABABCD";
		String prt1 = "BAAB";
		patternSearchingALgo(s1, prt1);

		System.out.println();

		String s2 = "geeksforgeeks";
		String prt2 = "frog";
		patternSearchingALgo(s2, prt2);
	}
	
	private static void patternSearchingALgo(String str, String prt) {
		int m = str.length();
		int n = prt.length();
		for(int i = 0; i<=(m - n); i++) {
			boolean result = checkAnagram(str.substring(i, n+i), prt);
			if(result) {
				System.out.print(i+" ");
			}
			
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
