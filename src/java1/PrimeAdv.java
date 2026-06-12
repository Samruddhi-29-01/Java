package java1;

public class PrimeAdv {
	
	    static int isPrime(int num) {
	        if (num <= 1) {
	            return 0;
	        }

	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return 0;
	            }
	        }

	        return 1;
	    }

	    public static void main(String[] args) {

	        System.out.println("Prime numbers from 1 to 100 are:");

	        for (int i = 1; i <= 100; i++) {
	            if (isPrime(i) == 1) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}