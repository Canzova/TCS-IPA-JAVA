/*
 * Question Statement:

    Write a Java program to find the first non-repeated character in a given string. If all characters in the string are repeated, the program should indicate this with a specific message. 

    Input:
    - The program should take a single line of input, which is a string consisting of only lowercase or uppercase letters.

    Output:
    - Print the first character in the string that does not repeat.
    - If all characters are repeated, print: "All characters are repeated."

    Example:
    Example 1:
    - Input: swiss
    - Output: w  
    Explanation: Here, w is the first character that appears only once in the string.

    Example 2:
    - Input: aabbcc
    - Output: All characters are repeated  
    Explanation: All characters in the string are repeated, so the program outputs the specified message.

    Constraints:
    - The solution should consider both time and space efficiency.
    - Assume the input string will contain only alphabetic characters (a-z, A-Z) and will not be empty.

    Additional Notes:
    - The code uses a HashMap to store the frequency of each character and then iterates through the string to find the first character with a frequency of 1.
    - A brute-force solution is also included in comments to compare the performance.

 */


import java.util.*;

public class FirstNonRepeatedChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char ans = findFirstNonRepeatedChar(input);

        if (ans == '$') {

            System.out.println("All characters are repeated;");
        } else {

            System.out.println(ans);
        }

        sc.close();

    }

    public static char findFirstNonRepeatedChar(String input) {

        HashMap<Character, Integer> mp = new HashMap<>();
        char ans = '$';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (mp.get(input.charAt(i)) == 1) {
                ans = input.charAt(i);
                break;
            }
        }

        return ans;
    }



    // Bruteforce
    // public static char findFirstNonRepeatedChar(String input){

    //     char ans = '$';
    //     int n = input.length();

    //     for(int i = 0; i < n; i++){
    //         boolean found = false;
    //         char ch1 = input.charAt(i);
    //         for(int j = i + 1; j < n; j++){

    //             char ch2 = input.charAt(j);

    //             if(ch1 == ch2){
    //                 found = true;
    //                 break;
    //             }

    //         }
    //         if(found == false){
    //             ans = ch1;
    //             break;
    //         }
    //     }


    //     return ans;
    // }
}