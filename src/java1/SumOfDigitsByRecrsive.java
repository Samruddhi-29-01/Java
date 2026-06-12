package java1;
import java.util.Scanner;
public class SumOfDigitsByRecrsive {
	public int SumOfDigits(int n) {
		if (n == 0) {
			return 0;
		} else {
			return (n % 10) + SumOfDigits(n / 10);
		}
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int input = sc.nextInt();
			SumOfDigitsByRecrsive s = new SumOfDigitsByRecrsive();
			int result = s.SumOfDigits(input);
			System.out.println("The sum of the digits is: " + result);
			
	
	}

}
