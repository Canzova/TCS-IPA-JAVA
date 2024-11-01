import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Sim2 arr[] = new Sim2[4];

		for(int i = 0; i < 4; i++){
			int id = sc.nextInt();
			sc.nextLine();
		
			String comp = sc.nextLine();

			int bal = sc.nextInt();
			double rps = sc.nextDouble();
			sc.nextLine();


			String circle = sc.nextLine();

			Sim2 obj = new Sim2(id, comp, bal, rps, circle);

			arr[i] = obj;
		}

		String search_circle = sc.nextLine();
		double search_rate = sc.nextDouble();

		Sim2 results [] = matchAndSort(arr, search_circle, search_rate);

		for(int i = 0; i < results.length; i++){
			System.out.println(results[i].getId());
		}
		

		sc.close();
	}

	public static Sim2[] matchAndSort(Sim2 arr[], String circle, double rate){
		ArrayList<Sim2>tempAns = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getCircle().equals(circle) && rate > arr[i].getRatePerSecond()){
				tempAns.add(arr[i]);
			}

		}

		int n = tempAns.size();

		Collections.sort(tempAns, (a, b)->{
			return b.getBalance() - a.getBalance();
		});

		Sim2 ans[] = tempAns.toArray(new Sim2[n]);

		return ans;

		
	}
}

class Sim2{
	private int id;
	private String company;
	private int balance;
	private double ratePerSecond;
	private String circle;

	public int getBalance(){
		return this.balance;
	}

	public int getId(){
		return this.id;
	}

	public double getRatePerSecond(){
		return this.ratePerSecond;
	}

	public String getCircle(){
		return this.circle;
	}


	Sim2(int id, String comp, int bal, double rps, String circle){
		this.id = id;
		this.company = comp;
		this.balance = bal;
		this.ratePerSecond = rps;
		this.circle = circle;
	}
}