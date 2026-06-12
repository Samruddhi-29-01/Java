package java1;

public class BiggestDigitFromNumbers {
	public static void main(String[] args) {
		int num = 12345;
		int biggestDigit = 0;

		while (num > 0) {
			int digit = num % 10;
			if (digit > biggestDigit) {
				biggestDigit = digit;
			}
			num = num / 10;
		}

		System.out.println("Biggest digit: " + biggestDigit);
	}
	

}
