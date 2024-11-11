package Math;

public class DevisorsOfNum {

	public static void main(String[] args) {
		int num = 100;
		for(int i = 1; i<100; i++) {
			if(num % i == 0) {
				System.out.print(i+" ,");
			}
		}
	}

}
