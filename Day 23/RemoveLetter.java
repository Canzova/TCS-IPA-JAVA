/*
 * Question:

    Write a Java program that removes all occurrences of a specific character from a given string. The program should prompt the user to input a string and a character, then display the string with all instances of the specified character removed.

    The program should:

    1. Take a string input from the user.
    2. Take a character input from the user.
    3. Remove all occurrences of the specified character from the string.
    4. Output the modified string.

    Example:

    Input:
    hello world
    l

    Output:
    heo word


    Input:
    java programming
    a

    Output:
    jv progrmming


    Note:
    - The program should remove all occurrences of the specified character, not just the first occurrence.
    - You may assume the input string contains only lowercase and uppercase letters.

 */

import java.util.*;

public class RemoveLetter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ch = sc.nextLine().charAt(0);

        String ans = str.replace(Character.toString(ch), "");

        System.out.println(ans);

        sc.close();
    }
}
