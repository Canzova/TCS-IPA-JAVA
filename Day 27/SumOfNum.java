/*
 * Question Statement:

    Write a Java program that reads a string containing alphanumeric characters and calculates the sum of all numbers found in the string. The program should identify contiguous digit sequences as whole numbers and add them to the sum.

    Detailed Requirements:
    - The input will be a single line string that may contain letters, digits, and special characters.
    - The program should extract all the numeric sequences (consecutive digits) within the string and calculate their sum.
    - If there are no numeric sequences in the string, the sum should be 0.
    - The program should handle multi-digit numbers correctly (e.g., "abc123de45" should result in 123 + 45 = 168).

    Example Inputs and Outputs:
    - Input 1: "abc123xyz456"
    - Output 1: 579 (Explanation: 123 + 456)
    - Input 2: "a1b2c3"
    - Output 2: 6 (Explanation: 1 + 2 + 3)
    - Input 3: "hello"
    - Output 3: 0 (Explanation: No numbers found)
    - Input 4: "42isTheAnswer"
    - Output 4: 42

    Constraints:
    - The input string can have a length of up to 1000 characters.
    - The numbers in the string will not be negative.

    Code Explanation:
    The provided findSumOfNums method scans the input string character by character, checking if each character is a digit. When a digit is found, it extracts the entire contiguous numeric sequence and adds its value to the cumulative sum. Non-digit characters are skipped.

 */
import java.util.*;

public class SumOfNum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = findSumOfNums(str);
        System.out.println(ans);
        sc.close();
    }

    public static int findSumOfNums(String str) {
        int sum = 0;
        int i = 0, n = str.length();
        while (i < n) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < n && Character.isDigit(str.charAt(i))) {
                    char temp = str.charAt(i);

                    num = num * 10 + Integer.parseInt(Character.toString(temp)); 
                    i++;
                }
                sum += num;
            } else {
                // Not a digit
                i++;
            }
        }

        return sum;
    }
}
