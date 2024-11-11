package StringAlgo;

public class ReverseWordOfStringArray {

	public static void main(String[] args) {
		String stm = "i.like.this.program.very.much";
		String result = reverseWordOfStringArray(stm);
		System.out.println(result);
	}

	private static String reverseWordOfStringArray(String stm) {
		
		String[] arr = stm.split("\\.");
		for(int i = 0; i< (arr.length)/2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		 
		for(String word: arr) {
			System.out.println(word);
		}
		
		String result = String.join(".", arr);
		return result;
	}
}
