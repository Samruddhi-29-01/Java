package java1;

import java.util.Scanner;

public class Bank {

   
    static double deposit(double balance, double amount) {
        balance = balance + amount;
        return balance;
    }

    static double withdraw(double balance, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
        return balance;
    }

 
    static void checkBalance(double balance) {
        System.out.println("Current Balance = " + balance);
    }

    static void calculateFD(double amount, double rate, int time) {
        double interest = (amount * rate * time) / 100;
        double maturityAmount = amount + interest;

        System.out.println("FD Amount = " + amount);
        System.out.println("Interest Earned = " + interest);
        System.out.println("Maturity Amount = " + maturityAmount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 10000; 

        System.out.println("1.Withdraw 2.Deposit 3.Check Balance 4.FD");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            System.out.print("Enter Withdrawal Amount: ");
            double withdrawAmount = sc.nextDouble();
            balance = withdraw(balance, withdrawAmount);
            checkBalance(balance);
            break;

        case 2:
            System.out.print("Enter Deposit Amount: ");
            double depositAmount = sc.nextDouble();
            balance = deposit(balance, depositAmount);
            System.out.println("Deposit Successful!");
            checkBalance(balance);
            break;

        case 3:
            checkBalance(balance);
            break;

        case 4:
            System.out.print("Enter FD Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter Interest Rate (%): ");
            double rate = sc.nextDouble();

            System.out.print("Enter Time (Years): ");
            int time = sc.nextInt();

            calculateFD(amount, rate, time);
            break;

        default:
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
} 