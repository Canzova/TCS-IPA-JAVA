/*
 * Problem Statement:
    You are given a string input that contains a mix of letters, numbers, and special characters. Your task is to:

    1. Split the string into an array of contiguous segments containing either alphabetic characters, numbers, or special characters.
    2. Concatenate all segments together into one final string.
    3. Calculate the sum of the positions (1-based index) in the array where segments consist entirely of numbers.
    4. Multiply the concatenated string by the sum obtained in step 3, effectively repeating the string that many times.

    Detailed Breakdown:
    - Input: A string such as "Hello@123World456"
    - Process:
    1. Split the string into segments:
        - The input string can be split into an array of substrings: ["Hello", "@", "123", "World", "456"]
    2. Identify segments that are purely numeric:
        - In the example array, "123" and "456" are numeric segments.
    3. Calculate the sum of the 1-based positions where the numeric segments appear:
        - "123" is at position 3, and "456" is at position 5, so the sum is 3 + 5 = 8.
    4. Concatenate all segments to form one string:
        - The result is "Hello@123World456".
    5. Multiply (repeat) this concatenated string by the sum from step 3:
        - The final result will be "Hello@123World456" repeated 8 times.

    Example Calculation:
    - Concatenated String: "Hello@123World456"
    - Sum of Positions of Numeric Segments: 3 + 5 = 8
    - Final Output:
    
    "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456"
    

    Explanation of the Output:
    The string "Hello@123World456" is repeated 8 times because the sum of the positions of the numeric segments is 8.

    Constraints:
    - The input string can be of variable length and contain any combination of alphabetic characters, digits, and special characters.
    - The problem requires handling of mixed character types and indexing based on a 1-based index system.

 */

import java.util.*;

public class RepeatString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = findAns(str);

        System.out.println(ans);

        sc.close();
    }

    public static String findAns(String str) {
        String ans = "$";
        ArrayList<String> words = new ArrayList<>();
        int i = 0;
        int n = str.length();

        while (i < n) {
            String temp = "";

            if ( Character.isLetter(str.charAt(i))) {
                while (i < n && Character.isLetter(str.charAt(i))) {
                    temp += str.charAt(i);
                    i++;
                }
            } else if ( Character.isDigit(str.charAt(i))) {
                while (i < n && Character.isDigit(str.charAt(i))) {
                    temp += str.charAt(i);
                    i++;
                }
            } else {
                // Special Character
                while (i < n && !Character.isLetterOrDigit(str.charAt(i))) {
                    temp += str.charAt(i);
                    i++;
                }
            }

            words.add(temp);
        }

        int count = 0;
        for(int j = 0; j < words.size(); j++){
            String st = words.get(j);
            //System.out.println(st);
            if(Character.isDigit(st.charAt(0))) count += j+1;
        }

        System.out.println(count);

        for(int k = 0; k < count; k++){
            ans += str;
        }
        return ans;
    }

    
}
