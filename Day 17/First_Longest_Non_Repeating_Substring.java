/*
 * Question Statement

    The task is to find the longest substring from the beginning of a given string where each character appears only once. In other words, you need to identify the first part of the string that contains only unique characters without any repetition. Once you encounter a repeating character, stop and return the substring formed so far.

    Example:

    For the input string Arijit:

    - Start from the beginning of the string and examine each character.
    - The substring Ari contains only unique characters.
    - The next character, j, is also unique.
    - When you reach the second i, it repeats a character that already appeared in the substring.
    - At this point, stop and return the substring up to but not including the repeated character.

    Result:
    - The longest substring with unique characters from the start of Arijit is Arij.

    Input Format:
    - A single string containing letters (e.g., Arijit).

    Output Format:
    - A substring with only the first non-repeated characters from the start of the input string.

    Example:

    plaintext
    Input:
    Arijit

    Output:
    Arij

 */

import java.util.*;

public class First_Longest_Non_Repeating_Substring {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // String ans = solve(input);

        String ans = OptimizeApproach(input);

        System.out.println(ans);

        sc.close();

    }

    public static String solve(String input) {
        int n = input.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            String tempAns = "";
            for (int j = i; j < n; j++) {

                char ch = input.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) > 1) {
                    break;
                }

                tempAns += ch;
            }
            if (tempAns.length() > ans.length()) {
                ans = tempAns;
            }
        }

        return ans;

    }

    public static String OptimizeApproach(String input) {
        int n = input.length();
        String ans = "";
        int l = 0;
        int r = 0;
        int len = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            char ch = input.charAt(r);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                if (map.containsKey(input.charAt(l))) {
                    map.put(input.charAt(l), map.get(input.charAt(l)) - 1);
                    if (map.get(input.charAt(l)) == 0) {
                        map.remove(input.charAt(l));
                    }
                }
                l++;
            }

            if (map.get(ch) == 1) {
                len = Math.max(len, r - l + 1);
                if (len > ans.length()) {
                    ans = input.substring(l, r + 1);
                }
            }

            r++;
        }

        return ans;
    }

}
