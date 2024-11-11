package StringAlgo;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        //output = g because 'g' is first char which repeats first char of str and then 'e'
        char ch = firstRep(str);
        System.out.println("Repeating char : "+ch);
    }

    public static char firstRep(String S)
    {
        int[] CHAR = new int[256];
        for(int i=0; i<S.length(); i++){
            CHAR[S.charAt(i)]++;
        }
        int first_repeating_char = (int) S.charAt(0);
        for(int j =0; j<S.length(); j++){
            if(CHAR[S.charAt(j)] > 1){
                return S.charAt(j);
            }
        }
        return '#';
    }
}
