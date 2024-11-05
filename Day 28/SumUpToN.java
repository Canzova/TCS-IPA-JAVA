/*
 * Question: Sum Up to N

    Write a Java program that calculates the sum of all natural numbers from 1 up to a given number N.

 *   Requirements

    Input:
    The program should prompt the user to enter a positive integer N.
    Assume that N will always be a positive integer.

    Output:
    The program should print the sum of all natural numbers from 1 to N.

    Constraints:
    Use both formula and loop to solve this.
    
    Example:

    Input:
    Copy code
    5
    Output:
    Copy code
    15
    Explanation: The sum of numbers from 1 to 5 is 1 + 2 + 3 + 4 + 5 = 15.
 */

import java.util.*;

public class SumUpToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = findSumUptoN(n);

        System.out.println(sum);

        sc.close();
    }

    public static int findSumUptoN(int num) {
        // int sum = 0;
        // for (int i = 1; i <= num; i++) {
        // sum += i;
        // }
        // return sum;

        return (num * (num + 1)) / 2;
    }

}