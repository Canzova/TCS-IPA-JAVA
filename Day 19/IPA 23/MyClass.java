import java.util.*;

public class MyClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Antenna arr[] = new Antenna[4];

		for(int i = 0; i < 4; i++){
			int id = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();
			String lead = sc.nextLine();

			double vswr = sc.nextDouble();

			Antenna obj = new Antenna(id, name, lead, vswr);
			arr[i] = obj;

		}
		
		sc.nextLine();
		String name = sc.nextLine();
		double vswr = sc.nextDouble();

	
		int antennaId = searchAntennaByName(arr, name);
		
		if(antennaId == 0) {
			System.out.println("There is no antenna with given parameter");
		}else{
			System.out.println(antennaId);
		}


		Antenna sortedAntenna[] = sortAntennaByVSWR(arr, vswr);

		if(sortedAntenna == null){
			System.out.println("No Antenna found");
		}else{
			for(int i = 0; i < sortedAntenna.length; i++){
				System.out.println(sortedAntenna[i].getProjectLead());
			}
		}
		

		sc.close();
	}



	public static Antenna[] sortAntennaByVSWR(Antenna arr[], double vswr){

		ArrayList<Antenna>tempAns = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getAntennaVSWR() < vswr) tempAns.add(arr[i]);
		}

		int n = tempAns.size();
		if(n == 0) return null;

		Collections.sort(tempAns, (a, b)->{
			return Double.compare(a.getAntennaVSWR(), b.getAntennaVSWR());
		});

		Antenna ans[] = tempAns.toArray(new Antenna[n]);

		return ans;

	}


	public static int searchAntennaByName(Antenna arr[], String name){
		
		for(int i = 0; i < arr.length; i++){

			if(arr[i].getAntennaName().equals(name)) return arr[i].getAntennaId();
		}


		return 0;
	}
}

class Antenna{
	private int antennaId;
	private String antennaName;
	private String projectLead;
	private double antennaVSWR;

	public int getAntennaId(){
		return this.antennaId;
	}

	public double getAntennaVSWR(){
		return this.antennaVSWR;
	}

	public String getAntennaName(){
		return this.antennaName;
	}

	public String getProjectLead(){
		return this.projectLead;
	}

	Antenna(int id, String name, String lead, double vswr){
		this.antennaId = id;
		this.antennaName = name;
		this.projectLead = lead;
		this.antennaVSWR = vswr;
	}

}