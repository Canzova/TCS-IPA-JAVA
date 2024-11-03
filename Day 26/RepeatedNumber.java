/*
 * Question:

    You are given a string consisting of letters and single-digit numbers. Your task is to decode the string according to the following rules:

    1. If a character is a letter, add it directly to the output.
    2. If a character is a single-digit number (e.g., '2', '3', etc.), it represents how many times the previous letter should be repeated in the output. For example, if the number is '3', you should repeat the previous letter 2 more times (total of 3 occurrences in output).

    Write a function solve(String str) that takes a string str as input and returns the decoded string.

    Input
    - A single string str containing both letters and single-digit numbers (0-9).
    - The string str has at least one letter.
    - The number will always have a preceding letter.

    Output
    - A decoded string formed by applying the above rules.

    Example 1:

    Input:  
    a3b2c4

    Output:  
    aaabbcccc


    Explanation:  
    - a3 means 'a' should appear 3 times, so we add "aaa".
    - b2 means 'b' should appear 2 times, so we add "bb".
    - c4 means 'c' should appear 4 times, so we add "cccc".

    Example 2:

    Input:  
    x2y3z1

    Output:  
    xxyyyz


    Explanation:  
    - x2 means 'x' should appear 2 times, so we add "xx".
    - y3 means 'y' should appear 3 times, so we add "yyy".
    - z1 means 'z' should appear 1 time, so we add "z".

    Constraints
    - The string str will only contain uppercase or lowercase English letters and single-digit numbers.
    - The number will always immediately follow a letter.
    - Each number will be between '1' and '9', inclusive.


 */

import java.util.*;

public class RepeatedNumber{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String ans = solve(input);

        System.out.println(ans);

        sc.close();
    }

    public static String solve(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)) ans += ch;
            else{
                // Digit
                int num = Integer.parseInt(Character.toString(ch));
                
                //System.out.println(num);
                num = num-1;

                while(num != 0){
                    ans += str.charAt(i-1);
                    num--;
                }

            }

        }
        return ans;
    }
}