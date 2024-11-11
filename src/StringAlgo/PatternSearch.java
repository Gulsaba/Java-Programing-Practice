package StringAlgo;

public class PatternSearch {
	public static void main(String[] args) {
		String s1 = "ABABABCD";
		String prt1 = "ABAB";
		
		patternSearchingALgo(s1, prt1);
		System.out.println(); 
		
		String s2 = "AAAAA";
		String prt2 = "AA";
		patternSearchingALgo(s2, prt2);
		System.out.println();
		
		String s3 = "AAAAA";
		String prt3 = "CD";
		patternSearchingALgo(s3, prt3);
		
		
	}

	// Naive solution (Time complexity:- O((str_length - prt_length + 1) x prt_length) )
	private static void patternSearchingALgo(String
													 str, String prt) {
	    int str_length = str.length();
	    int prt_length = prt.length();
	    int diff = str_length - prt_length;
	    for (int i = 0; i <= diff; i++) {
	        int j;
	        for (j = 0; j < prt_length; j++) {
	            if (str.charAt(i + j) != prt.charAt(j)) {
	                break;
	            }
	        }
	        if (j == prt_length) {
	            System.out.print(i+" ");   
                //Never use System.out.print(i+' '); because ' ' consider as string value in java it's ASCII value is 32 so output will be 'i + 32'
	        }
	    }
	    
	    //time complexity is O((str_length - prt_length + 1) x prt_length)
	}
}
