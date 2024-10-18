
/*
 * Question:
    Write a Java program that reads an array of 5 integers from the user. Then, take two integer limits, limit1 and limit2, as input. Your task is to find the average (as an integer) of all the integers in the array that are strictly greater than limit1 and strictly less than limit2. Implement a method called findAverage which accepts the array and the two limits as parameters and returns the average of the qualifying integers as an integer. The result should be the integer division of the sum by the count. If no integers qualify, the program should handle this scenario by avoiding division by zero.

    For example, given the array [1, 10, 5, 8, 12] and limits 4 and 10, the qualifying numbers would be 5 and 8, and the average would be (5 + 8) / 2 = 6 (as an integer).

    Input Format:
    1. The first 5 inputs are integers representing the array elements.
    2. The next two inputs are integers representing the limit1 and limit2 values.

    Output Format:
    - Print the average of the integers that satisfy the condition of being greater than limit1 and less than limit2, as an integer.

    Example:

    Input:
    1 10 5 8 12
    4 10

    Output:
    6

 */

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int average = findAverage(arr, limit1, limit2);
        System.out.println(average);
        sc.close();
    }

    public static int findAverage(int arr[], int limit1, int limit2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limit1 && arr[i] < limit2) {
                sum += arr[i];
                count++;
            }
        }
        return sum / count;
    }
}