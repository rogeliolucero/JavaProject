package Chapter4;

public class Task8 {

    public static void main(String[] args) {
        int total = processNumbers(4, 5, 10);
        System.out.println("\nTotal of all parameters: " + total);
    }

    public static int processNumbers(int... nums) {
        int totalSum = 0;

        for (int n : nums) {
            totalSum += n;

            int cumSum = 0;
            System.out.print(n + " = (");

            for (int i = 1; i <= n; i++) {
                cumSum += i;
                System.out.print(i);
                if (i < n) System.out.print("+");
            }

            System.out.println(") = " + cumSum);
        }

        return totalSum;
    }
}
