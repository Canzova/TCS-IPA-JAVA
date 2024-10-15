
/*
    * Problem Statement

    * Write a program that compresses a string of lowercase English letters by replacing consecutive repeated characters with the character followed by the number of its occurrences. If a character appears only once, append `1` after it.

    * Example

    * Input: aabbbcc

    *Output: a2b3c2
 */
import java.util.*;

public class StringCompress {

    // using array
    public static String solve(String input) {
        String ans = "";

        // Iinitailly all the values in int array is 0
        int arr[] = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            arr[ch - 'a']++;

        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int index = ch - 'a';

            ans += ch;
            ans += arr[index];

        }

        return ans;
    }

    // Using hash map and linked hash set
    public static String solveUsingHashMap(String input) {
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();

        // Linked hash set ---> Preserves the input sequence
        Set<Character> linkedSet = new LinkedHashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            /*
             * Use map.put(ch, map.getOrDefault(ch, 0) + 1) to update the character count in
             * the HashMap.
             * 
             * getOrDefault is used to get the current count or return 0 if the character
             * hasn't been encountered yet.
             * 
             * If ch is not in the map, getOrDefault(ch, 0) returns 0 and then increments it
             * o 1.
             * 
             * Use map.get(ch) to retrieve the count of occurrences.
             */
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            linkedSet.add(ch);
        }

        for (char ch : linkedSet) {
            ans += ch;
            ans += map.get(ch);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String input = sc.nextLine();

        String ans = solveUsingHashMap(input);

        System.out.println(ans);

        sc.close();
    }
}