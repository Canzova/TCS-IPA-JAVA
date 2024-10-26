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
