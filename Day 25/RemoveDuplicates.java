/*
 * Question Statement:

    Title: Remove Duplicates from a String

    Problem Description:
    Write a Java program that reads a string input from the user and returns a new string with all duplicate characters removed, while maintaining the order of their first appearance. The program should ignore characters that have already appeared and only keep the first occurrence of each character.

    Input:
    - A single line of input containing a string str of length (1 <= |str| <= 10^5). The string can include letters, digits, and special characters.

    Output:
    - A single line output that is the modified string after removing all duplicate characters, keeping only the first occurrence of each.

    Example:

    Input 1:
    programming

    Output 1:
    progamin


    Input 2:
    hello world

    Output 2:
    helo wrd


    Explanation:
    - In Input 1, the characters 'r' and 'g' appear multiple times in "programming", so only their first occurrences are retained in "progamin".
    - In Input 2, the characters 'l' and 'o' appear more than once in "hello world", so only the first appearances are retained in "helo wrd".

    Constraints:
    - The program should efficiently handle strings up to \(10^5\) characters in length.

 */

import java.util.*;

public class RemoveDuplicates{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = removeDuplicatesChars(str);

        System.out.println(ans);

        sc.close();
    }

    public static String removeDuplicatesChars(String str){
        String ans = "";
        HashMap<Character, Integer>map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) == 1) ans += ch;
        }
        return ans;

    }

}