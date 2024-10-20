/*
 * Question:

    Write a Java program that accepts a positive integer input from the user and calculates the sum of its digits. The program should then check if the sum of the digits is divisible by 3. If the sum is divisible by 3, print "TRUE", otherwise print "FALSE". Additionally, the program should handle invalid inputs gracefully by printing the exception and closing the Scanner object properly. 

    Example:

    Input: 123
    Output: TRUE



    Input: 124
    Output: FALSE


    The program should ensure that:
    - The input is a valid integer.
    - The sum of digits is correctly calculated.
    - The result indicates whether the sum is divisible by 3.

 */

import java.util.*;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            if (sum % 3 == 0) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}