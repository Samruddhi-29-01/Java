package java1Bank;
class SavingAccount extends Account {

    double interestRate;

    SavingAccount(int accountNumber,
                  String holderName,
                  double balance,
                  double interestRate) {

        super(accountNumber, holderName, balance);

        this.interestRate = Math.max(interestRate, 0);
    }

    void calculateInterest() {

        double interest = balance * interestRate / 100;

        System.out.println("Interest = " + interest);
    }
}