import java.util.*;

public class footweraProgramm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Footwear arr[] = new Footwear[5];

		for (int i = 0; i < 5; i++) {
			int id = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();
			String type = sc.nextLine();

			int price = sc.nextInt();

			Footwear obj = new Footwear(id, name, type, price);
			arr[i] = obj;

		}
		sc.nextLine();

		String type = sc.nextLine();
		String inputFootwearName = sc.nextLine();

		int count = getCountByType(arr, type);
		if (count == 0) {
			System.out.println("Footwear not available");
		} else {
			System.out.println(count);
		}

		Footwear secondHighest = getSecondHighestPriceByBrand(arr, inputFootwearName);

		if (secondHighest == null) {
			System.out.println("Brand not available");
		} else {
			System.out.println(secondHighest.getFootwearId());
			System.out.println(secondHighest.getFootwearName());
			System.out.println(secondHighest.getPrice());
		}

		sc.close();
	}

	public static Footwear getSecondHighestPriceByBrand(Footwear arr[], String brand) {
		//ArrayList<Footwear> list = new ArrayList<>();

		Footwear obj1 = null;
		Footwear obj2 = null;
		int maxi1 = -1;
		int maxi2 = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getFootwearName().equalsIgnoreCase(brand)) {

				//list.add(arr[i]);
				if (arr[i].getPrice() > maxi1) {
					maxi2 = maxi1;
					obj2 = obj1;

					maxi1 = arr[i].getPrice();
					obj1 = arr[i];
					
				} else if (arr[i].getPrice() > maxi2 && arr[i].getPrice() != maxi1) {
					maxi2 = arr[i].getPrice();
					obj2 = arr[i];
				}

			}

		}

		// int n = list.size();

		// if (n == 0)
		// 	return null;

		// Collections.sort(list, (a, b) -> {
		// 	return a.getPrice() - b.getPrice();
		// });

		// Footwear ans = list.get(n - 2);

		// return ans;
		return obj2;

	}

	public static int getCountByType(Footwear arr[], String type) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getFootwearType().equalsIgnoreCase(type))
				count++;

		}

		return count;
	}
}

class Footwear {
	private int footwearId;
	private String footwearName;
	private String footwearType;
	private int price;

	public int getFootwearId() {
		return this.footwearId;
	}

	public int getPrice() {
		return this.price;
	}

	public String getFootwearName() {
		return this.footwearName;

	}

	public String getFootwearType() {
		return this.footwearType;
	}

	Footwear(int id, String name, String type, int price) {

		this.footwearId = id;
		this.footwearName = name;
		this.footwearType = type;
		this.price = price;

	}

}