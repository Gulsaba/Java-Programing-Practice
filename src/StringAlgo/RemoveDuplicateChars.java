package StringAlgo;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "gggulgggsabaaaas";
		String res = removeDuplicateCharFromString(str);
		System.out.println(res);

	}
	
	public static String removeDuplicateCharFromString(String str){
		String res = "";
		for (int i = 0; i < str.length(); i++) {
		      int lastIndex = str.lastIndexOf(str.charAt(i));
		      if (lastIndex == i) {
		        res = res + str.charAt(i);
		      }
		    }
		return res;
	}

}
