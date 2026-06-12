package java1Bank;
class Account {

    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = Math.max(balance, 0);
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid Deposit Amount");
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(accountNumber + " " +
                holderName + " " +
                balance);
    }

    double getBalance() {
        return balance;
    }
} 