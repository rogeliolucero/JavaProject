package Chapter3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner eme = new Scanner(System.in);
        
        System.out.print("Number1: ");
        int num1 = eme.nextInt();

        System.out.print("Number2: ");
        int num2 = eme.nextInt();

        System.out.print("Number3: ");
        int num3 = eme.nextInt();
        
         if (num1 == num2 && num2 == num3){
            System.out.println("All number is Equal");
        }
    
       else if (num1 >= num2 && num1 >= num3){
            System.out.println(" The Largest Number is : " + num1);
        }
         else if (num2 >= num1 && num2 >= num3){
            System.out.println(" The Largest Number is : " + num2);
        }
         else {
            System.out.println(" The Largest Number is : " + num3);
        }
       
        eme.close();

    }

}
