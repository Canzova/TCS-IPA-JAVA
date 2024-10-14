/*
    * Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers and an operator.charAt(0) (+, -, *, or /) and then perform the corresponding operation and display the result.

    * For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user enters 10, 3, and *, the program should display 30 as the result.

    * Your program should handle invalid inputs gracefully, for example, if the user enters an operator.charAt(0) that is not one of the four allowed operator.charAt(0)s or if the user enters non-numeric inputs. 
*/

import java.util.*;

public class Calculator {

    public static void implementCal(int num1, int num2, String operator) {

        if (operator.charAt(0) != '+' && operator.charAt(0) != '-' && operator.charAt(0) != '*'
                && operator.charAt(0) != '/') {
            System.out.println("Invalid Opeartor");
            return;
        }

        if (operator.charAt(0) == '+')
            System.out.println(num1 + num2);
        else if (operator.charAt(0) == '-')
            System.out.println(num1 - num2);
        else if (operator.charAt(0) == '*')
            System.out.println(num1 * num2);
        else
            System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input first number
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            // Input second number
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            // Input the operator
            System.out.println("Enter operator (+, -, *, /): ");
            String operator = sc.next();

            // Call the method to perform calculation
            implementCal(num1, num2, operator);

        } catch (Exception e) {
            // Handle invalid input (non-numeric values)
            System.out.println(e);
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            sc.close(); // Close the scanner resource
        }
    }

}
