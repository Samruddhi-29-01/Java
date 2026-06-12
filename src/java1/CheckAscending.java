package java1;

import java.util.Scanner;

public class CheckAscending {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                System.out.println("The array is not in ascending order.");  
            }
        }
        System.out.println("The array is in ascending order.");
    }
}
