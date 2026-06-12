package java1;
import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
	int i=1;
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number for player 1: ");
	 int num = sc.nextInt();
	 int guess;
	 int count =0;
	 
	do { 
		 System.out.print("Enter a number for player 2: ");
		 guess = sc.nextInt();
		 count++;
		 if(guess<num) {
			 System.out.println("Too low! Try again.");
		 }
		 else if(guess>num) {
			 System.out.println("Too high! Try again.");
		 }
		 else {
			 System.out.println("Congratulations! You guessed the number in " + count + " attempts.");
			
		 }
		
	}while(guess!=num);
	 System.out.println("total attempts: " + count);
	 
} 
}
