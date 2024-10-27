/*
 * Question Statement:


	1. First, prompt the user to enter the total number of integers they want to input.
	2. For each integer, ask the user to enter the value, storing each one in an array.
	3. As you input each integer, update the smallest and largest values encountered so far.
	4. Finally, display the smallest and largest integers from the list.

	Example:

	Enter the number of integers: 5

	Enter integer 1: 8
	Enter integer 2: 3
	Enter integer 3: 15
	Enter integer 4: 1
	Enter integer 5: 10

	Smallest integer: 1
	Largest integer: 15


	This program uses Integer.MAX_VALUE and Integer.MIN_VALUE to initialize the smallest and largest values, ensuring they are correctly updated with each input.

 */


import java.util.*;

public class Small_Large {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of integers : ");
		int size = sc.nextInt();
		// System.out.print("\n");

		int mini = Integer.MAX_VALUE;
		int maxi = Integer.MIN_VALUE;

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter integer " + (i + 1) + " : ");
			int num = sc.nextInt();
			arr[i] = num;
			mini = Math.min(mini, num);
			maxi = Math.max(maxi, num);
			// System.out.print("\n");
		}

		System.out.println("Smallest integer : " + mini);
		System.out.println("Largest integer : " + maxi);

		sc.close();
	}
}