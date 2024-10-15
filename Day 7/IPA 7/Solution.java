import java.util.*;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return this.simId;
    }

    public String getCircle() {
        return this.circle;
    }

    public double getRatePerSecond() {
        return this.ratePerSecond;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    // Setters

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

}

public class Solution {

    public static Sim[] transferCustomerCircle(Sim[] arr, String circle1, String circle2) {
        ArrayList<Sim> tempAns = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCircle().equals(circle1)) {
                arr[i].setCircle(circle2);
                tempAns.add(arr[i]);
            }
        }

        // Sort in descending order----> as per value of ratePerSecond

        Collections.sort(tempAns, (a, b) -> {
            return Double.compare(b.getRatePerSecond(), a.getRatePerSecond());
        });

        // Converting arrraylist into array
        Sim ans[] = tempAns.toArray(new Sim[tempAns.size()]);

        // Converting array back into a resizable ArrayList
        // ArrayList<Sim> list = new ArrayList<>(Arrays.asList(ans));

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim arr[] = new Sim[5];
        for (int i = 0; i < 5; i++) {
            int simId = sc.nextInt();
            sc.nextLine();

            String customerName = sc.nextLine();

            double balance = sc.nextDouble();
            sc.nextLine();

            double ratePerSecond = sc.nextDouble();
            sc.nextLine();

            String circle = sc.nextLine();

            Sim obj = new Sim(simId, customerName, balance, ratePerSecond, circle);

            arr[i] = obj;
        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim ans[] = transferCustomerCircle(arr, circle1, circle2);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i].getSimId() + " " + ans[i].getCustomerName() + " " + ans[i].getCircle() + " "
                    + ans[i].getRatePerSecond());
        }

        sc.close();
    }
}