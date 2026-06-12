package java1;
import java.util.Scanner;
public class ReverseNumUsingResursion {
    static int rev = 0;
    static int reverse(int num) {
        if (num == 0) {
            return rev;
        }
        rev = rev * 10 + (num % 10);
        return reverse(num / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed Number = " + reverse(num));

        sc.close();
    }
}