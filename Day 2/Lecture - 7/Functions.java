import java.util.*;

public class Functions {

    public static void printName(String name)
    {
        System.out.println(name);
    }

    public static int sumofTwo(int a, int b)
    {
        return a+b;
    }
    public static int productofTwo(int a, int b)
    {
        return a*b;
    }

    public static int findFactorial(int a)
    {
        int fact = 1;
        for(int i = a; i > 0; i--)
        {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // String name = sc.nextLine();

        // printName(name);

        System.out.print("Enter a numbers : ");

        int a = sc.nextInt();
        //int b = sc.nextInt();

        //System.out.println("Sum of Two numbers are : " + sumofTwo(a, b));
        //System.out.println("Sum of Two numbers are : " + productofTwo(a, b));



        int fact = findFactorial(a);

        System.out.println("Factorial of " + a + " is : " + fact);

        sc.close();

    }
}
