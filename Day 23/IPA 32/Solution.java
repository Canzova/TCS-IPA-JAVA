import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Player2 arr[] = new Player2[4];

		for(int i = 0; i < 4; i++){

			int id = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();

			int rank = sc.nextInt();

			int mp = sc.nextInt();

			int rs = sc.nextInt();

			Player2 obj = new Player2 (id, name, rank, mp, rs);

			arr[i] = obj;

		}

		int target = sc.nextInt();

		double avgRuns[] = findAverageOfRuns(arr, target);

		for(int i = 0; i < avgRuns.length; i++){
			if(avgRuns[i] >= 80 && avgRuns[i] <= 100){
				System.out.println("Grade A");
			}else if(avgRuns[i] >= 50 && avgRuns[i] <= 79){
				System.out.println("Grade B");
			}else{
				System.out.println("Grade C");
			}
		}

		

		sc.close();
	}

	public static double[] findAverageOfRuns(Player2 arr[], int target){
		ArrayList<Double>tempAns = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(target <= arr[i].getMatchesPlayed()){
				tempAns.add((double)(arr[i].getRunsScored() / arr[i].getMatchesPlayed()));
			}
		}

		int n = tempAns.size();

		double ans [] = new double[n];

		for(int i = 0; i < n; i++){
			ans[i] = tempAns.get(i);
		}
		return ans;
	}
}

class Player2{
	private int id;
	private String name;
	private int iccRank;
	private int matchesPlayed;
	private int runsScored;

	public int getRunsScored(){
		return this.runsScored;
	}

	public int getMatchesPlayed(){
		return this.matchesPlayed;
	}


	Player2(int id, String name, int rank, int mp, int rs){

		this.id = id;
		this.name = name;
		this.iccRank = rank;
		this.matchesPlayed = mp;
		this.runsScored = rs;

	}
}