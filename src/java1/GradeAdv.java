package java1;
import java.util.Scanner;
import java.util.Scanner;

public class GradeAdv {

    static double calculatePercentage(int m1, int m2, int m3, int m4, int m5) {
        int sum = m1 + m2 + m3 + m4 + m5;
        return (sum / 500.0) * 100;
    }

    static void displayGrade(double per) {
        if (per >= 90)
            System.out.println("Grade: A+");
        else if (per >= 80)
            System.out.println("Grade: A");
        else if (per >= 70)
            System.out.println("Grade: B");
        else if (per >= 60)
            System.out.println("Grade: C");
        else if (per >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: Fail");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks 5: ");
        int m5 = sc.nextInt();

        int sum = m1 + m2 + m3 + m4 + m5;
        double percentage = calculatePercentage(m1, m2, m3, m4, m5);

        System.out.println("Total Marks = " + sum);
        System.out.println("Percentage = " + percentage + "%");

        displayGrade(percentage);

        sc.close();
    }
}