import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Fruits arr[] = new Fruits[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            int price = sc.nextInt();
            int rating = sc.nextInt();

            Fruits obj = new Fruits(id, name, price, rating);
            arr[i] = obj;

        }

        int rating = sc.nextInt();

        Fruits max = findMaximumPriceByRating(arr, rating);

        if (max == null) {
            System.out.println("No such Fruit");
        } else {
            System.out.println(max.getFruitId());
        }

        sc.close();
    }

    public static Fruits findMaximumPriceByRating(Fruits arr[], int rating) {
        Fruits ans = null;
        int price = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getRating() > rating && arr[i].getPrice() > price) {
                ans = arr[i];
                price = arr[i].getPrice();
            }
        }

        return ans;
    }
}

class Fruits {
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitId() {
        return this.fruitId;
    }

    public int getPrice() {
        return this.price;
    }

    public int getRating() {
        return this.rating;
    }

    Fruits(int id, String name, int price, int rating) {

        this.fruitId = id;
        this.fruitName = name;
        this.price = price;
        this.rating = rating;

    }
}