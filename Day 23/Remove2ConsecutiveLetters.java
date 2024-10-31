/*
 * Question:

    Write a Java program that removes all consecutive duplicate letters from a given string, keeping only the first occurrence of each character in the order they appear in the original string. For instance, if the input string contains consecutive occurrences of the same letter, the program should retain only one of these occurrences. 

    The program should:

    1. Take a string input from the user.
    2. Remove all consecutive duplicate letters.
    3. Display the resulting string without consecutive duplicates.

    Example:

    Input:
    aabbccddeeff

    Output:
    abcdef


    Input:
    hello

    Output:
    helo


    Note:
    - The program should preserve the original order of characters in the resulting string.
    - You may assume the input contains only lowercase letters.

 */


import java.util.*;

public class Remove2ConsecutiveLetters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = removeConsecutiveDublicates(str);

        System.out.println(ans);

        sc.close();
    }

    public static String removeConsecutiveDublicates(String str) {
        String ans = "";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++)
            set.add(str.charAt(i));

        // Iterator<Character>it = set.iterator();

        // while(it.hasNext()){
        // ans += it.next();
        // }

        for (Character it : set) {
            ans += it;
        }

        return ans;
    }
}
