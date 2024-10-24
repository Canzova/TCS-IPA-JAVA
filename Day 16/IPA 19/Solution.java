import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Movie arr[] = new Movie[4];

        for (int i = 0; i < 4; i++) {
            String name = sc.nextLine();
            String comp = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();

            Movie obj = new Movie(name, comp, genre, budget);
            arr[i] = obj;
        }

        String searchGenre = sc.nextLine();

        Movie movieByGenre[] = getMovieByGenre(arr, searchGenre);

        for (int i = 0; i < movieByGenre.length; i++) {
            if (movieByGenre[i].getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }

        sc.close();
    }

    public static Movie[] getMovieByGenre(Movie arr[], String genre) {

        ArrayList<Movie> tempAns = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGenre().equalsIgnoreCase(genre)) {
                tempAns.add(arr[i]);
            }

        }

        Movie ans[] = tempAns.toArray(new Movie[tempAns.size()]);
        return ans;

    }
}

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public String getCompany() {
        return company;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getBudget() {
        return this.budget;
    }

    public String getGenre() {
        return this.genre;
    }

    Movie(String name, String comp, String genre, int budget) {
        this.movieName = name;
        this.company = comp;
        this.genre = genre;
        this.budget = budget;
    }
}