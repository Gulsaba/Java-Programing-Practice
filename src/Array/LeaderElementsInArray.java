package Array;
import java.util.*;
public class LeaderElementsInArray {

	public static void main(String[] args) {
    int []arr = {16, 17, 4, 3, 5, 2};
    try {
    	 ArrayList<Integer> listOfLeaderElm = leaderElementsInArray(arr);
    	 System.out.println(listOfLeaderElm);
    }catch(Exception ex) {
    	System.out.println(ex);
    }

	}
	
   public static ArrayList<Integer> leaderElementsInArray(int []arr){
	   ArrayList<Integer> arrList = new ArrayList<Integer>();
	   int leaderElm = arr[arr.length-1];
	   arrList.add(leaderElm);
	   for(int i= arr.length-2; i>=0; i--) {
		   if(arr[i] > leaderElm) {
			   leaderElm = arr[i];
			   arrList.add(leaderElm);
		   }
	   }
	   return arrList;
   }

}
