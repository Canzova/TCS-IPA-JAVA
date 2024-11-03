/*
 * Question:

    Given a non-negative integer, write a function that repeatedly sums its digits until the sum is a single-digit number.

    For example, if you start with the number 9875, you will sum its digits as follows:
    - 9 + 8 + 7 + 5 = 29
    - 2 + 9 = 11
    - 1 + 1 = 2

    The final single-digit result is 2.

    Write a function findRepeatedSum(int num) that takes an integer num as input and returns the single-digit result obtained by repeatedly summing the digits of num until only a single-digit number remains.

    Input
    - An integer num (0 ≤ num ≤ 10^9).

    Output
    - A single-digit integer that is the result of repeatedly summing the digits of num until only one digit remains.

    Example

    Example 1:

    Input:  
    9875

    Output:  
    2


    Explanation:  
    - Sum of digits of 9875 is 29.
    - Sum of digits of 29 is 11.
    - Sum of digits of 11 is 2.

    Example 2:

    Input:  
    123

    Output:  
    6


    Explanation:  
    - Sum of digits of 123 is 6, which is already a single-digit number.

    Constraints
    - 0 ≤ num ≤ 10^9

 */

import java.util.*;
public class RepeatedSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = findRepeatedSum(num);

        System.out.println(sum);

        sc.close();
    }

    public static int findRepeatedSum(int num){
        int sum = 10;

        while(sum > 9){
            int tempSum = 0;
            while(num != 0){
                tempSum += num%10;
                num = num/10;
            }
            sum = tempSum;
            if(sum > 9) num = sum;
        }

        return sum;
    }
}
