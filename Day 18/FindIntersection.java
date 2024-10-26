/*
 * Problem Statement: Finding the Intersection of Two Sets

    Background: In set theory, the intersection of two sets refers to the elements that are common to both sets. In programming, efficiently finding the intersection of sets is a common task that can help in various applications, such as data analysis, filtering, and searching.

    Objective: Write a Java program that accepts two sets of integers from the user and prints the intersection of these sets. The program should utilize the HashSet data structure to store the elements and find the common integers efficiently.

    Specifications:
    1. The program should prompt the user to enter four integer values for the first set (set 1).
    2. The program should then prompt the user to enter five integer values for the second set (set 2).
    3. The program should store the integer values in HashSet collections to avoid duplicates.
    4. After both sets have been populated, the program should compute and display the intersection of the two sets:
    - If there are common integers, print each common integer on a new line.
    - If there are no common integers, print a message indicating that there are no common elements.

    Input Format:
    - The first input should contain four integers for set 1.
    - The second input should contain five integers for set 2.

    Output Format:
    - Print the common integers if they exist.
    - Print "No common elements found." if there are no common integers.

    Example Input/Output:

    Input:

    Enter value for set 1 ---> 4 Integer values
    1
    2
    3
    4
    Enter value for set 2 ---> 5 Integer values
    3
    4
    5
    6


    Output:

    Intersection of sets:
    3
    4


    Constraints:
    - Each set should only contain unique integer values.
    - The program should handle user input gracefully, ensuring that only valid integers are accepted.

    Requirements:
    - Implement the solution in Java, utilizing HashSet for storage and intersection computation.
    - Ensure the program is user-friendly with clear prompts and outputs.

 */


import java.util.*;

public class FindIntersection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        System.out.println("Enter value for set 1 ---> 4 Integer values");
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            s1.add(num);
        }

        System.out.println("Enter value for set 2 ---> 5 Integer values");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            s2.add(num);
        }

        findIntersectionArray(s1, s2);

        sc.close();

    }

    public static void findIntersectionArray(HashSet<Integer> s1, HashSet<Integer> s2) {

        // Iterator<Integer> it = s1.iterator();
        //
        // while(it.hasNext()){
        // int num = it.next();
        // if(s2.contains(num)) System.out.println(num);
        // }

        System.out.println("Printing answer");
        s1.retainAll(s2);
        Iterator<Integer> it = s1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
