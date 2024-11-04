import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		Player3 arr[] = new Player3 [size];

		for(int i = 0; i < size; i++){
			int id = sc.nextInt(); sc.nextLine();

			String name = sc.nextLine();
			String country = sc.nextLine();

			int mp = sc.nextInt();
			int rs = sc.nextInt();

			Player3 obj = new Player3(id, name, country, mp, rs);

			arr[i] = obj;
		}

		sc.nextLine();

		String country = sc.nextLine();
		int run = sc.nextInt();


		Player3 results[] = findPlayerName(arr, country, run);

		if(results == null){
			System.out.println("No player found");
		}else{
			for(int i = 0; i < results.length; i++){
				System.out.println(results[i].getId() + ":" + results[i].getName());
			}

		}

		sc.close();
	}

	public static Player3[] findPlayerName(Player3 arr[], String country, int run){

		ArrayList<Player3>tempArr = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getCountry().equalsIgnoreCase(country) && arr[i].getRunsScored() > run) tempArr.add(arr[i]);
		}
		
		int n = tempArr.size();

		if(n == 0) return null;

        Collections.sort(tempArr, (a, b)->{
            return a.getName().compareTo(b.getName());
        });

		Player3 ans[] = tempArr.toArray(new Player3[n]);

		return ans;

	}
}

class Player3{
	private int id;
	private String name;
	private String country;
	private int matchesPlayed;
	private int runsScored;

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public String getCountry(){
		return this.country;
	}

	public int getRunsScored(){
		return this.runsScored;
	}
	
	Player3(int id, String name, String country, int mp, int rs){
		this.id = id;
		this.name = name;
		this.country = country;
		this.matchesPlayed = mp;
		this.runsScored = rs;
	}
}