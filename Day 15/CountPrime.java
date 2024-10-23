/*
 * Problem Statement: Count the Number of Prime Digits

    Write a program to count the number of prime digits in a given integer.

    - A prime digit is any digit that is prime, i.e., it is one of the following numbers: 2, 3, 5, or 7.
    - The program should take a single integer as input, process each digit, and return the total count of digits that are prime.

    Input:
    - The input will be a non-negative integer.

    Output:
    - The output should be the count of prime digits in the given integer.

    Prime Numbers:
    - A prime number is a number greater than 1 that has no divisors other than 1 and itself.
    - Prime digits (between 0 and 9) are: 2, 3, 5, and 7.

    Constraints:
    - The input number will be a non-negative integer.
    - The input number can have multiple digits.

    Example:

    Example 1:
    Input:

    2357

    Output:

    4


    Explanation:
    - All digits (2, 3, 5, and 7) are prime, so the count is 4.

    Example 2:
    Input:

    123456

    Output:

    3


    Explanation:
    - Prime digits are 2, 3, and 5, so the count is 3.

    Example 3:
    Input:

    6789

    Output:

    1


    Explanation:
    - Only digit 7 is prime, so the count is 1.

    Approach:
    1. Parse the input integer.
    2. Extract each digit from the number.
    3. Check if each digit is prime.
    4. Count and return the total number of prime digits.

    Write the code to solve this problem using the guidelines above!

 */

import java.util.*;

public class CountPrime {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int number = Integer.parseInt(input);

        int count = countNumberOfPrimeDigits(number);
        System.out.println(count);

        sc.close();

    }

    public static int countNumberOfPrimeDigits(int number) {

        int count = 0;
        while (number != 0) {

            int digit = number % 10;
            if (isPrime(digit))
                count++;

            number = number / 10;

        }

        return count;

    }

    public static boolean isPrime(int digit) {

        if (digit < 2)
            return false;
        if (digit == 2)
            return true;
        for (int i = 2; i * i <= digit; i++) {
            if (digit % i == 0)
                return false;
        }
        return true;

    }

}