package InterviewQuestions;

public class isStringAnagram {
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("hello", "Jlhle");
        if(isAnagram){
            System.out.println("Anagram");
        } else{
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        } else{
            int[] CHAR = new int[256];
            for(int i=0; i<s1.length(); i++){
                CHAR[s1.charAt(i)]++;
                CHAR[s2.charAt(i)]--;
            }

            for(int j =0; j<s1.length(); j++){
                if(CHAR[s1.charAt(j)] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
