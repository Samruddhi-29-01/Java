package java1;

public class BankUsingFunction {
	

	static double calculateDiscount(double amount) {
		if (amount >= 1000) {
			return amount * 0.1; 
		} else if (amount >= 500) {
			return amount * 0.05;
		} else {
			return 0; 
		}
	}

	public static void main(String[] args) {
		double purchaseAmount = 1200; 
		double discount = calculateDiscount(purchaseAmount);
		double finalAmount = purchaseAmount - discount;

		System.out.println("Purchase Amount: " + purchaseAmount);
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount to Pay: " + finalAmount);
	}
}