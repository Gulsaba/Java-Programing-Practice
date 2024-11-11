package StringAlgo;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String sentence = "  Hello world   ";
		int length = findLengthOfLastWord(sentence);
		System.out.println("Length of last word : "+length);
	}
 public static int findLengthOfLastWord(String s) {
	 s = s.trim();
	 String[] arr = s.split("\\s");
	 String last = arr[arr.length-1];
	 return last.length();
 }
}
