import java.util.*;
public class ReverseString {


    public static void printReverse(StringBuilder sb)
    {
        int i = 0;
        int j = sb.length() - 1;

        while(i < j)
        {
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(j);


            sb.setCharAt(i, backChar);
            sb.setCharAt(j, frontChar);

            i++;
            j--;
        }


        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String str = sc.nextLine();


        StringBuilder sb = new StringBuilder(str);

        printReverse(sb);



        sc.close();
    }
}
