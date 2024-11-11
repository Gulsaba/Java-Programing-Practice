package Math;

import java.util.ArrayList;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
		ArrayList<Integer> fact = factorial(5);
		System.out.println(fact);
		

	}
	public static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        int fact = 1;
        for(int i=2; i<=N; i++){
            fact = fact * i;
        }
        while (fact > 0) {
            alist.add(0, fact % 10); 
            fact = fact / 10;
        }
        
        return alist;
    }

}
