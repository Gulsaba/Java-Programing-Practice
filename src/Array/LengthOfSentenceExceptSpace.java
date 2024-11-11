package Array;

public class LengthOfSentenceExceptSpace {

	public static void main(String[] args) {
		String sentence = "word1 word2   word3 word1 word2";
        String[] arr = sentence.split("\\s");
        StringBuffer newString = new StringBuffer();
        for(int i = 0; i<arr.length; i++) {
        	newString = newString.append(arr[i]);
        }
        System.out.println(newString.length());
	}

}
