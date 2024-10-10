import java.util.*;

class Operators {

    public static int power(int num, int digit) {

        int ans = 1;
        for (int i = 0; i < digit; i++) {
            ans = ans * num;
        }

        return ans;
    }

    public static int binaryToDecimal(ArrayList<Integer> arr) {
        int ans = 0;
        int pow = 0;
        Collections.reverse(arr);

        for (Integer bit : arr) {

            if (pow == 0) {
                ans += 1 * bit;
                pow = 1;
            } else {
                ans += 2 * pow * bit;
                pow = pow * 2;
            }
        }

        return ans;
    }

    public static ArrayList<Integer> decimalToBinary(int num) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (num != 0) {
            int bit = num % 2;
            arr.add(bit);
            num = num / 2;
        }

        Collections.reverse(arr);

        return arr;

    }

    public static void main(String[] args) {

        // Convert a decimal into binary
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        arr = decimalToBinary(num);

        for (Integer bit : arr)
            System.out.print(bit + " ");

        System.out.println();

        int decimal = binaryToDecimal(arr);

        System.out.println(decimal);

        sc.close();
    }
}