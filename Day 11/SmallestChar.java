/*
 * Question: Find the Lexicographically Smallest Character

    You are given a string S consisting of lowercase English letters. Your task is to find the lexicographically smallest character in the string.

    Input Format:
    - A single line of input containing the string S.

    Output Format:
    - Print the lexicographically smallest character from the string S.

    Constraints:
    - The string S will have at least one character.
    - The string S will contain only lowercase English letters ('a' to 'z').

    Example:

    Input 1: monkey


    Output 1: e


    Input 2: apple

    Output 2: a

 */

import java.util.*;

public class SmallestChar {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ans = input.charAt(0);
        
        for(int i = 1; i < input.length(); i++){
            if(ans > input.charAt(i)){
                ans = input.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}