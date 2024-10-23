import java.util.*;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Player arr[] = new Player[4];
		for(int i = 0; i < 4; i++){
			int id = sc.nextInt();
			sc.nextLine();

			String skill = sc.nextLine();
			String level = sc.nextLine();

			int points = sc.nextInt();

			Player obj = new Player(id, skill, level, points);
			arr[i] = obj;
		}

		sc.nextLine();

		String skill = sc.nextLine();
		String level = sc.nextLine();


		int points = findPointsForGivenSkill(arr, skill);

		if(points == 0){
			System.out.println("The given skill is not available");
		}else{
			System.out.println(points);
		}

		Player ans = getPlayerBasedOnLevel(level, skill, arr);
		if(ans == null){
			System.out.println("No player is available with specified level, skill and eligibility points");
		}else{
			System.out.println(ans.getPlayerId());
		}

		sc.close();
	}

	public static Player getPlayerBasedOnLevel(String level, String skill, Player arr[]){
		Player ans = null;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getLevel().equalsIgnoreCase(level) &&
			arr[i].getSkill().equalsIgnoreCase(skill) &&
			arr[i].getPoints() >= 20){
				ans = arr[i];
			}
		}


		return ans;

	}

	public static int findPointsForGivenSkill(Player arr[], String skill){
		int points = 0;

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getSkill().equalsIgnoreCase(skill))
				points += arr[i].getPoints();
		}
		return points;
	}	
}

class Player{
	private int playerId;
	private String skill;
	private String level;
	private int points;

	public String getLevel(){
		return this.level;
	}

	public int getPlayerId(){
		return this.playerId;
	}

	public int getPoints(){
		return this.points;
	}

	public String getSkill(){
		return this.skill;
	}

	Player(int id, String skill, String level, int points){
		this.playerId = id;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}
}