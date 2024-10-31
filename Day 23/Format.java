/*
 * Description: Formatting Decimal Values in Java

    In Java, you can format decimal values to a specific number of decimal places using the System.out.format() method. This method allows you to define a format string that specifies how the output should be displayed.

    In the provided code, the decimal value num is formatted to two decimal places using the format specifier %.2f. Here’s a breakdown of the formatting:

    - %: Indicates the start of a format specifier.
    - .2: Specifies that the output should be rounded to two decimal places.
    - f: Denotes that the value is a floating-point number.

    Summary
    Using System.out.format() with appropriate format specifiers is an effective way to control the display of decimal values in Java, allowing for clearer and more precise output tailored to your needs.

 */

import java.util.*;

public class Format {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num = 1.2345789;

        System.out.format("%.2f", num);
        sc.close();
    }
}
