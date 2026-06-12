package java1;
import java.util.Scanner;
public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("Enter the marks obtained:");
		double marks1 = sc.nextDouble();
		System.out.println("Enter the marks obtained:");
		double marks2 = sc.nextDouble();
		System.out.println("Enter the marks obtained:");
		double marks3 = sc.nextDouble();
		
		double precentage = (marks1 + marks2 + marks3) / 300 * 100;
		System.out.println("The percentage of " + precentage);
		
}
}