import java.util.*;

public class BitManipulation {

    public static void getBit(int n, int p) {
        int bitMask = 1 << p - 1;

        if ((bitMask & n) == 0) {
            System.out.println(p + "th bit was zero in " + n);
        } else {
            System.out.println(p + "th bit was one in " + n);
        }

        System.out.println();
    }

    public static void setBit(int n, int p) {
        int bitMask = 1 << p - 1;

        int newNum = n | bitMask;

        System.out.println("After doing setBit operation at " + p +
                " position on " + n + " answer is : " + newNum);

        System.out.println();
    }

    public static void clearBit(int n, int p) {
        int BitMask = 1 << p - 1;

        // Not operation done
        BitMask = ~(BitMask);

        int ans = BitMask & n;

        System.out.println("After clearing the " + p + "th bit of " + n +
                " the output is : " + ans);

        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        System.out.println();

        System.out.print("Enter Position : ");
        int p = sc.nextInt();
        System.out.println();

        getBit(n, p);
        setBit(n, p);
        clearBit(n, p);

        System.out.println("Update Bit : ");
        System.out.println("Enter you want to set the bit or unset : ");
        int updateBit = sc.nextInt();

        if (updateBit == 1)
            setBit(n, p);
        else
            clearBit(n, p);

        sc.close();
    }
}
