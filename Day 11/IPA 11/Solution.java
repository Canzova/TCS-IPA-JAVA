import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        Book arr[] = new Book[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String title = sc.nextLine();
            String author = sc.nextLine();

            double price = sc.nextDouble();

            Book obj = new Book(id, title, author, price);
            arr[i] = obj;
        }

        Book ans[] = sortBooksByprice(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(
                    ans[i].getId() + " " + ans[i].getTitle() + " " + ans[i].getAuthor() + " " + ans[i].getPrice());
        }

        sc.close();
    }

    public static Book[] sortBooksByprice(Book arr[]) {
        Arrays.sort(arr, (a, b) -> {
            return Double.compare(a.getPrice(), b.getPrice());
        });
        return arr;
    }
}

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    // Constructor
    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}