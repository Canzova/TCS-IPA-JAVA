import java.util.*;

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    // Created Parameterized contructor
    Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }

}

public class FootWearProgrammm {

    public static int getCountByType(Footwear arr[], String footwearType) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getFootwearType()).equals(footwearType)) {
                count++;
            }
        }

        return count == 0 ? 0 : count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear arr[], String inputFootwearName) {

        ArrayList<Footwear> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFootwearName().equals(inputFootwearName)) {
                temp.add(arr[i]);
            }
        }

        // Now we want 2nd highest object on basis of price
        Collections.sort(temp, (a, b) -> {
            return a.getPrice() - b.getPrice();
        });

        int n = temp.size();

        if (n == 0)
            return null;
        else {
            return temp.get(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Footwear[] arr = new Footwear[5];

        for (int i = 0; i < 5; i++) {
            int footwearId = sc.nextInt();
            sc.nextLine();
            String footwearName = sc.nextLine();
            String footwearType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            Footwear obj = new Footwear(footwearId, footwearName, footwearType, price);

            arr[i] = obj;
        }

        String footwearType = sc.nextLine();
        String footwearName = sc.nextLine();

        int footwearCount = getCountByType(arr, footwearType);
        if (footwearCount == 0)
            System.out.println("Footwear not available");
        else
            System.out.println(footwearCount);

        Footwear ans = getSecondHighestPriceByBrand(arr, footwearName);
        if (ans == null) {
            System.out.println("Brand not available");
        } else {
            System.out.println(ans.getFootwearId());
            System.out.println(ans.getFootwearName());
            System.out.println(ans.getPrice());
        }

        sc.close();

    }
}
