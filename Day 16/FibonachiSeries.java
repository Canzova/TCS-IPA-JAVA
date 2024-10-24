/*
 *  Problem Statement: Fibonacci Series up to a Given Limit

    Write a program that generates the Fibonacci sequence up to a given limit. The program should prompt the user to input a positive integer limit, and then print the Fibonacci numbers starting from 0, stopping when the next number in the sequence would exceed the specified limit.

    Input Format:
    - A single integer limit where limit >= 0.

    Output Format:
    - A list of Fibonacci numbers, each on a new line, starting from 0 and going up to the highest Fibonacci number less than or equal to the limit.

    Constraints:
    - The input integer limit will be a non-negative integer (0 <= limit <= 10^9).

    Fibonacci Sequence:
    The Fibonacci sequence is defined as:
    - F(0) = 0, F(1) = 1
    - F(n) = F(n-1) + F(n-2) for n >= 2

    Example:

    Example 1:
    Input:  

    50

    Output:  

    0
    1
    1
    2
    3
    5
    8
    13
    21
    34


    Example 2:
    Input:  

    5

    Output:  

    0
    1
    1
    2
    3
    5


    Example 3:
    Input:  

    0

    Output:  

    0


    Explanation:
    - In Example 1, the Fibonacci sequence starts at 0, and the program continues generating Fibonacci numbers up to 34 because the next Fibonacci number (55) exceeds the limit of 50.
    - In Example 2, the sequence is generated up to 5, as the next Fibonacci number would be 8, which exceeds the limit.
    - In Example 3, since the limit is 0, the output contains only the first Fibonacci number, which is 0.

 */

import java.util.*;

public class FibonachiSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();


		ArrayList<Integer> fiboSeries = findFiboSeriesUpToLimit(limit);
		for(int i = 0; i < fiboSeries.size(); i++){
			System.out.println(fiboSeries.get(i));
		}

		sc.close();
	}

	public static ArrayList<Integer> findFiboSeriesUpToLimit(int limit){
		
		int prev = 0;
		int curr = 1;
		
		ArrayList<Integer>ans = new ArrayList<>();

		ans.add(0);
		if(limit == 0) return ans;

		ans.add(1);
		if(limit == 1) return ans;


		while(prev + curr <= limit){

			int next = prev + curr;
			ans.add(next);

			prev = curr;
			curr = next;
		}

		return ans;

	}

}