package Pattern;

public class NumberPattern {

	public static void main(String[] args) {
		pattern1(5);

	}
	
	public static void pattern1(int num) {
		for (int i = 0; i < num; i++) {
	        // Print leading spaces for formatting
	        for (int space = 1; space < num - i; space++) {
	            System.out.print(" ");
	        }
	        
	        int number = 1;  // The first number in every row is 1
	        for (int j = 0; j <= i; j++) {
	            System.out.print(number + " ");
	            // Update the number to the next binomial coefficient
	            number = number * (i - j) / (j + 1);
	        }
	        
	        System.out.println();
	    }
	}

}
