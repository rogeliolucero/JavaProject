package Chapter3;
import java.util.Scanner;

public class Task4 {

    public static boolean isPalindrome(String originalString) {
        StringBuilder sb = new StringBuilder(originalString);
        sb.reverse();
        String reversedString = sb.toString();
        
        return originalString.equals(reversedString);
    }

    public static void main(String[] args) {
        Scanner keme = new Scanner(System.in);
        
        System.out.println("Enter a string (e.g., dad, level, 020):");
        String inputString = keme.nextLine(); 
        
        boolean isPal = isPalindrome(inputString);
        
        if (isPal) {
            System.out.println("The input string '" + inputString + "' is a palindrome.");
        } else {
            System.out.println("The input string '" + inputString + "' is not a palindrome.");
        }
        
        keme.close();
    }
}

