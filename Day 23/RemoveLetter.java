import java.util.*;
public class RemoveLetter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ch = sc.nextLine().charAt(0);

        String ans = str.replace(Character.toString(ch),"");

        System.out.println(ans);

        sc.close();
    }
}
