package InterviewAskedQuestion;

public class reverseString {
    public static void main(String[] args) {
        String rev = reverse("hello");
        System.out.println(rev);
    }
    public static String reverse(String str){
        String rev = "";
        for(int i =0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        return rev;
    }
}
