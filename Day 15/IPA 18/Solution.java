import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Medicine arr[] = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            String name = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();

            int price = sc.nextInt();
            sc.nextLine();

            Medicine obj = new Medicine(name, batch, disease, price);
            arr[i] = obj;
        }
        String disease = sc.nextLine();

        // Never name it ans ---> Give it a meaningFullName
        int priceByDisease[] = getPriceByDisease(arr, disease);

        for (int i = 0; i < priceByDisease.length; i++) {
            System.out.println(priceByDisease[i]);
        }

        sc.close();
    }

    public static int[] getPriceByDisease(Medicine arr[], String disease) {
        ArrayList<Integer> tempAns = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDisease().equalsIgnoreCase(disease)) {

                tempAns.add(arr[i].getPrice());
            }
        }

        Collections.sort(tempAns);

        int ans[] = new int[tempAns.size()];
        for (int i = 0; i < tempAns.size(); i++) {
            ans[i] = tempAns.get(i);
        }
        return ans;
    }
}

class Medicine {
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;

    public String getDisease() {
        return this.disease;
    }

    public int getPrice() {
        return this.price;
    }

    Medicine(String name, String batch, String disease, int price) {
        this.MedicineName = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}