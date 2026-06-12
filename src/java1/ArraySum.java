package java1;
import java.util.Scanner;

public class ArraySum {
	

	    public static void main(String[] args) {

	        int arr[] = new int[5];
	        int sum = 0;

	        Scanner sc = new Scanner(System.in);

	        for(int i = 0; i < arr.length; i++) {
	            System.out.print("Enter marks of subject " + (i + 1) + ": ");
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	        double avg = (double) sum / arr.length;

	        System.out.println("Total Marks = " + sum);
	        System.out.println("Average Marks = " + avg);
	    }
}