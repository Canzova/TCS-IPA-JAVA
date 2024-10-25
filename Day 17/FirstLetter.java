/*
 * Question Statement:

	Write a Java program that takes a sentence as input and returns a string containing the first letter of each word in the sentence. The program should handle multiple words separated by spaces and should return the concatenated result of the first letters in the order they appear.

	Input Format:
	- A single line containing a sentence with multiple words, separated by spaces.

	Output Format:
	- A single string containing the first letter of each word.

	Example:

	plaintext
	Input:
	Hello World from Java

	Output:
	HWFJ


	Explanation:
	- In the sentence "Hello World from Java," the first letters of each word are 'H', 'W', 'F', and 'J'.

 */

import java.util.*;

public class FirstLetter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String ans = findFirstLetterOfEachWord(input);

		System.out.println(ans);

		sc.close();
	}

	public static String findFirstLetterOfEachWord(String input) {

		// Approach 1 :

		// String words [] = input.split(" ");

		// String ans = "";

		// for(int i = 0; i < words.length; i++){
		// ans += words[i].charAt(0);
		// }

		// Approach 2;

		String ans = "";
		int n = input.length();

		ans += input.charAt(0);

		for (int i = 1; i < n; i++) {
			char ch = input.charAt(i);

			if (ch != ' ' && input.charAt(i - 1) == ' ')
				ans += ch;

		}

		return ans;

	}
}