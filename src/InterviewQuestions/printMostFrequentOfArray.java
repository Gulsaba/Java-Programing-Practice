package InterviewQuestions;

public class printMostFrequentOfArray {
    public static void main(String[] args) {
        int[] array = {9,2,1,4,9,5,6,9,8,9,10};
        int mostFrequent = mostFrequent(array);
        System.out.println(mostFrequent);
    }

    public static int mostFrequent(int[] array) {
        int freq = array[0];
        int maxCount = 0;
        for(int i = 0; i < array.length; i++) {
            int count = 1;
           for(int j = i+1; j < array.length; j++) {
               if(array[i] == array[j]) {
                   count++;
                   array[j] = -1;
               }
           }
           if(count > maxCount && array[i] != -1) {
               maxCount = count;
               freq = array[i];                                                                                                                        
            }
        }
        return (maxCount > 1) ? freq : -1;
    }
}
