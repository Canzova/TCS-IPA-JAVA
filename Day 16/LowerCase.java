/*
 * Problem Statement: Extract Lowercase Characters from a String

	Write a program that takes a string as input and extracts all the lowercase alphabetic characters from it. The program should return a new string that contains only the lowercase characters in the order they appeared in the original string.

	Input Format:
	- A single line containing a string input which can consist of alphanumeric characters, spaces, and special symbols.

	Output Format:
	- A single line containing a string lower, which is a concatenation of all lowercase letters found in the input string.

	Constraints:
	- The input string can have a maximum length of 1000 characters.
	- The string may contain uppercase letters, numbers, special characters, and spaces, but only lowercase letters should be considered for the output.

	Example:

	Example 1:
	Input:  

	Hello World 123!

	Output:  

	elloorld


	Example 2:
	Input:  

	JAVArulesTheWorld2024!!

	Output:  

	rulesheorld


	Example 3:
	Input:  

	1234567890

	Output:  



	Explanation:
	- In Example 1, the input string "Hello World 123!" contains the lowercase letters 'e', 'l', 'l', 'o', 'o', 'r', 'l', 'd' which are returned in the output as "elloorld".
	- In Example 2, the lowercase letters 'r', 'u', 'l', 'e', 's', 'h', 'e', 'o', 'r', 'l', 'd' are extracted from the string and concatenated into "rulesheorld".
	- In Example 3, since there are no lowercase letters in the input string, the output is an empty string.

 */

import java.util.*;

public class LowerCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String lower = findLowercaseCharacters(input);
		System.out.println(lower);
		sc.close();
	}

	public static String findLowercaseCharacters(String input) {
		String ans = "";

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (Character.isLowerCase(ch))
				ans += ch;
			// if(ch >= 'a' && ch <= 'z') ans += ch;
		}

		return ans;
	}
}