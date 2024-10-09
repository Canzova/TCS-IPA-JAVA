import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array : ");

        int size = sc.nextInt();

        // first way to define Arrays
        // 1. int [] nums = new int[size];


        // Second way to define arrays 
        int nums [] = new int[size];


        // Third way to define arrays
        //int nums[] = {12, 13, 14, 15, 16};


        // Putting elements in the array
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the value at " + i + " index : ");
            nums[i] = sc.nextInt();

            System.out.println();
        }

        // printing the elemets of array

        for(int i = 0; i < size; i++)
        {
            System.out.println("Element at " + i + " index is : " + nums[i]);
        }



        System.out.println("Length of the array is : " + nums.length);

        sc.close();
    }
}
