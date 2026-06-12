package java1;

public class RecursiveSum {
	
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int result = sum(n);
		System.out.println("The sum of the first " + n + " natural numbers is: " + result);
	}

}



