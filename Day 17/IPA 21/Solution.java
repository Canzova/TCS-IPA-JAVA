import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        NavelVessel arr[] = new NavelVessel[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            int planned = sc.nextInt();

            int completed = sc.nextInt();

            sc.nextLine();

            String purpose = sc.nextLine();

            NavelVessel obj = new NavelVessel(id, name, planned, completed, purpose);

            arr[i] = obj;

        }

        int percentage = sc.nextInt();
        sc.nextLine();

        String purpose = sc.nextLine();

        int average = findAvgVoyagesByPct(arr, percentage);

        if (average != 0) {
            System.out.println(average);
        }

        NavelVessel vessel = findVesselByGrade(arr, percentage, purpose);
        if (vessel == null) {
            System.out.println("No Naval Vessel is available with specified purpose");
        } else {
            System.out.println(vessel.getVesselName() + '%' + vessel.getClassification());
        }

        sc.close();
    }

    public static NavelVessel findVesselByGrade(NavelVessel arr[], int per, String purpose) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPurpose().equals(purpose)) {
                if (per == 100) {
                    arr[i].setClassification("Star");
                    return arr[i];
                } else if (per >= 80 && per <= 99) {

                    arr[i].setClassification("Leader");
                    return arr[i];

                } else if (per >= 55 && per <= 79) {

                    arr[i].setClassification("Inspirer");
                    return arr[i];

                } else {

                    arr[i].setClassification("Striver");
                    return arr[i];

                }
            }
        }

        return null;
    }

    public static int findAvgVoyagesByPct(NavelVessel arr[], int perc) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // Calculate percentage
            int percentage = ((arr[i].getNoOfVoyagesCompleted() * 100) / arr[i].getNoOfVoyagesPlanned());

            if (percentage >= perc) {
                sum += arr[i].getNoOfVoyagesCompleted();
                count++;
            }

        }

        return sum / count;

    }
}

class NavelVessel {

    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public int getVesselId() {
        return vesselId;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public String getVesselName() {
        return this.vesselName;
    }

    public int getNoOfVoyagesCompleted() {
        return this.noOfVoyagesCompleted;
    }

    public int getNoOfVoyagesPlanned() {
        return this.noOfVoyagesPlanned;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    };

    public String getClassification() {
        return this.classification;
    }

    NavelVessel(int id, String name, int planned, int comp, String purpose) {

        this.vesselId = id;
        this.vesselName = name;
        this.noOfVoyagesPlanned = planned;
        this.noOfVoyagesCompleted = comp;
        this.purpose = purpose;
    }

}