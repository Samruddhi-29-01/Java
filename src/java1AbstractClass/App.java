package java1AbstractClass;

public class App {
    public static void main(String[] args) {

        Account a1 = new CorparateAccount("Samruddhi", 5000);

        a1.deposit(2000);

        a1.display();

        a1.withdraw(3000);

        a1.display();
    }
}