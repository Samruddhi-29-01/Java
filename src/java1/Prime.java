package java1;
import java.util.Scanner;
public class Prime {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();
	int i;
	for(i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println("Not prime");
			return;
		}
			else {
				System.out.println("Prime");
				
			}
		}
	}
}

