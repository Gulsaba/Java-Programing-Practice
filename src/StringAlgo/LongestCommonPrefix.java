package StringAlgo;

public class LongestCommonPrefix {
	 public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		String res = longestCommonPrefix(arr);
		System.out.println(res);
	 }
	public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
         String next = strs[i];
         int j = 0;
         while(j < next.length()){
            if(next.charAt(j) != prefix.charAt(j)){
            	break;
            }
            j++;
         }
         prefix = prefix.substring(0, j);
        }
        return prefix;
    }

}
