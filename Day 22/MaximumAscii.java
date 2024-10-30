/*
 * Question:

    Write a Java program that reads a string input from the user and finds the character with the highest ASCII value in the string. Implement a method findMaxAsciChar(String str) which takes the string as input and returns the character with the maximum ASCII value.

    - Input: A single line string containing alphanumeric characters or symbols.
    - Output: The character in the string with the highest ASCII value.

    For example:
    - Input: "Hello123"
    - Output: o 

    Your program should use the findMaxAsciChar method to find the character with the maximum ASCII value.

 */

import java.util.*;

public class MaximumAscii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ans = findMaxAsciChar(str);

        System.out.println(ans);

        sc.close();
    }

    public static char findMaxAsciChar(String str) {
        char ans = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch > ans)
                ans = ch;
        }

        return ans;
    }
}