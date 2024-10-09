import java.util.*;

class Strings {
    public static void main(String[] args) {
        // Always remeber strings are immutable in java

        Scanner sc = new Scanner(System.in);

        // How to define a String
        String name = "Nihal Singh";

        // Another way
        String name2 = new String("Kunal Singh");

        System.out.println(name);
        System.out.println(name2);

        // How to take string as an input
        System.out.println("Enter your name : ");

        String input = sc.nextLine();

        System.out.println(input);

        /*
         * We write sc.close() in Java to close the Scanner object when we are done
         * using it. This frees up system resources, like memory, that the Scanner was
         * using to read input.
         * 
         * In simple terms: it helps avoid wasting memory after you're done with input.
         */
        sc.close();

    }
}