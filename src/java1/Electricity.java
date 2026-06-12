package java1;
import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        
       
        int units = sc.nextInt(); 
        
        double billAmount;
        if (units <= 100) {
            billAmount = units * 1;
        } else if (units <= 200) {
            billAmount = 100 * 1 + (units - 100) * 2;
        } else if (units <= 300) {
            billAmount = 100 * 1 + 100 * 2 + (units - 200) * 3;
        } else {
            billAmount =  (units - 300) * 4;
        }
        
        System.out.println("The electricity bill amount is: " + billAmount);
      
 
    }
}
