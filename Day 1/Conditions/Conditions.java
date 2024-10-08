import java.util.*;

class Conditions {
    public static void main(String[] args) {
        // If else

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("Equal");
        // } else if (a > b) {
        // System.out.println(a + " is graeter than " + b);
        // } else {
        // System.out.println(b + " is greater than " + a);
        // }

        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Enter a number 1, 2 or 3");
                break;
        }

        sc.close();
    }
}