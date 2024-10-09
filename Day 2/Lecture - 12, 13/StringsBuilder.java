

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // Append ---> Used to add somthing at the end
        sb.append(" World");
        System.out.println(sb);

        // charAt
        System.out.println(sb.charAt(4));

        // length
        System.out.println(sb.length());

        // setCharAt
        sb.setCharAt(0, 'A');
        System.out.println(sb);


        StringBuilder sb2 = new StringBuilder("Hello World");

        // Insert ---> You can insert anything at middle, start or end
        sb2.insert(6, "Java ");
        System.out.println(sb2);


        // replace ---> replace anything
        sb2.replace(6, 10, "C++");
        System.out.println(sb2);


        // substring
        System.out.println(sb2.substring(6, 9));
        

    }
}
