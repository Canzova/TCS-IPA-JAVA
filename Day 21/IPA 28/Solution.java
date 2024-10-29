import java.util.*;

public class Solution{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
	
		Associate arr[] = new Associate[5];
		
		for(int i = 0; i < 5; i++){
			int id = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();

			String technology = sc.nextLine();

			int exp = sc.nextInt();

			Associate obj = new Associate(id, name, technology, exp);

			arr[i] = obj;
		}
		sc.nextLine();

		String searchTechnology = sc.nextLine();

		Associate results [] = associatesForGivenTechnology(arr, searchTechnology);

		if(results == null){
			System.out.println("No associates with given technology");
		}else{
			for(int i = 0; i < results.length; i++){
				System.out.println(results[i].getId());
			}
	
		}

		sc.close();

	}

	public static Associate [] associatesForGivenTechnology(Associate arr[], String tech){
		ArrayList<Associate>tempAns = new ArrayList<>();


		for(int i = 0; i < arr.length; i++){

			if(arr[i].getTechnology().equalsIgnoreCase(tech) && arr[i].getExperienceInYear() % 5 == 0){
				tempAns.add(arr[i]);
			}
		}

		int n = tempAns.size();

		if(n == 0) return null;

		Associate ans [] = tempAns.toArray(new Associate [n]);

		return ans;
	}
}

class Associate{
	private int id;
	private String name;
	private String technology;
	private int experienceInYear;

	public int getId(){
		return this.id;
	}

	public String getTechnology(){
		return this.technology;
	}

	public int getExperienceInYear(){
		return this.experienceInYear;
	}
	public String getName() {
		return name;
	}

	Associate(int id, String name, String tech, int exp){

		this.id = id;
		this.name = name;
		this.technology = tech;
		this.experienceInYear = exp;

	}
}