import java.util.*;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Phone arr[] = new Phone[4];
		for(int i = 0; i < 4; i++){
			int id = sc.nextInt();
			sc.nextLine();

			String os = sc.nextLine();
			String brand = sc.nextLine();

			int price = sc.nextInt();
			sc.nextLine();

			Phone obj = new Phone(id, os, brand, price);
			arr[i] = obj;
		}

		String brand = sc.nextLine();
		String os = sc.nextLine();

		int price = findPriceForGivenBrand(arr, brand);

		if(price == 0){
			System.out.println("The given brand is not available");
		}else{
			System.out.println(price);
		}

		Phone phoneBasedOnOs = getPhoneBasedOnOs(arr, os);
		if(phoneBasedOnOs == null){
			System.out.println("No phones are available with specified os and price range");
		}else{
			System.out.println(phoneBasedOnOs.getPhoneId());
		}



		sc.close();
	}


	public static Phone getPhoneBasedOnOs(Phone arr[], String os){

		Phone ans = null;
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getOs().equalsIgnoreCase(os) && arr[i].getPrice() >= 50000){
				ans = arr[i];
				break;
			}
		}

		return ans;

	}

	public static int findPriceForGivenBrand(Phone arr[], String brand){
		int price = 0;

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getBrand().equalsIgnoreCase(brand)){
				price += arr[i].getPrice();
			}
		}

		return price;
	}
}

class Phone{
	private int phoneId;
	private String os;
	private String brand;
	private int price;

	public String getOs(){
		return this.os;
	}
	

	public int getPhoneId(){
		return this.phoneId;
	}

	public String getBrand(){
		return this.brand;
	}

	public int getPrice(){
		return this.price;
	}

	Phone(int id, String os, String brand, int price){
		this.phoneId = id;
		this.os = os;
		this.brand = brand;
		this.price = price;
	}
	
}
