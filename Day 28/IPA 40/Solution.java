import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MobileDetails arr[] = new MobileDetails[5];

		for(int i = 0; i < 5; i++){
			int id = sc.nextInt();

			int price = sc.nextInt();

			sc.nextLine();
			String brand = sc.nextLine();

			boolean isFlagShip = sc.nextBoolean();


			MobileDetails obj = new MobileDetails(id, price, brand, isFlagShip);

			arr[i] = obj;
		}

		sc.nextLine();
		String brand = sc.nextLine();

		int totalPrice = getTotalPrice(arr, brand);

		if(totalPrice == 0){
			System.out.println("There are no mobile with given brand");
		}else{
			System.out.println(totalPrice);
		}

		MobileDetails results[] = getSecondMin(arr);

		if(results != null){
			for(int i = 0; i < results.length; i++){
				System.out.println(results[i].getBrand() + " : " + results[i].getPrice());
			}
		}

		
		

		sc.close();
	}

	public static MobileDetails [] getSecondMin(MobileDetails arr[]){
		
		Arrays.sort(arr, (a, b)->{
			return a.getPrice() - b.getPrice();
		});

		ArrayList<MobileDetails>tempAns = new ArrayList<>();

		int prev = 0;
		int curr = 1;
		int n = arr.length;

		while(curr < n && arr[prev].getPrice() == arr[curr].getPrice()){
			prev++;
			curr++;
		}

		if(curr < n) tempAns.add(arr[curr]);
		
		prev++;
		curr++;

		while(curr < n && arr[prev].getPrice() == arr[curr].getPrice()){
			tempAns.add(arr[curr]);
			curr++;
			prev++;
		}
		

		int size = tempAns.size();
		MobileDetails ans [] = tempAns.toArray(new MobileDetails[size]);

		return ans;
	}

	public static int getTotalPrice(MobileDetails arr[], String brand){
		int total = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getBrand().equals(brand)) total += arr[i].getPrice();
		}

		return total;
	}	
}

class MobileDetails{
	private int mobileId;
	private int price;
	private String brand;
	private boolean isFlagShip;

	public String getBrand(){
		return this.brand;
	}

	public int getPrice(){
		return this.price;
	}

    public int getMobileId(){
        return this.mobileId;
    }

	MobileDetails(int id, int price, String brand, boolean flag){
		this.mobileId = id;
		this.price = price;
		this.brand = brand;
		this.isFlagShip = flag;
	}
}