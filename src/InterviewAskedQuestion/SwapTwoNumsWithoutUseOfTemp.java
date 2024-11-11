package InterviewAskedQuestion;

public class SwapTwoNumsWithoutUseOfTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapTwoNumsWithoutUseOfTemp(a, b);
    }

    public static void swapTwoNumsWithoutUseOfTemp(int a, int b) {
        int c = a + b;
        a = c - a;
        b = c- b;

        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
