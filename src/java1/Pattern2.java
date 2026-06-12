package java1;

import java.util.Scanner;
public class Pattern2 {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();
	int row, col;
	   
for(row=n;row>=1;row--) {
	for (col=1;col<=row;col++) {
		System.out.print("*");
	}
	System.out.println(" ");
}
	
}
	
}
	
	
	
	