package java1;
import java.util.Scanner;

public class FindElement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        boolean found = false;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found in the array.");
        }

    
    }
}