package java1Bank;
class CurrentAccount extends Account {

    double overdraftLimit;

    CurrentAccount(int accountNumber,
                   String holderName,
                   double balance,
                   double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = Math.max(overdraftLimit, 0);
    }

    boolean canWithdraw(double amount) {
    	
        return amount <= (balance + overdraftLimit);
    }

    @Override
    void withdraw(double amount) {

        if (canWithdraw(amount)) 
            balance -= amount;
        else
            System.out.println("Overdraft Limit Exceeded");
    }
}
