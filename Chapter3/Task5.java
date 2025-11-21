package Chapter3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Largest Number Finder ---");
        
        System.out.print("Enter the first number (A): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the second number (B): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the third number (C): ");
        double c = scanner.nextDouble();
        
        scanner.close();
        
        System.out.println("-----------------------------");
        
        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } 
        else if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } 
        else {
            System.out.println("The largest number is: " + c);
        }
        
        System.out.println("-----------------------------");
    }
}