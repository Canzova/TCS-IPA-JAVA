/*
 * Problem Statement: Maximum Prime Diagonal Element in a Matrix


    Input Format

    1. An integer \( n \) representing the number of rows in the matrix.
    2. An integer \( m \) representing the number of columns in the matrix.
    3. \( n \times m \) integers representing th

            Format

    - If a prime number exists on either diagonal, print:  
    Max Diagonal Prime Element is : <element>
    
    - If no prime numbers are found on the diagonals, print:  
    No Diagonal Prime is present


            leq n, m \leq 100 \)
    - Matrix elements can be any integer value.
    
    Example
    
    Input:

    Enter length size : 3
    Enter width size : 4
    Enter elements into matrix
    1  2  3  4  
    5  6  7  8
    9 10 11 12


    Output:

    Max Diagon al Prime Element is : 11
                
    

    Explanation

    - In the provided matrix:
    - Primary Diagonal Elements: 1, 6, 12 (indices [0,0], [1,1], [2,2])
    - Secondary Diagonal Elements: 4, 6, 9 ( indices [0,3], [1,2], [2,1])
    - The prime numbers on the diagonals are 2, 3, 5, 7, 11. The maximum prime number found is 11.

    Notes 
                

    - Ensure yo ur program co r rectly identif ies both diagonals regardless of the matrix's dimensions.
    - Implement a  function to ch
                    ck for prime numbers efficiently.

 */


import java.util.*;

public class MaxPrimeDiaMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length size : ");
        int n = sc.nextInt();
        System.out.print("Enter width size : ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        int maxDiagonalPrime = Integer.MIN_VALUE;


        System.out.println("Enter elements into matrix");

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){
                int ele = sc.nextInt();

                matrix[i][j] = ele;

                // Diagonal Element and also prime
                if((i == j || i + j == n - 1) && isPrime(ele)){
                    maxDiagonalPrime = Math.max(maxDiagonalPrime, ele);
                }
            }

        }

        if(maxDiagonalPrime != Integer.MIN_VALUE) System.out.println("Max Diagonal Prime Element is : " + maxDiagonalPrime);
        else{
            System.out.println("No Diagonal Prime is present");
        }
        sc.close();
    }

    public static boolean isPrime(int num){

        // If num = 0 or num = 1 returan falsee
        if(num <= 1) return false;

        for(int i = 2; i*i <= num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
