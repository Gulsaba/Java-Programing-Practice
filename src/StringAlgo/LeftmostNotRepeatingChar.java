package StringAlgo;

public class LeftmostNotRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";  //  o/p = 'f'
        int indexofFirstNonRepeatingChar = findIndexOfFirstNonRepeatingChar(str);
        System.out.println(indexofFirstNonRepeatingChar);
    }
    public static int findIndexOfFirstNonRepeatingChar(String str) {
        int[] charArray = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charArray[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charArray[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
