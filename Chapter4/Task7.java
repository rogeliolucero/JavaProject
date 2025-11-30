package Chapter4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int n2 = in.nextInt();

        System.out.println("\nArithmetic Operations");
        System.out.println(add(n1, n2));
        System.out.println(sub(n1, n2));
        System.out.println(div(n1, n2));
        System.out.println(mul(n1, n2));
    }

    static int add(int a, int b) {
         return a + b; 
        }
    static int sub(int a, int b) {
         return a - b;
         }
    static double div(int a, int b) { 
        return (double)a / b;
     } // fixed division
    static int mul(int a, int b) {
         return a * b; 
    }
}
