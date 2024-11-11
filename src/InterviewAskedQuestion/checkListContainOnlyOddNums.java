package InterviewAskedQuestion;

import java.util.ArrayList;
import java.util.List;

public class checkListContainOnlyOddNums {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        boolean result = containsOnlyOddNumbers(list);
        System.out.println("List contains only odd numbers: " + result);
    }
    public static boolean containsOnlyOddNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                return false;
            }
        }
        return true; // If all numbers are odd, return true
    }
}
