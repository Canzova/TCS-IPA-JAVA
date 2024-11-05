/*
    * Question: Remove Duplicate Characters and Preserve Order

    Write a Java program that takes a string as input and removes all duplicate characters, preserving the order of their first occurrence. The program should then output the modified string, containing only unique characters in their original order.

    Requirements

    1. Input:
    - The program should prompt the user to enter a string str (can contain alphabets, numbers, or special characters).
    
    2. Output:
    - The program should print the modified string, where each character appears only once in the order it was first encountered.

    3. Constraints:
    - The solution should be efficient and should maintain the insertion order of characters.
    - Assume that the input string has a maximum length of 10,000 characters.

    4. Example:

    Input:  
    programming
    
    
    Output:  
    progamin
    

    Explanation: The characters 'r', 'o', 'g', 'a', 'm', 'i', and 'n' appear only once, and only their first occurrences are included in the output.

    Implementation Details

    1. Use a LinkedHashSet to store unique characters from the input string while preserving their order of appearance.
    2. Use a StringBuilder to build the final string from the characters stored in the LinkedHashSet.

*/

import java.util.*;

public class UniqueChars {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = findUniqueChars(str);

        System.out.println(ans);
        sc.close();
    }

    // using linked hash set
    public static String findUniqueChars(String str) {
        StringBuilder ans = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        for (Character ch : set) {
            ans.append(ch);
        }

        return ans.toString();
    }

}
