import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Inventory arr[] = new Inventory[4];

        for (int i = 0; i < 4; i++) {
            String id = sc.nextLine();
            int mQuant = sc.nextInt();
            int cQuant = sc.nextInt();
            int threshold = sc.nextInt();

            sc.nextLine();

            Inventory obj = new Inventory(id, mQuant, cQuant, threshold);

            arr[i] = obj;
        }
        int limit = sc.nextInt();

        Inventory results[] = Replenish(arr, limit);

        if (results == null) {
            System.out.println("Nothing is in results array");
        } else {

            for (int i = 0; i < results.length; i++) {
                if (results[i].getThreshold() > 75) {
                    System.out.println(results[i].getInventoryId() + " Critical Filling");
                } else if (results[i].getThreshold() >= 50 && results[i].getThreshold() <= 75) {
                    System.out.println(results[i].getInventoryId() + " Moderate Filling");
                } else {
                    System.out.println(results[i].getInventoryId() + " Non-Critical Filling");
                }
            }
        }

        sc.close();
    }

    public static Inventory[] Replenish(Inventory arr[], int limit) {

        ArrayList<Inventory> tempAns = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getThreshold() <= limit)
                tempAns.add(arr[i]);
        }

        int n = tempAns.size();
        if (n == 0)
            return null;

        Inventory results[] = tempAns.toArray(new Inventory[n]);

        return results;

    }

}

class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public int getThreshold() {
        return this.threshold;
    }

    public String getInventoryId() {
        return this.inventoryId;
    }

    Inventory(String id, int mQuant, int cQuant, int threshold) {

        this.inventoryId = id;
        this.maximumQuantity = mQuant;
        this.currentQuantity = cQuant;
        this.threshold = threshold;

    }
}