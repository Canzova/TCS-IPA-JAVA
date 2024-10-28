/* Find largest word from a given sentence
 * 
 Input: He is so funny boy
 Output: funny
 */

import java.util.*;
public class LargestWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String largestWord = findLargestWord(input);

        System.out.println(largestWord);

        sc.close();
    }

    public static String findLargestWord(String sentence){
        
        String words [] = sentence.split(" ");
        String ans = words[0];

        for(int i = 1; i < words.length; i++){
            if(words[i].length() > ans.length()) ans = words[i];
        }

        return ans;
    }
}