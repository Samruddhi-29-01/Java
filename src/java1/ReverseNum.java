package java1;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
 
		int reversedNum = 0;

		while (num != 0) {
			int digit = num % 10; 
			reversedNum = reversedNum * 10 + digit; 
			num /= 10; 
		}

		System.out.println("Reversed Number: " + reversedNum);
	}

}
