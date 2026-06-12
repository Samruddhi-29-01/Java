package java1;
import java.util.Scanner;
public class NumberOfDigitUsingResursion {
static  int count(int n) {
	if (n == 0) {
		return 0;
	} else {
		return 1 + count(n / 10);
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	
	
	int result = count(n);
	System.out.println("The number of digits in " + n + " is: " + result);
}
}

