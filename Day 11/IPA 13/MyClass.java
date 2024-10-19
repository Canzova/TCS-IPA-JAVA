import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Player arr[] = new Player[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String pType = sc.nextLine();
            String mType = sc.nextLine();
            Player obj = new Player(id, name, runs, pType, mType);
            arr[i] = obj;
        }
        String pType = sc.nextLine();
        String mType = sc.nextLine();
        int runs = findPlayerWithLowestRuns(arr, pType);
        if (runs == 0) {
            System.out.println("No such player");
        } else {
            System.out.println(runs);
        }
        Player ans[] = findPlayerByMatchType(arr, mType);
        if (ans == null) {
            System.out.println("No Player with given matchType");
        } else {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getPlayerId());
            }
        }
        sc.close();
    }

    public static int findPlayerWithLowestRuns(Player arr[], String pType) {
        int ans = 10000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPlayerType().equals(pType)) {
                ans = Math.min(ans, arr[i].getRuns());
            }
        }
        return ans == 10000 ? 0 : ans;
    }

    public static Player[] findPlayerByMatchType(Player arr[], String mType) {
        ArrayList<Player> tempAns = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMatchType().equals(mType)) {
                tempAns.add(arr[i]);
            }
        }
        if (tempAns.size() == 0)
            return null;
        Collections.sort(tempAns, (a, b) -> {
            return (b.getPlayerId() - a.getPlayerId());
        });
        Player ans[] = tempAns.toArray(new Player[tempAns.size()]);
        return ans;
    }
}

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public int getPlayerId() {
        return this.playerId;
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public int getRuns() {
        return this.runs;
    }

    Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }
}