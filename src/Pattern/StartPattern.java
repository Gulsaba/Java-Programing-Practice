package Pattern;

import Array.isArraySorted;

public class StartPattern {

	public static void main(String[] args) {
		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(5);

	}
//	*
//	**
//	***
//	****
	
	public static void pattern1() {
		for(int i=0; i<=5; i++) {
			int num = 1;
		while(num <= i) {
			System.out.print("*");
			num++;
		}
		System.out.println();
		}
	}
	
//	****
//	***
//	**
//	*
	public static void pattern2() {
		for(int i=5; i>=0; i--) {
			int num = i;
		while(num >= 1) {
			System.out.print("*");
			num--;
		}
		System.out.println();
		}
	}
	
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
	
	public static void pattern3() {
		for(int i=0; i<=5; i++) {
			int num = 1;
		while(num <= i) {
			System.out.print("*");
			num++;
		}
		System.out.println();
		}
		
		for(int i=4; i>=0; i--) {
			int num = i;
		while(num >= 1) {
			System.out.print("*");
			num--;
		}
		System.out.println();
		}
	}
	
//	    *
//	   **
//	  ***
//	 ****
//	*****
	public static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {  
			 for (int space = 1; space <= n - i; space++) {
		            System.out.print(" ");
		        }
		        for (int j = 1; j <= i; j++) {
		            System.out.print("*");
		        }
			System.out.println();
		}
	}
	
	public static void pattern6(int n) {
		for (int i = n; i >= 1; i--) {  
			 for (int space = 1; space <= n - i; space++) {
		            System.out.print(" ");
		        }
		        for (int j = 1; j <= i; j++) {
		            System.out.print("*");
		        }
			System.out.println();
		}
	}
	
// *****
// *   *
// *   *
// *   *
// *****
 
	public static void pattern7(int n) {
		for(int i =0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i == 0 || i == (n-1)) {
					System.out.print("*");
				} else if(j == 0 || j == (n-1)) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
}
