/*
 * Problem Statement:

    You are tasked with writing a program to help track the number of guests on a cruise over a period of time. The cruise company wants to monitor the maximum number of guests present at any given time during this period.

    Inputs:
    1. An integer ( n ): the number of times the guest count was recorded (1 ≤ ( n ) ≤ 25).
    2. An array ( E ): a sequence of integers representing the number of guests who entered the cruise at each recording time.
    3. An array ( L ): a sequence of integers representing the number of guests who left the cruise at each recording time.

    Process:
    1. First, read the value of ( n ), which determines the number of entries for guest check-in/check-out records.
    2. For the next ( n ) entries:
    - Record the number of guests who entered the cruise at each time in array ( E ).
    - Record the number of guests who left the cruise at each time in array ( L ).
    3. Calculate the total number of guests remaining on the cruise after each recording time. For each time ( i ):
    - The remaining guests are calculated as: remaining[i] = remaining[i-1] + E[i] - L[i]
    - Store the remaining guests after each time interval in an array called rem.

    Output:
    1. After processing the entries and exits, print the number of remaining guests at each recording time.
    2. Determine and print the maximum number of guests present on the cruise at any one time across all intervals.

    Example:

    Example 1
    Input:

    Enter number of times: 3
    Entry 1: 10
    Entry 2: 20
    Entry 3: 30
    Leave 1: 5
    Leave 2: 15
    Leave 3: 10


    Execution:
    1. Calculate remaining guests after each interval:
    - Time 1: ( 10 - 5 = 5 )
    - Time 2: ( 5 + (20 - 15) = 10 )
    - Time 3: ( 10 + (30 - 10) = 30 )
    2. Array rem now contains [5, 10, 30].

    Output:

    5 10 30 
    Maximum number of guests on cruise at an instance: 30


    Explanation:
    The program helps in monitoring and finding the maximum number of guests on the cruise at any given time interval based on entries and exits recorded at various times.

 */

import java.util.*;

public class InnerCircus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int entry[] = new int[n];
        int leave[] = new int[n];

        for (int i = 0; i < n; i++) {
            entry[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            leave[i] = sc.nextInt();
        }

        int remaining [] = findRemainingGuests(n, entry, leave);

        for(int i =0; i < remaining.length; i++) System.out.print(remaining[i] + " ");
        sc.close();
    }

    public static int [] findRemainingGuests(int n, int entry [], int leave[]){
        int arr[] = new int[n];

        int count = 0;

        for(int i = 0; i < n; i++){
            count = (entry[i] + count) - leave[i] ;
            arr[i] = count;
        }


        return arr;
    }
}
