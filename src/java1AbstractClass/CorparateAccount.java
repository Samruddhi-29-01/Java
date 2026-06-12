package java1AbstractClass;

public class CorparateAccount extends Account {

    CorparateAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void withdraw(double amt) {
        if (balance - amt >= 1000) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Minimum balance should remain 1000");
        }
    }
}