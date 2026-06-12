package java1AbstractClass;

abstract class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    final void deposit(double amt) {
        balance += amt;
    }

    abstract void withdraw(double amt);

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", balance=" + balance + "]";
    }
}