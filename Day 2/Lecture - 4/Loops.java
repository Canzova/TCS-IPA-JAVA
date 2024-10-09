import java.util.*;

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for loop : ");
        int num = sc.nextInt();

        // Foe loop
        // for (int i = 0; i < num; i++) {
        // System.out.println("Kaise ho aap " + i);
        // }


        // WHile Loop
        // int i = 0;
        // while (i < num) {
        //     System.out.println("Kaise ho aap " + i);
        //     i++;
        // }


        // do while loop
        int i = 0;
        do{
            System.out.println("Kaise ho aap " + i);
            i++;
        }while(i < num);

        sc.close();

    }
}