/* 
MD Abir A. Choudhury
090718
Program 1 - Operations
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class operations{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers with Enter after each one: ");
        
        // variable declarations
        double number1, number2;
        
        number1 = S.nextDouble();
        number2 = S.nextDouble();

        // display the Outputs
        System.out.println("The sum is: " + (number1 + number2));
        System.out.println("The difference is: " + (number1 - number2));
        System.out.println("The product is: " + (number1 * number2));
        System.out.println("The quotient is: " + (number1 / number2));

        // display whether number1 or number2 are even or odd
        if((number1 % 2) == 0) {
            System.out.println("The first number is even");
        }
        else {
            System.out.println("The first number is odd");
        }
        if((number2 % 2) == 0) {
            System.out.println("The second number is even");
        }
        else {
            System.out.println("The second number is odd");
        }
        S.close();
    }
}