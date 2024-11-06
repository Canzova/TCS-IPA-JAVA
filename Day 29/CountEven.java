
/* Count number of even digit in a number
   If the count greater than or equal to 3, then print "True" otherwise "False"
*/

import java.util.*;

public class CountEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean check = countEven(num);

        if(check == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        sc.close();
    }

    public static boolean countEven(int num){
        int count = 0;

        while(num != 0){
            int digit = num%10;

            if(digit % 2 == 0) count++;

            num = num/10;
        }

        return count >= 3;
    }

}