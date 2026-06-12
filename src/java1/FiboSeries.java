package java1;

public class FiboSeries {
    public static void main(String[] args) {

        int a = 0, b = 1, c;
        int sum=0;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 2; i < 8; i++) {
            c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
           sum=sum+c;
        }
        System.out.println("\nSum of Fibonacci Series: " + sum);
    }
}