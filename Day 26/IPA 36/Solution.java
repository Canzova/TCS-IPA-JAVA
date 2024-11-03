import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		TravelAgencies arr[] = new TravelAgencies [4];

		for(int i = 0; i < 4; i++){
			int no = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();
			String type = sc.nextLine();

			int price = sc.nextInt();
			boolean flight = sc.nextBoolean();

			TravelAgencies obj = new TravelAgencies(no, name, type, price, flight);

			arr[i] = obj;
		}

		int regNo = sc.nextInt();
		sc.nextLine();

		String packageType = sc.nextLine();

		int highestPackage = findAgencyWithHighestPackagePrice(arr);
	
		System.out.println(highestPackage);

		TravelAgencies result = agencyDetailsForGivenIdAndType(arr, regNo, packageType);
			
		System.out.println(result.getAgencyName() + ":" + result.getPrice());
		
		
		sc.close();
	}

	public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies arr[], int regNo, String pakage){


		for(int i = 0; i < arr.length; i++){
			if(arr[i].getFlightFacility() == true && arr[i].getRegNo() == regNo && arr[i].getPakageType().equalsIgnoreCase(pakage)) return arr[i];
		
		}	

		return null;

	}

	public static int findAgencyWithHighestPackagePrice(TravelAgencies arr[]){

		int maxi = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			maxi = Math.max(maxi, arr[i].getPrice());
		}
		
		return maxi;
	}
}

class TravelAgencies{
	private int regNo;
	private String agencyName;
	private String pakageType;
	private int price;
	private boolean flightFacility;

	public int getRegNo(){
		return this.regNo;
	}

	public String getAgencyName(){
		return this.agencyName;
	}

	public String getPakageType(){
		return this.pakageType;
	}

	public boolean getFlightFacility(){
		return this.flightFacility;
	}

	public int getPrice(){
		return this.price;
	}

	TravelAgencies(int no, String name, String type, int price, boolean flight){

		this.regNo = no;
		this.agencyName = name;
		this.pakageType = type;
		this.price = price;
		this.flightFacility = flight;

	}
}