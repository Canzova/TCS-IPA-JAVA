/*
 * Question: 

    Write a program that calculates the average of elements in an integer array, excluding the values at specified limit positions. Given a start and end limit, the program should compute the average of the numbers that lie between these limits in the array.

    Requirements and Rules

    1. Input Format:
    - First, an integer n representing the number of elements in the array.
    - Next, n integers representing the elements of the array.
    - Two additional integers limit1 and limit2, which represent the positions in the array (1-based index) that define the range to average.
    
    2. Rules:
    - limit1 and limit2 are boundaries in the array.
    - Only elements between these two positions are included in the calculation of the average, excluding the elements at limit1 and limit2 themselves.
    - Assume that limit1 < limit2, and the array always contains elements between these two positions.
    - The program should round down to the nearest integer if the average is not a whole number.

    3. Output:
    - The program should print the integer average of the elements between limit1 and limit2, excluding the elements at those positions.

    Example

    Input:

    5        // n (number of elements in the array)
    1 2 3 4 5 // array elements
    1        // limit1
    4        // limit2


    Explanation:
    1. Array: [1, 2, 3, 4, 5]
    2. limit1 = 1 and limit2 = 4, so we’re interested in the values between these two positions.
    3. Elements between positions 1 and 4 are [2, 3].
    4. The average of 2 and 3 is (2 + 3) / 2 = 2.5, which rounds down to 2.

 */

import java.util.*;

public class Avg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = sc.nextInt();
        int right = sc.nextInt();

        int avg = findAverage(arr, left, right);

        System.out.println(avg);
        sc.close();
    }

    public static int findAverage(int arr[], int l, int r) {
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l && arr[i] < r) {
                sum += arr[i];
                count++;
            }
        }

        if (count == 0)
            return 0;
        return sum / count;
    }
}
