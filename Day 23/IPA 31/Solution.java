import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Student arr[] = new Student [4];
		for(int i = 0; i < 4; i++){
			int roll = sc.nextInt();
			sc.nextLine();
			
			String name = sc.nextLine();
			String branch = sc.nextLine();

			double score = sc.nextDouble();
			boolean dayScholar = sc.nextBoolean();

			Student obj = new Student(roll, name, branch, score, dayScholar);

			arr[i] = obj;
		}

		int count = findCountOfDayscholarStudents(arr);

		if(count == 0){
			System.out.println("There are no such dayscholar students");
		}else{
			System.out.println(count);
		}

		Student result = findStudentwithSecondHighestScore(arr);

		if(result== null){
			System.out.println("There are no student from non day scholar");
		}else{
			System.out.println(result.getRollNo() + "#" + result.getName() + "#" + result.getScore());
		}

		sc.close();
	}


	public static Student findStudentwithSecondHighestScore(Student arr[]){
		ArrayList<Student>tempArray = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getDayScholar() == false){
				tempArray.add(arr[i]);
			}
		}

		int n = tempArray.size();

		if(n == 0) return null;

		Collections.sort(tempArray, (a, b)->{
			return Double.compare(a.getScore(), b.getScore());
		});

		return tempArray.get(n - 2);
	}


	public static int findCountOfDayscholarStudents(Student arr[]){
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){

			if(arr[i].getDayScholar() == true && arr[i].getScore() > 80){
				count++;
			}
		
		}


		return count;
	}
}

class Student{
	private int rollNo;
	private String name;
	private String branch;
	private double score;
	private boolean dayScholar;

	public boolean getDayScholar(){
		return this.dayScholar;
	}

	public double getScore(){
		return this.score;
	}

	public int getRollNo(){
		return this.rollNo;
	}

	public String getName(){
		return this.name;
	}


	Student(int roll, String name, String branch, double score, boolean dayScholar){

		this.rollNo = roll;
		this.name = name;
		this.branch = branch;
		this.score = score;
		this.dayScholar = dayScholar;

	}
}