import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel arr[] = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int hotelId = sc.nextInt();
            sc.nextLine();

            String hotelName = sc.nextLine();

            String dateOfBooking = sc.nextLine();

            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();

            String wifiFacility = sc.nextLine();

            double totalBill = sc.nextDouble();
            sc.nextLine();

            Hotel obj = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);

            arr[i] = obj;

        }

        String month = sc.nextLine();
        String wifiOption = sc.nextLine();

        int count = noOfRoomsBookedInGivenMonth(arr, month);

        if (count == 0) {
            System.out.println("No rooms booked in the given month");
        } else {
            System.out.println(count);
        }

        sc.close();
    }

    public static int noOfRoomsBookedInGivenMonth(Hotel arr[], String month) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String date[] = arr[i].getDateOfBooking().split("-");

            // Getting month
            String Month = date[1];

            if (Month.equals(month)) {
                count += arr[i].getNoOfRoomsBooked();
            }
        }

        return count;
    }

    public void Hotel

    searchHotelByWifiOption(Hotel arr[], String wifiOption){

        ArrayList<Hotel>tempAns = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getWifiFacility().equals(wifiOption)){
                tempAns.add(arr[i]);
            }
        }

     



        return null;
    }

}

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    // Constructor

    Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility,
            double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    // Setters

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    // Getters
    public int getHotelid() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

}