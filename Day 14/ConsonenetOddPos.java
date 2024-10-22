/*
 * Question Statement:

    Write a Java program that reads a string input from the user and prints all the consonants that are located at odd positions (1-based index) in the string, ignoring spaces. A consonant is defined as any letter that is not a vowel (A, E, I, O, U) and is not case-sensitive.

    Requirements:
    - The program should:
    - Accept a string that may contain letters (both uppercase and lowercase), spaces, and other characters.
    - Ignore spaces while determining the odd positions of characters.
    - Print only the consonants that appear at odd positions along with their original position in the string (1-based index).

    Example Test Cases:

    1. Input:
    
    Hello World
    

    Output:
    
    H 1
    l 3
    W 8
    

    Explanation:
    - Odd positions (ignoring spaces): 
        - Position 1: H
        - Position 3: l
        - Position 5: (ignored because it's a space)
        - Position 7: W
        - Position 9: (ignored because it's a space)

    2. Input:
    
    Programming
    

    Output:
    
    P 1
    g 3
    r 5
    m 7
    

    Explanation:
    - Odd positions: 
        - Position 1: P
        - Position 3: g
        - Position 5: r
        - Position 7: m

    3. Input:
    
    This is a test
    

    Output:
    
    T 1
    s 3
    t 5
    

    Explanation:
    - Odd positions: 
        - Position 1: T
        - Position 3: s
        - Position 5: t

    Additional Notes:
    - Ensure that the program handles mixed cases (uppercase and lowercase) properly.
    - Spaces should not affect the counting of odd positions. 

    This question challenges the understanding of string manipulation, indexing, and control flow in Java while also requiring attention to character classification.

 */

import java.util.*;

public class ConsonenetOddPos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        printConsonentsAtOddPositions(input);
        sc.close();
    }

    public static void printConsonentsAtOddPositions(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') continue;
            count++;

            if ((count % 2) != 0 &&
                    input.charAt(i) != 'a' &&
                    input.charAt(i) != 'A' &&
                    input.charAt(i) != 'e' &&
                    input.charAt(i) != 'E' &&
                    input.charAt(i) != 'i' &&
                    input.charAt(i) != 'I' &&
                    input.charAt(i) != 'o' &&
                    input.charAt(i) != 'O' &&
                    input.charAt(i) != 'u' &&
                    input.charAt(i) != 'U') {
                System.out.println(input.charAt(i) + " " + (i + 1));
            }
        }
    }
}
