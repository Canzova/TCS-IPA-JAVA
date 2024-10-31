/*
 * Question:

    Write a Java program that checks if a given integer is a "Perfect Number." A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. For example, 6 is a perfect number because its divisors (1, 2, and 3) sum up to 6. In this program, you need to:

    1. Prompt the user to enter an integer.
    2. Determine whether the entered integer is a perfect number.
    3. Print "Perfect Number" if the number is perfect; otherwise, print "Not Perfect Number."

    Example:

    Input:
    6

    Output:
    Perfect Number

    Input:
    10

    Output:
    Not Perfect Number
    

    Constraints:
    - The input integer should be a positive integer.

 */

import java.util.*;

public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();

        boolean result = findPerfectOrNot(input);

        if(result){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
        sc.close();
    }

    public static boolean findPerfectOrNot(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        return sum == num ? true : false;
    }
}