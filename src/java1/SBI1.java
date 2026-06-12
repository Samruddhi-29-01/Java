package java1;

import java.util.Scanner;

public class SBI1 {

    String name;
    String accNo;
    double balance;

    SBI1() {
        name = "";
        accNo = "";
        balance = 0;
    }

    SBI1(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs. " + amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rs. " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void currentBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    void checkAccount() {
        if (accNo.endsWith("PRE")) {
            System.out.println("Account Type : Premium");
        } else if (accNo.endsWith("COR")) {
            System.out.println("Account Type : Corporate");
        } else if (accNo.endsWith("BUS")) {
            System.out.println("Account Type : Business");
        } else if (accNo.endsWith("SAV")) {
            System.out.println("Account Type : Savings");
        } else {
            System.out.println("Unknown Account Type");
        }
    }

    void showDetails() {
        System.out.println("\n----- Customer Details -----");
        System.out.println("Name : " + name);
        System.out.println("Account No : " + accNo);
        System.out.println("Balance : Rs. " + balance);
        checkAccount();
    }

    static void bankMaiChori() {
        System.out.println("Alert! Security Team Informed.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        SBI1 cust = new SBI1(name, accNo, 0);

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n===== SBI MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Current Balance");
            System.out.println("4. Check Account Type");
            System.out.println("5. Show Details");
            System.out.println("6. Bank Mai Chori");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            System.out.println("You entered: " + choice);

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    double dep = sc.nextDouble();
                    cust.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double wd = sc.nextDouble();
                    cust.withdraw(wd);
                    break;

                case 3:
                    cust.currentBalance();
                    break;

                case 4:
                    cust.checkAccount();
                    break;

                case 5:
                    cust.showDetails();
                    break;

                case 6:
                    SBI1.bankMaiChori();
                    break;

                case 0:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

    }
}