public class StringsFuncions {
    public static void main(String[] args) {
        String name1 = "Nihal";
        String name2 = "Kunal";

        // Contactination

        String mergedName = name1 + " " + name2;

        System.out.println(mergedName);

        // Char at
        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
            // This syntax is not allowed for strings ---> System.out.println(name1[i]);
        }

        // Equals
        if (name1.equals(name2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Substring ---> endIndex is exclusive

        String subString = mergedName.substring(0, 5);
        System.out.println("Substring : " + subString);

        // compareTo ---> It compares char by char

        /*
         * if s1 > s2 ---> +ve number
         * if s1 == s2 ---> 0
         * if s1 < s2 ---> -ve number
         */

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Do not do comaprision like this ---> You will get wrong answer
        if (new String("Nihal") == new String("Nihal")) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }

    }
}
