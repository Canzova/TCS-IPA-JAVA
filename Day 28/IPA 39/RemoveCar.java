import java.util.*;

public class RemoveCar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Car arr[] = new Car[5];

        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String type = sc.nextLine();

            Car obj = new Car(id, name, type);

            arr[i] = obj;
        }

        int id = sc.nextInt();
        Car results[] = RemoveAndRearrange(arr, id);

        if (results == null) {
            System.out.println("There are no car with given id");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i].getCarId() + " : " + results[i].getCarName());
            }
        }

        sc.close();
    }

    public static Car[] RemoveAndRearrange(Car arr[], int id) {
        ArrayList<Car> tempAns = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCarId() != id)
                tempAns.add(arr[i]);
            else {
                found = true;
            }
        }

        if (found == false)
            return null;

        int n = tempAns.size();
        int currId = arr[0].getCarId();
        for (int i = 0; i < n; i++) {
            Car curr = tempAns.get(i);
            curr.setCarId(currId);
            currId++;
        }
        Car ans[] = tempAns.toArray(new Car[n]);

        return ans;
    }
}

class Car {
    private int carId;
    private String carName;
    private String fuelType;

    public int getCarId() {
        return this.carId;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarId(int id) {
        this.carId = id;
    }

    Car(int id, String name, String type) {
        this.carId = id;
        this.carName = name;
        this.fuelType = type;
    }
}