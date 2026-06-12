package java1;
import java.util.Scanner;

public class Cab {

    static double calculatefare(double distance, int hr, int input) {
        double fare = 0;

        if (input == 1) {
            fare = distance * 10;
        }
        else if (input == 2) {
            fare = distance * 15;
        }
        else if (input == 3) {

            if (hr <= 5) {
                fare = hr * 100;
            }
            else {
                fare = hr * 80;
            }
        }
        else {
            System.out.println("Invalid input");
        }

        return fare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of Taxi (1.Bike 2.Car 3.Rental): ");
        int input = sc.nextInt();

        System.out.println("Enter the distance in km: ");
        double distance = sc.nextDouble();

        System.out.println("Enter the hours for rental: ");
        int hr = sc.nextInt();

        double fare = calculatefare(distance, hr, input);

        System.out.println("Total Fare = " + fare);
    }
}