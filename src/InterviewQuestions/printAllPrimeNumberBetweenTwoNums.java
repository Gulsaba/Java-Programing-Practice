package InterviewQuestions;

public class printAllPrimeNumberBetweenTwoNums {
    public static void main(String[] args) {
        int firstNumber = 5, secondNumber = 10;
        printAllPrimeNumberBetweenTwoNums(firstNumber, secondNumber);
    }
    public static void printAllPrimeNumberBetweenTwoNums(int a, int b) {
        int maxel = max(a, b);
        for(int i = (a + 1); i<b; i++){

        }
    }

    public static int max(int a, int b) {
        if(a>b){
            return a;
        } else{
            return b;
        }
    }
}
