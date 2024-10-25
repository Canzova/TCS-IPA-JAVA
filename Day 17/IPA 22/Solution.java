import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[4];
		
		for(int i = 0; i < 4; i++){

			int rollNo = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine();

			String sub = sc.nextLine();

			char grade = sc.nextLine().charAt(0);

			String date = sc.nextLine();

			Student obj = new Student(rollNo, name, sub, grade, date);
			
			arr[i] = obj;
		}

		char grade = sc.nextLine().charAt(0);
		int month = sc.nextInt();

		Student studentByGradeAndMonth [] = findStudentByGradeAndMonth(arr, grade, month);
	
		if(studentByGradeAndMonth == null){
			System.out.println("No student found");
		}


		else{
			for(int i = 0; i < studentByGradeAndMonth.length; i++){
				System.out.println(studentByGradeAndMonth[i].getName());
				System.out.println(studentByGradeAndMonth[i].getSubject());
		
			}

			System.out.println(studentByGradeAndMonth.length);

		}


		sc.close();
	}

	public static Student[] findStudentByGradeAndMonth(Student arr[], char grade, int month){

		ArrayList<Student>tempAns = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getGrade() == grade){
				
				int mon = Integer.parseInt(arr[i].getDate().split("/")[1]);

				if(mon == month){
					tempAns.add(arr[i]);
				}

			}
		}

		int n = tempAns.size();

		if(n == 0) return null;

		Collections.sort(tempAns, (a, b)->{
			return a.getRollNo() - b.getRollNo();
		});

		Student ans [] = tempAns.toArray(new Student[n]);

		return ans;
		

	}
	
}

class Student {

	private int rollNo;
	private String name;
	private String subject;
	private char grade;
	private String date;


	public int getRollNo(){
		return this.rollNo;
	}

	public char getGrade(){
		return this.grade;
	}

	public String getDate(){
		return this.date;
	}

	public String getName(){
		return this.name;
	}

	public String getSubject(){
		return this.subject;
	}

	Student(int rollNo, String name, String sub, char grade, String date){

		this.rollNo = rollNo;
		this.name = name;
		this.subject = sub;
		this.grade = grade;
		this.date = date;


	}
}