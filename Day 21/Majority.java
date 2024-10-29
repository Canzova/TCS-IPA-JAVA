/*
 * Problem Statement: Find the Majority Element in an Array

    You are given an integer array input of size n. A majority element is defined as an element that appears more than n/2 times in the array. Write a Java program that determines if there is a majority element in the array. If a majority element exists, return it; otherwise, return -1.

    The program should:
    1. Prompt the user to enter the size of the array.
    2. Accept array elements from the user.
    3. Implement two approaches:
    - HashMap-based Solution: Uses O(N) time complexity and O(N) space complexity by counting the occurrences of each element.
    - Sorting-based Solution: Uses O(N log N) time complexity and O(1) space complexity (apart from the array) by sorting the array and checking if any element meets the majority condition.

    Input Format

    1. An integer n, representing the size of the array.
    2. n integers representing the elements of the array.

    Output Format

    - If a majority element exists, print: "Majority element is : <element>".
    - If no majority element exists, print: "Majority element is not present".

    Constraints

    - \(1 \leq n \leq 10^6\)
    - Array elements can be positive or negative integers.

    Example

    Input:

    Enter the size of array : 7
    2 2 1 1 1 2 2


    Output:

    Majority element is : 2


    Explanation of the Approaches

    1. HashMap Approach:
    - Count the occurrences of each element using a HashMap.
    - Check if any element’s count is greater than n/2. If found, this element is the majority element.

    2. Sorting Approach:
    - Sort the array.
    - If a majority element exists, it will always occupy the middle position after sorting.
    - Iterate through the array to check if any element appears n/2 times starting from any position.

 */

import java.util.*;

public class Majority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }

        int ans = findMajorityElement(input);
        if (ans == -1) {
            System.out.println("Majority element is not present");
        } else {
            System.out.println("Majoriy element is : " + ans);

        }

        sc.close();
    }

    public static int findMajorityElement(int input[]) {

        /*
         * Tc : O(N);
         * Sc : O(N);
         */

        int n = input.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int ele = input[i];
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            if (temp.getValue() > n / 2) {
                return temp.getKey();
            }
        }

        return -1;
    }

    // public static int findMajorityElement(int input[]) {

    // // Tc : O(NLogN) SC : O(1);

    // int n = input.length;

    // // Step 1 sort the array
    // Arrays.sort(input);

    // // Step 2 :

    // for (int i = 0; i <= n - n / 2; i++) {
    // if (input[i] == input[i + n / 2]) {
    // return input[i];
    // }
    // System.out.println(input[i]);
    // }

    // return -1;
    // }
}