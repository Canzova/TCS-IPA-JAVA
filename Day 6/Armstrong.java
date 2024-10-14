/*
    * Write a Java program to check if a given number is an Armstrong number or not.

    * Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.

    * Here's an example of the expected input and output:

    * Input number: 153
    * Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;

public class Armstrong {

    public static boolean checkArmstrong(int num) {

        int cubes = 0;

        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            temp = temp / 10;

            cubes += digit * digit * digit;
        }

        // System.out.println(cubes);

        return cubes == num ? true : false;
    }

    public static boolean checkArmstrongString(String num2) {

        int cubes = 0;

        int num = Integer.parseInt(num2);

        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            temp = temp / 10;

            cubes += digit * digit * digit;
        }

        // System.out.println(cubes);

        return cubes == num ? true : false;

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean ans = checkArmstrong(num);

        if (ans) {
        System.out.println("Yes, the number is an Armstrong number.");
        } else {
        System.out.println("No, the number is not an Armstrong number.");
        }

        // String num2 = sc.nextLine();
        // boolean ans2 = checkArmstrongString(num2);

        // if (ans2) {
        //     System.out.println("Yes, the number is an Armstrong number.");
        // } else {
        //     System.out.println("No, the number is not an Armstrong number.");
        // }

        sc.close();
    }
}