package java1Bank;
public class Main {

    public static void main(String[] args) {

        Account arr[] = {

            new SavingAccount(101,
                    "Samruddhi",
                    10000,
                    5),

            new CurrentAccount(102,
                    "Raj",
                    15000,
                    5000),

            new SavingAccount(103,
                    "Neha",
                    20000,
                    4),

            new CurrentAccount(104,
                    "Amit",
                    12000,
                    3000)
        };

        double totalBalance = 0;
        double maxBalance = arr[0].getBalance();
        double minBalance = arr[0].getBalance();

        int savingCount = 0;
        int currentCount = 0;

        for (Account a : arr) {

            totalBalance += a.getBalance();

            if (a.getBalance() > maxBalance)
                maxBalance = a.getBalance();

            if (a.getBalance() < minBalance)
                minBalance = a.getBalance();

            if (a instanceof SavingAccount)
                savingCount++;

            if (a instanceof CurrentAccount)
                currentCount++;
        }

        System.out.println("Total Balance = " + totalBalance);
        System.out.println("Maximum Balance = " + maxBalance);
        System.out.println("Minimum Balance = " + minBalance);
        System.out.println("Total Saving Accounts = " + savingCount);
        System.out.println("Total Current Accounts = " + currentCount);
    }
}