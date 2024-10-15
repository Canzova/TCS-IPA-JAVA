import java.util.*;

class Motel {
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility,
            double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public String getCabFacility() {
        return cabFacility;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getMotelId() {
        return motelId;
    }

    public String getMotelName() {
        return motelName;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public double getTotalBill() {
        return totalBill;
    }

}

public class Solution {

    public static int totalNoOfRoomsBooked(Motel[] arr, String cabFacility) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCabFacility().equals(cabFacility) && arr[i].getNoOfRoomsBooked() > 5) {
                count += arr[i].getNoOfRoomsBooked();
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motel arr[] = new Motel[4];

        for (int i = 0; i < 4; i++) {
            int motelId = sc.nextInt();
            sc.nextLine();

            String motelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            Motel obj = new Motel(motelId, motelName, dateOfBooking, noOfRoomsBooked, cabFacility, totalBill);

            arr[i] = obj;
        }

        String cabFacility = sc.nextLine();

        int totalNoRooms = totalNoOfRoomsBooked(arr, cabFacility);

        if (totalNoRooms == 0) {
            System.out.println("No such rooms booked");
        } else {
            System.out.println(totalNoRooms);
        }

        sc.close();
    }
}