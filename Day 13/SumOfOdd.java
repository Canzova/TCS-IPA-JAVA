/*
 * Question Statement:
    Write a Java program that reads 5 integers from the user and calculates the sum of all the odd numbers in the array. The program should then print the sum if it is greater than 8 and less than 50. Otherwise, it should print "NA".

    Input:
    •	The input consists of 5 integers provided by the user.

    Output:
    •	If the sum of odd numbers is greater than 8 and less than 50, print the sum.
    •	Otherwise, print "NA".

    Example:
    Input:
    1 3 5 7 9
    Output:
    Sum of odd numbers: 25

    Input:
    2 4 6 8 10
    Output:
    NA

 */

import java.util.*;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // Sum of odd numbers
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0) { // Number is odd
                sum += arr[i];
            }
        }

        // Check if sum is in the desired range
        if (sum > 8 && sum < 50) {
            System.out.println("Sum of odd numbers: " + sum);
        } else {
            System.out.println("NA");
        }

        sc.close();
    }
}
