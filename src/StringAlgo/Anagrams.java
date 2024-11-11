package StringAlgo;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "gulsaba";
		String s2 = "abaguls";
     	boolean result = checkAnagram1(s1, s2);
		//checkAnagram2(s1, s2);
		if(result){
			System.out.println("Anagrams!!");
		} else {
			System.out.println("Not Anagrams!!");
		}
	}
	
	public static boolean checkAnagram1(String str1, String str2) {
	char[] arr1 = str1.toCharArray();
	Arrays.sort(arr1);
	
	char[] arr2 = str2.toCharArray();
	Arrays.sort(arr2);
	
	if(arr1.length != arr2.length) {
		return false;
	} else{
		for(int i=0; i<arr1.length; i++ ) {
			if(arr1[i] != arr2[i]) {
				return false;
			}	
		 }
		 return true;
	 }
  }

}
