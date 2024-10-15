/*
    * Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
    * Here's a sample input and output:

    * Input: I enjoy eating spaghetti and meatballs for dinner
    * Output: 2

    * Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.*;

public class Consecutive2Vowels {

    public static int solve(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u')
                    &&
                    (input.charAt(i + 1) == 'a'
                            || input.charAt(i + 1) == 'e'
                            || input.charAt(i + 1) == 'i'
                            || input.charAt(i + 1) == 'o'
                            || input.charAt(i + 1) == 'u')) {
                count++;
            }
        }

        return count;
    }

    public static int solve2(String input) {
        int count = 0;

        // All the words are seperated;
        String words[] = input.split(" ");

        // Travering through all the words
        for (int i = 0; i < words.length; i++) {
            // Traversing through all the characters of a single word
            for (int j = 0; j < words[i].length() - 1; j++) {
                if ((words[i].charAt(j) == 'a'
                        || words[i].charAt(j) == 'e'
                        || words[i].charAt(j) == 'i'
                        || words[i].charAt(j) == 'o'
                        || words[i].charAt(j) == 'u')
                        &&
                        (words[i].charAt(j + 1) == 'a'
                                || words[i].charAt(j + 1) == 'e'
                                || words[i].charAt(j + 1) == 'i'
                                || words[i].charAt(j + 1) == 'o'
                                || words[i].charAt(j + 1) == 'u')) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String input = sc.nextLine();

        int count = solve2(input);

        System.out.println(count);

        sc.close();
    }
}
