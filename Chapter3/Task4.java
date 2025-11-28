package Chapter3;

import java.util.Scanner;

public class Task4{

    public static boolean isPalindrome(String originalString){
    StringBuilder s = new StringBuilder(originalString);
    s.reverse();
    String reversedString = s.toString();

    return originalString.equals(reversedString);
    
    }
    public static void main(String[] args) {
        Scanner keme = new Scanner(System.in);

        System.out.print("Input String : ");
        String input =keme.nextLine();

        boolean pal = isPalindrome(input);

        if (pal){
            System.out.print("The input string " + input + " " + "is a polindrome");
        }
        else {
            System.out.print("The input string "+ input + " " + "is a not polindrome");
        }
    }
}

