package StringAlgo;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		String haystack = "aaa";
		String needle = "aaaa";
		int index = strStr(haystack, needle);
		System.out.println(index);

	}
	 public static int strStr(String haystack, String needle) {
	     if(haystack.length() > needle.length()){
	        return haystack.indexOf(needle);
	     } else if(haystack.length() == needle.length()){
	        return haystack.indexOf(needle);
	     }
	    return -1;
	    }
}
