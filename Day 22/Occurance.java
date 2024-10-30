/*
 * Question:

    Write a Java program that reads a string from the user and counts the occurrence of each character in the string (excluding spaces). Implement a method findOccurrenceOfEachChar(String str) that takes the input string and prints each character with its frequency in the format: character frequency. 

    - Input: A single line string containing letters, numbers, or symbols.
    - Output: Each character (except spaces) followed by its occurrence count in the string.

    For example:
    - Input: "Hello World"
    - Output:  
    
    H 1  
    e 1  
    l 3  
    o 2  
    W 1  
    r 1  
    d 1  
    

    Use a HashMap to store the character counts and traverse the map to display each character and its frequency.

 */

import java.util.*;

public class Occurance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        findOccuranceOfEachChar(str);

        sc.close();
    }

    public static void findOccuranceOfEachChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Traverse into map

        for (Map.Entry<Character, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

    }
}
