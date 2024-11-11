package Math;

public class SquarRootOrNearestSquarRootOfNum {

	// if num = 4 then squar_root = 2
	//if num = 14 then nearest squar_root = 3
	
	public static void main(String[] args) {
		int num = 16;
		//int sqrt = findSqrt(num);
		int sqrt = findSqrtUsingBinarySearchAlgo(num);
		System.out.println("Squar root of num : "+sqrt);

	}
	
	//Naive solution with time complexity root(x)
	public static int findSqrt(int num) {
		int i = 1;
		while(i*i <= num) {
			i++;
		}
		return i-1;
	}
	
	//Efficient solution
	public static int findSqrtUsingBinarySearchAlgo(int num) {
		int l = 1;  //l should not be 0 because 0 could not be root of any integer
		int r = num;
		int ans = -1;
		while(l <= r) {
			int mid = (l + r)/2;
			int sqr = mid * mid;  //sqr of any number is num /2 <= num
			if(sqr == num) {
				return mid;
			} else if(sqr > num){
				r = mid -1;
			} else {
				l = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

}
