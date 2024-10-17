/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/


import java.util.*;
public class CountWords {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = countNoOfWords(input);

        System.out.println(count);;


        sc.close();
    }

    public static int countNoOfWords(String sentence){
        int count = 0;

        String words [] = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > 0) count++;
        }


        return count;
    }

}