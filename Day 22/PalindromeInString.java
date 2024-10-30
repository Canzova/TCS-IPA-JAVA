/*
 * Question:

    Write a Java program that reads a sentence from the user, identifies each word in the sentence, and checks if it is a palindrome. Implement a method `findPalindromeInString(String str)` that prints all the palindrome words in the sentence, followed by the count of palindrome words found. If no palindromic words are present, output `"No palindrome present"`.

    A word is considered a palindrome if it reads the same forwards and backwards.

    - **Input:** A single line containing a sentence with words separated by spaces.
    - **Output:** Each palindrome word in the sentence, followed by the total count of palindromic words. If no palindromes are found, output `"No palindrome present"`.

    For example:
    - **Input:** `"madam level deed noon"`
    - **Output:**  
    ```
    madam  
    level  
    deed  
    noon  
    4  
    ```

    Use a helper method `isPalindrome(String word)` to check if each word is a palindrome.
 */


import java.util.*;

public class PalindromeInString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        findPalindromeInString(input);

        sc.close();
    }

    public static void findPalindromeInString(String str){
        String words[] = str.split(" ");
        int count = 0;

        for(int i = 0; i < words.length; i++){
            String word = words[i];

            if(isPalindrome(word)){
                System.out.println(word);
                count++;
            }
        }

        if(count != 0)System.out.println(count);
        else{
            System.out.println("No palindrome present");
        }

    }

    public static boolean isPalindrome(String word){
        int i = 0;
        int n = word.length();
        int j = n- 1;

        while(i <= j){
            if(word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}