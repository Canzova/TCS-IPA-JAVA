import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HeadSets arr[] = new HeadSets[4];

        for (int i = 0; i < 4; i++) {
            String name = sc.nextLine();

            String brand = sc.nextLine();

            int price = sc.nextInt();

            boolean avai = sc.nextBoolean();

            sc.nextLine();

            HeadSets obj = new HeadSets(name, brand, price, avai);

            arr[i] = obj;
        }

        String brand = sc.nextLine();

        int price = findTotalPriceForGivenBrand(arr, brand);

        if (price == 0) {
            System.out.println("No Headsets available with the given brand");
        } else {
            System.out.println(price);
        }

        HeadSets result = findAvailableHeadsetWithSecondMinPrice(arr);

        if (result == null) {
            System.out.println("No Headsets available");
        } else {
            System.out.println(result.getHeadsetName());
            System.out.println(result.getPrice());
        }

        sc.close();
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets arr[]) {

        ArrayList<HeadSets>tempAns = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getAvailable() == true) tempAns.add(arr[i]);
        }

        if(tempAns.size() == 0) return null;

        Collections.sort(tempAns, (a, b) -> {
            return a.getPrice() - b.getPrice();
        });

        return tempAns.get(1);
    }

    public static int findTotalPriceForGivenBrand(HeadSets arr[], String brand) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBrand().equalsIgnoreCase(brand))
                sum += arr[i].getPrice();
        }

        return sum;
    }
}

class HeadSets{
	private String headsetName;
	private String brand;
	private int price;
	private boolean available;

    public boolean getAvailable(){
        return this.available;
    }

	public String getBrand(){
		return this.brand;
	}

	public int getPrice(){
		return this.price;
	}

	public String getHeadsetName(){
		return this.headsetName;
	}

	HeadSets(String name, String brand, int price, boolean available){
		this.headsetName = name;
		this.brand = brand;
		this.price = price;
		this.available = available;
	}
}