package java1;

public class Butterfly {
	public static void main(String[] args) {
		int n = 5; 

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			for (int space = 1; space <= 2 * (n - row); space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int row = n; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			for (int space = 1; space <= 2 * (n - row); space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
