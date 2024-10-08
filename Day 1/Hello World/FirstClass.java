import java.util.*;

class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // How to print in java ---> 3 ways

        /*
         * System is a class and print and println are 2 methonds inside that class
         * print means next print statement will print in same line
         * println means next print statement will peint in next line
         * "\n" also means next print statement will peint in next line
         */

        System.out.println("Hii");
        System.out.print("Hello");
        System.out.println("Hello2\n");

        // How to take input in java

        /*
         * Import java.util.*; ---> Which is a pcakge
         * Make a object of Scanner class and pass System.in as an argument
         * Store that input in a var with help of same object --> String name =
         * sc.next();
         * 
         * We have different methonds in Scanner classs, some of them are:
         * 
         * .next() ---> Used for a single word
         * .nextLine() ---> Used for a string with different words
         * .nextInt() ---> Used to store int
         * .nextDouble() ---> Used to store double
         * 
         * 
         * You also have to close the Scanner object ---> sc.close();
         */

        Scanner sc = new Scanner(System.in);

        // String name = sc.next();

        // System.out.println(name);

        // Take 2 numbers and show there multiplication
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = a * b;
        System.out.println(mul);

        sc.close();

    }
}