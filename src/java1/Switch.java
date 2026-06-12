package java1;

import java.util.Scanner;

public class Switch{
	public static void main(String[] args) {
	System.out.println("1.tea 2.water 3. coffee 4.juice");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int choice=sc .nextInt();
		switch(choice) {
		case 1:
			System.out.println("1.tea ");
			break;
		case 2:
			System.out.println("2.water");
			break;
		case 3:
			System.out.println("3. coffee");
			break;
		case 4:
			System.out.println(" 4.juice");
			break;
			
		default:
			System.out.println(" Nothing");
			break;
		}
		
	}
}