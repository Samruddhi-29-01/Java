package java1;
import java.util.Scanner;
public class MinNumArray {
	

	    public static void main(String[] args) {

	        int arr[] = new int[5];
	        Scanner sc = new Scanner(System.in);

	        for(int i = 0; i < arr.length; i++) {
	            System.out.print("Enter " + (i + 1) + ": ");
	            arr[i] = sc.nextInt();
	        }

	        int MinNum = arr[0];

	        for(int i = 1; i < arr.length; i++) {
	            if(arr[i] < MinNum) {
	                MinNum = arr[i];
	            }
	        }

	        System.out.println("Mininum Number = " + MinNum);

	      
	    }
	}


