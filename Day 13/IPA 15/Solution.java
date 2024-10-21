import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details of 4 hotels
        Hotel arr[] = new Hotel[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String date = sc.nextLine();
            int no = sc.nextInt(); sc.nextLine();
            String wifi = sc.nextLine();
            double bill = sc.nextDouble();
            Hotel obj = new Hotel(id, name, date, no, wifi, bill);
            arr[i] = obj;
        }
        sc.nextLine();

        // Input month to check bookings
        String month = sc.nextLine();

        // Input Wi-Fi option to search
        String wifi = sc.nextLine();

        // Find number of rooms booked in the given month
        int count = noOfRoomsBookedInGivenMonth(arr, month);
        if (count == 0) {
            System.out.println("No rooms booked in the given month");
        } else {
            System.out.println(count);
        }

        // Find hotel with second-highest bill for the specified Wi-Fi option
        Hotel ans = searchHotelByWifiOption(arr, wifi);
        if (ans == null) {
            System.out.println("No such option available");
        } else {
            System.out.println(ans.getHotelId());
        }
        
        sc.close();
    }

    // Method to count rooms booked in the given month
    public static int noOfRoomsBookedInGivenMonth(Hotel arr[], String month) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDateOfBooking().split("-")[1].equalsIgnoreCase(month)) {
                count += arr[i].getNoOfRoomsBooked();
            }
        }
        return count;
    }

    // Method to search hotels by Wi-Fi option and return the second-highest bill
    public static Hotel searchHotelByWifiOption(Hotel arr[], String wifi) {
        ArrayList<Hotel> tempAns = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getWifiFacility().equalsIgnoreCase(wifi)) {
                tempAns.add(arr[i]);
            }
        }
        if (tempAns.size() == 0) return null;

        // Sort by total bill
        Collections.sort(tempAns, (a, b) -> {
            return Double.compare(a.getTotalBill(), b.getTotalBill());
        });

        // Return second-highest bill hotel
        int n = tempAns.size();
        return tempAns.get(n - 2);
    }
}

// Hotel class
class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public int getNoOfRoomsBooked() {
        return this.noOfRoomsBooked;
    }

    public double getTotalBill() {
        return this.totalBill;
    }

    public String getWifiFacility() {
        return this.wifiFacility;
    }

    public String getDateOfBooking() {
        return this.dateOfBooking;
    }

    public int getHotelId() {
        return this.hotelId;
    }

    // Constructor
    Hotel(int id, String name, String date, int no, String wifi, double bill) {
        this.hotelId = id;
        this.hotelName = name;
        this.dateOfBooking = date;
        this.noOfRoomsBooked = no;
        this.wifiFacility = wifi;
        this.totalBill = bill;
    }
}
