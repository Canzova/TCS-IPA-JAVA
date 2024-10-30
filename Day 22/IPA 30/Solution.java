import java.util.*;

public class Solution{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		Movie arr[] = new Movie[4];

		for(int i = 0; i < 4; i++){
			int id = sc.nextInt();
			sc.nextLine();

			String direct = sc.nextLine();

			int rating = sc.nextInt();

			int budget = sc.nextInt();

		
			Movie obj = new Movie(id, direct, rating, budget);

			arr[i] = obj;
		}


		sc.nextLine();

		String director = sc.nextLine();
		int rating = sc.nextInt();
		int budget = sc.nextInt();


		int avgBud = findAvgBudgetByDirector(arr, director);

		if(avgBud == 0){
			System.out.println("Sorry - The given director has not yet directed any movie.");
		}else{
			System.out.println(avgBud);
		}

		Movie result = getMovieByRatingBudget(rating, budget, arr);
		
		if(result == null){
			System.out.println("Sorry - No movie is available with the specified rating and budget requirement.");
		}else{
			System.out.println(result.getMovieId());
		}
	
		sc.close();
	
	}

	public static Movie getMovieByRatingBudget(int rating, int budget, Movie arr[]){

		for(int i = 0; i < arr.length; i++){
			if((arr[i].getBudget() == budget && arr[i].getRating() == rating) || (arr[i].getRating() % arr[i].getBudget() == 0)){
				return arr[i];
			}
		}


		return null;

	}

	public static int findAvgBudgetByDirector(Movie arr[], String direct){

		int sum = 0;
		int count = 0;

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getDirector().equalsIgnoreCase(direct)){
				count++;
				sum += arr[i].getBudget();
			}
		}

		return sum/count;

	}
}

class Movie{
	private int movieId;
	private String director;
	private int rating;
	private int budget;

	public int getRating(){
		return this.rating;
	}

	public int getMovieId(){
		return this.movieId;
	}

	public String getDirector(){
		return this.director;
	}

	public int getBudget(){
		return this.budget;
	}


    Movie(int id, String direct, int rating, int budget){

		this.movieId = id;
		this.director = direct;
		this.rating = rating;
		this.budget = budget;

	}
}