package java1;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int row, col, space;

        for (row = 1; row <= n; row++) {

            for (space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}