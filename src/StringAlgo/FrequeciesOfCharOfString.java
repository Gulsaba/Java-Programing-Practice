package StringAlgo;

public class FrequeciesOfCharOfString {

	public static void main(String[] args) {
		String str = "aaabbbcfffcccd";
		findFrequeciesOfCharOfString(str);
		
		int highest_freq = findHighestFreqOfChar(str);
		System.out.println("Highest frequency "+ highest_freq);

	}

	private static void findFrequeciesOfCharOfString(String str) {
		int[] freq = new int[256];
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		
		for(int j=0; j<str.length(); j++) {
			int lastIndex = str.lastIndexOf(str.charAt(j));
			if(j == lastIndex && freq[str.charAt(j)] != 0) {
				System.out.println("freq of "+str.charAt(j)+" : "+freq[str.charAt(j)]);
			}
		}
	}
	
	private static int findHighestFreqOfChar(String str) {
		int[] freq = new int[256];
		
		int hfreq = 0;
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		
		for(int j=0; j<str.length(); j++) {
			int lastIndex = str.lastIndexOf(str.charAt(j));
			if(j == lastIndex && freq[str.charAt(j)] != 0) {
				if(freq[str.charAt(j)] > hfreq) {
					hfreq = freq[str.charAt(j)];
				}
			}
		}
		return hfreq;
	}
}
