package java1;
import java.util.Scanner;

public class OnlineFoodDelivery {

    public int hotelname(String name) {
        if (name.equals("Domino's")) {
            return 1;
        } else if (name.equals("McDonald's")) {
            return 2;
        } else if (name.equals("Pizza Hut")) {
            return 3;
        } else {
            return 0;
        }
    }

    public int foodorder(String order) {
        if (order.equals("pizza")) {
            return 100;
        } else if (order.equals("burger")) {
            return 50;
        } else if (order.equals("pasta")) {
            return 80;
        } else {
            return 0;
        }
    }

    public int deliverychager(int distance) {
        if (distance <= 5) {
            return 20;
        } else if (distance <= 10) {
            return 40;
        } else {
            return 60;
        }
    }

    public int couponcode(String code) {
        if (code.equals("DISCOUNT10")) {
            return 10;
        } else if (code.equals("DISCOUNT20")) {
            return 20;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hotel name (Domino's, McDonald's, Pizza Hut): ");
        String name = sc.nextLine();

        OnlineFoodDelivery ofd = new OnlineFoodDelivery();

        int hotel = ofd.hotelname(name);

        if (hotel == 0) {
            System.out.println("Invalid Hotel Name!");
            sc.close();
            return;
        }

        System.out.println("Enter the food order (pizza, burger, pasta): ");
        String order = sc.nextLine();

        System.out.println("Enter the delivery distance in km: ");
        int distance = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the coupon code (DISCOUNT10, DISCOUNT20) or press Enter: ");
        String code = sc.nextLine();

        int foodCost = ofd.foodorder(order);
        int deliveryCharge = ofd.deliverychager(distance);
        int discount = ofd.couponcode(code);

        int totalCost = foodCost + deliveryCharge - discount;

        System.out.println("\n----- BILL -----");
        System.out.println("Hotel Code      : " + hotel);
        System.out.println("Food Cost       : " + foodCost);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Discount        : " + discount);
        System.out.println("Total Cost      : " + totalCost);

  
    }
}