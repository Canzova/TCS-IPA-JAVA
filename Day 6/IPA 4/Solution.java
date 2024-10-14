import java.util.*;

class College {
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    public String getAddress() {
        return address;
    }

    public int getContactNo() {
        return contactNo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPinCode() {
        return pinCode;
    }

    College(int id, String name, int contactNo, String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

}

public class Solution {

    public static College findCollegeWithMaximumPincode(College arr[]) {

        College max = null;
        int mini = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPinCode() > mini) {
                mini = arr[i].getPinCode();
                max = arr[i];
            }
        }

        return max;
    }

    public static College searchCollegeByAddress(College arr[], String address) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAddress().equals(address)) {
                return arr[i];
            }
        }

        return null;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        College arr[] = new College[size];

        for (int i = 0; i < size; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int contactNo = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            int pinCode = sc.nextInt();

            College obj = new College(id, name, contactNo, address, pinCode);

            arr[i] = obj;
        }

        sc.nextLine();

        String address = sc.nextLine();

        College obj = findCollegeWithMaximumPincode(arr);

        if (obj == null) {
            System.out.println("No college found with mentioned attribute");
        } else {
            System.out.println("id-" + obj.getId());
            System.out.println("name-" + obj.getName());
            System.out.println("contactNo-" + obj.getContactNo());
            System.out.println("address-" + obj.getAddress());
            System.out.println("pincode-" + obj.getPinCode());
        }

        College obj2 = searchCollegeByAddress(arr, address);

        if (obj2 == null) {
            System.out.println("No college found with mentioned attribute");
        } else {
            System.out.println("id-" + obj2.getId());
            System.out.println("name-" + obj2.getName());
            System.out.println("contactNo-" + obj2.getContactNo());
            System.out.println("address-" + obj2.getAddress());
            System.out.println("pincode-" + obj2.getPinCode());
        }

        sc.close();
    }
}