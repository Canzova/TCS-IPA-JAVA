import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		newspaper arr[] = new newspaper[4];

		for(int i = 0; i < 4; i++){
			int no = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();
			int py = sc.nextInt();
			int price = sc.nextInt();


			newspaper obj = new newspaper(no, name, py, price);

			arr[i] = obj;
		}

		int py = sc.nextInt();
		sc.nextLine();

		String name = sc.nextLine();

		int tPrice = findTotalPriceByPublicationYear(arr, py);

		if(tPrice == 0){
			System.out.println("No Newspaper found with the mentioned attribute");
		}else{
			System.out.println(tPrice);
		}

		newspaper result = searchNewspaperByName(arr, name);

		if(result == null){
			System.out.println("No Newspaper found with the given name");
		}else{
			System.out.println("regNo-" + result.getRegNo());
			System.out.println("name-" + result.getName());

			System.out.println("publicationYear-" + result.getPublicationYear());
			System.out.println("price-"+ result.getPrice());
		}

		sc.close();
	}

	public static newspaper searchNewspaperByName(newspaper arr[], String name){

		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getName().equals(name)) return arr[i];
		}	


		return null;

	}

	public static int findTotalPriceByPublicationYear(newspaper arr[], int py){

		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getPublicationYear() == py) sum += arr[i].getPrice();
		}

		return sum;

	}
}

class newspaper{
	private int regNo;
	private String name;
	private int publicationYear;
	private int price;

	public int getPrice(){
		return this.price;
	}

	public int getPublicationYear(){
		return this.publicationYear;
	}

	public int getRegNo(){
		return this.regNo;
	}

	public String getName(){
		return this.name;
	}

	newspaper(int no, String name, int py, int price){
		this.regNo = no;
		this.name = name;
		this.publicationYear = py;
		this.price = price;
	}	
}