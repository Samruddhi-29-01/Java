package java1;

import java.util.Scanner;
public class Pattern {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();
	int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
		System.out.print("*");
		
	}
		System.out.println(" ");
	}
}}