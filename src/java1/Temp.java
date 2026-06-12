package java1;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("Enter 'C' for Celsius to Fahrenheit");
        System.out.println("Enter 'F' for Fahrenheit to Celsius");
        
        char ch = sc.next().charAt(0);

        if (ch == 'C') {
           
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
            
        } else if (ch == 'F') {
          
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
            
        } else {
            System.out.println("Invalid ");
        }

       
    }
}
