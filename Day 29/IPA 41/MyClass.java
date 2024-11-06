import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Song arr[] = new Song[5];

        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String title = sc.nextLine();
            String artist = sc.nextLine();

            double duration = sc.nextDouble();

            Song obj = new Song(id, title, artist, duration);

            arr[i] = obj;
        }
        sc.nextLine();

        String artist = sc.nextLine();

        String artist2 = sc.nextLine();

        double duration = findSongDurationForArtist(arr, artist);

        if (duration == 0) {
            System.out.println("There are no songs with given artist");
        } else {
            System.out.println(duration);
        }

        Song results[] = getSonginAscendingOrder(arr, artist2);

        if (results == null) {
            System.out.println("There are no songs with the given artist");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i].getSongId());
                System.out.println(results[i].getTitle());
            }
        }

        sc.close();
    }

    public static Song [] getSonginAscendingOrder(Song arr[], String artist){
		ArrayList<Song>tempAns = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(arr[i].getArtist().equalsIgnoreCase(artist)) tempAns.add(arr[i]);
		}

		int n = tempAns.size();
		if(n == 0) return null;

		Collections.sort(tempAns, (a, b)->{
			return Double.compare(a.getDuration(), b.getDuration());
		});

		Song ans[] = tempAns.toArray(new Song[n]);

		return ans;
	}

    public static double findSongDurationForArtist(Song arr[], String artist){
		double sum = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getArtist().equalsIgnoreCase(artist)){
				sum += arr[i].getDuration();
			}
		}


		return sum;
	}
}

class Song {
    private int songId;
    private String title;
    private String artist;
    private double duration;

    public int getSongId() {
        return this.songId;
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getArtist() {
        return this.artist;
    }

    Song(int id, String title, String artist, double duration) {
        this.songId = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
}