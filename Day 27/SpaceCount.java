/* Count number of spaces and characters in a string 
 * Input
 * ---------
 * Arijit is bad boy
 * 
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/

import java.util.*;

public class SpaceCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans[] = countSpaceAndChars(str);

        System.out.println("Number of space : " + ans[0]);
        System.out.println("Number of characters : " + ans[1]);

        sc.close();
    }

    public static int [] countSpaceAndChars(String str){
        int ans [] = new int[2];
        int space = 0;
        int chars = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isWhitespace(ch)) space++;
            else{
                chars++;
            }
        }

        ans[0] = space;
        ans[1] = chars;
        return ans;
    }
}