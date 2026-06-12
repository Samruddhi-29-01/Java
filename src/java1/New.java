package java1;
import java.util.Scanner;
public class New {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter marks of 1.tenth 2.twelth 3.degree");
	int num= sc.nextInt();
	int temp=num;
	int sum=0;
	int digit;
	
	while(num>0)
	{
		digit=num%10;
	
	sum=sum+(digit*digit*digit);
	num=num/10;
	if(temp==sum) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not armstrong number");
	
	}
	
}
}
}
