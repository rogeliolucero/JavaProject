package Chapter4;

import static java.lang.Math.*;   // Static import

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);   // Use Math.addExact()
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);   // Use Math.subtractExact()
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);   // Use Math.multiplyExact()
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);   // Use Math.floorDiv()
    }

    public static void main(String[] args) {

        int a = 20, b = 5;

        System.out.println("Math Operations Using Static Import:\n");

        System.out.println("Add: " + add(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
    }
}
