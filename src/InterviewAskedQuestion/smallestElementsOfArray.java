package InterviewAskedQuestion;

public class smallestElementsOfArray {
    public static void main(String[] args) {
       int[] arr =  {1, 3, 9, 7, 5};
        int smallestNum = printSmallestNum(arr);
       System.out.println("Smallest number : "+smallestNum);
    }

    public static int printSmallestNum(int[] arr){
        int smallestNum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallestNum){
                smallestNum = arr[i];
            }
        }
        return smallestNum;
    }
}
