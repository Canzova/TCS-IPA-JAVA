import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Team arr[] = new Team[size];

        for (int i = 0; i < size; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String country = sc.nextLine();

            int run = sc.nextInt();

            Team obj = new Team(id, name, country, run);

            arr[i] = obj;
        }

        int run = sc.nextInt();

        sc.nextLine();

        String country = sc.nextLine();

        Team result = findPlayer(arr, run, country);

        if (result == null) {
            System.out.println("No Team is found from the given country and run");
        } else {
            System.out.println(result.getTid());
            System.out.println(result.getTname());
            System.out.println(result.getTcountry());
            System.out.println(result.getTrun());
        }

        sc.close();
    }

    public static Team findPlayer(Team arr[], int run, String country) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getTcountry().equalsIgnoreCase(country) && arr[i].getTrun() > run)
                return arr[i];

        }

        return null;
    }
}

class Team {
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    public int getTrun() {
        return this.tRun;
    }

    public String getTcountry() {
        return this.tCountry;
    }

    public String getTname() {
        return this.tName;
    }

    public int getTid() {
        return this.tId;
    }

    Team(int id, String name, String country, int run) {
        this.tId = id;
        this.tName = name;
        this.tCountry = country;
        this.tRun = run;
    }

}