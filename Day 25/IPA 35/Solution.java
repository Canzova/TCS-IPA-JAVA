import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Music arr[] = new Music[4];

        for (int i = 0; i < 4; i++) {
            int playLN = sc.nextInt();
            sc.nextLine();

            String type = sc.nextLine();

            int count = sc.nextInt();

            double duration = sc.nextDouble();

            Music obj = new Music(playLN, type, count, duration);

            arr[i] = obj;
        }

        int count = sc.nextInt();
        double duration = sc.nextDouble();

        int avg = findAvgOfCount(arr, count);

        if (avg == 0) {
            System.out.println("No playlist found");
        } else {
            System.out.println(avg);
        }

        Music results[] = sortTypeByDuration(arr, duration);

        if (results == null) {
            System.out.println("No playlist found with mentioned attribute");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i].getType());
            }
        }

        sc.close();
    }

    public static Music[] sortTypeByDuration(Music arr[], double duration) {

        ArrayList<Music> tempAns = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDuration() > duration) {
                tempAns.add(arr[i]);
            }
        }

        int n = tempAns.size();

        if (n == 0)
            return null;

        Collections.sort(tempAns, (a, b) -> {
            return Double.compare(a.getDuration(), b.getDuration());
        });

        Music ans[] = tempAns.toArray(new Music[n]);

        return ans;

    }

    public static int findAvgOfCount(Music arr[], int count) {

        int sum = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getCount() > count) {
                sum += arr[i].getCount();
                num++;
            }
        }

        if (num == 0)
            return 0;
        return sum / num;

    }

}

class Music {
    private int playListNo;
    private String type;
    private int count;
    private double duration;

    public String getType() {
        return this.type;
    }

    public int getPlayListNo() {
        return playListNo;
    }

    public int getCount() {
        return this.count;
    }

    public double getDuration() {
        return this.duration;
    }

    Music(int playLN, String type, int count, double duration) {
        this.playListNo = playLN;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
}
