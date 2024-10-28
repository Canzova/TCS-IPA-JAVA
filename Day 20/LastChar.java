/* Last Character of each word of a sentence

 * Input: Kalyani Government Engineering College
 * Output: itge
 */

import java.util.*;

public class LastChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String lastChars = findLastChars(sentence);

        System.out.println(lastChars);
        sc.close();
    }

    public static String findLastChars(String sentence) {
        String words[] = sentence.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            ans += word.charAt(word.length() - 1);
        }

        return ans;
    }
}