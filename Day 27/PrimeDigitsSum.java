/* Count the sum of prime digits in a given number
 * 
 * Input: 2345678910
 * Output: 17
 * 
 * Explaination: 2+3+5+7 = 17
 */

import java.util.*;
public class PrimeDigitsSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        int sum = findSumOfPrimeDigits(num);

        System.out.println(sum);

        sc.close();
    }

    public static int findSumOfPrimeDigits(long num){
        int sum = 0;

        // Step 1 : get the digits
        while(num != 0){
            long digit = num % 10;
            if(isPrime(digit) == true) sum += digit;
            num = num/10;
        }

        return sum;
    }

    public static boolean isPrime(long num){
        if(num <= 1) return false;
       // if(num == 2) return true;

        for(long i = 2; i*i <= num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
 