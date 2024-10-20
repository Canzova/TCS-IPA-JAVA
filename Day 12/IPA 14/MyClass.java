import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop arr[] = new Laptop[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt();
            Laptop obj = new Laptop(id, brand, osType, price, rating);
            arr[i] = obj;
        }
        sc.nextLine();
        String brand = sc.nextLine();
        String os = sc.nextLine();
        int count = countOfLaptopsByBrand(arr, brand);
        if (count == 0) {
            System.out.println("The given brand is not available");
        } else {
            System.out.println(count);
        }
        Laptop ans[] = searchLaptopByOsType(arr, os);
        if (ans == null) {
            System.out.println("The given os is not available");
        } else {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getLaptopId());
                System.out.println(ans[i].getRating());
            }
        }
        sc.close();
    }

    public static int countOfLaptopsByBrand(Laptop arr[], String brand) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBrand().equalsIgnoreCase(brand) && arr[i].getRating() > 3)
                count++;
        }
        return count;
    }

    public static Laptop[] searchLaptopByOsType(Laptop arr[], String os) {
        ArrayList<Laptop> tempAns = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getOsType().equalsIgnoreCase(os)) {
                tempAns.add(arr[i]);
            }
        }
        if (tempAns.size() == 0)
            return null;
        Collections.sort(tempAns, (a, b) -> {
            return (b.getLaptopId() - a.getLaptopId());
        });
        Laptop ans[] = tempAns.toArray(new Laptop[tempAns.size()]);
        return ans;
    }
}

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public int getLaptopId() {
        return this.laptopId;
    }

    public int getRating() {
        return this.rating;
    }

    public String getOsType() {
        return this.osType;
    }

    public String getBrand() {
        return this.brand;
    }

    Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }
}