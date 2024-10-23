/*
 * Problem Statement: Count Vowels, Consonants, and Digits in a String

	Write a program that takes a string input from the user and counts the number of vowels, consonants, and digits in the string.

	Definitions:
	- Vowels: The characters 'A', 'E', 'I', 'O', 'U' (both uppercase and lowercase).
	- Consonants: Any alphabetic character that is not a vowel (both uppercase and lowercase).
	- Digits: Any numeric characters from '0' to '9'.

	The program should output three values:
	1. The count of vowels.
	2. The count of consonants.
	3. The count of digits.

	Input:
	- The input will be a single string containing alphanumeric characters and possibly spaces.

	Output:
	- The output will be three integers printed in separate lines:
	1. The number of vowels in the string.
	2. The number of consonants in the string.
	3. The number of digits in the string.

	Example:

	Example 1:
	Input:

	Hello World 123


	Output:

	3
	7
	3


	Explanation:
	- Vowels: 'e', 'o', 'o' (count = 3).
	- Consonants: 'H', 'l', 'l', 'W', 'r', 'l', 'd' (count = 7).
	- Digits: '1', '2', '3' (count = 3).

	Example 2:
	Input:

	Programming123


	Output:

	3
	8
	3


	Explanation:
	- Vowels: 'o', 'a', 'i' (count = 3).
	- Consonants: 'P', 'r', 'g', 'r', 'm', 'm', 'n', 'g' (count = 8).
	- Digits: '1', '2', '3' (count = 3).

	Approach:
	1. Traverse each character of the string.
	2. Check if the character is a vowel, consonant, or digit.
	3. Count the occurrences of vowels, consonants, and digits.
	4. Print the counts in separate lines.

	This question requires basic string manipulation and character classification logic.

 */
import java.util.*;

public class countVowels {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int count[] = countOfVowelsConsonentsDigits(input);

		for (int i = 0; i < count.length; i++) {

			System.out.println(count[i]);
		}

		sc.close();

	}

	public static int[] countOfVowelsConsonentsDigits(String input) {

		int countVowels = 0;
		int countConsonents = 0;
		int countDigits = 0;

		char vowels[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			// If it is a digit
			if (ch >= '0' && ch <= '9')
				countDigits++;

			// If it is an Uppercase Char or Lowercase character

			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

				// Check vowel
				boolean found = false;
				for (int j = 0; j < vowels.length; j++) {
					if (ch == vowels[j]) {

						found = true;
						break;

					}
				}

				if (found == true)
					countVowels++;
				else
					countConsonents++;

			}

		}

		int ans[] = { countVowels, countConsonents, countDigits };
		return ans;

	}

}