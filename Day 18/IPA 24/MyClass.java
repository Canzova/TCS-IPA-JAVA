import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Flowers arr[] = new Flowers[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            int price = sc.nextInt();

            int rating = sc.nextInt();
            sc.nextLine();

            String type = sc.nextLine();

            Flowers obj = new Flowers(id, name, price, rating, type);

            arr[i] = obj;

        }

        String type = sc.nextLine();

        Flowers mini = findMinPriceByType(arr, type);

        if (mini == null) {
            System.out.println("There is no flower with given type");
        } else {
            System.out.println(mini.getFlowerId());
        }

        sc.close();
    }

    public static Flowers findMinPriceByType(Flowers arr[], String type) {
        Flowers ans = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getType().equals(type) && arr[i].getRating() > 3) {
                if (ans == null) {
                    ans = arr[i];
                } else if (ans.getPrice() > arr[i].getPrice()) {
                    ans = arr[i];
                }
            }

        }

        return ans;
    }

}

class Flowers {
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public String getFlowerName() {
        return flowerName;
    }

    public int getPrice() {
        return this.price;
    }

    public int getRating() {
        return this.rating;
    }

    public String getType() {
        return this.type;
    }

    public int getFlowerId() {
        return this.flowerId;
    }

    Flowers(int id, String name, int price, int rating, String type) {
        this.flowerId = id;
        this.flowerName = name;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }
}