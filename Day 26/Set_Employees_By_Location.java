/* Group the employees by city 

 * Input:
 * ----------------
 * Employee |      City
 * ---------------------
 * Arijit       Kolkata
 * Minaz        Mumbai
 * Rahul        Chennai
 * Rajesh       Kolkata
 * Sekhar       Chennai
 * Kasim        Chennai

 * Output:
 * ----------------
 * Kolkata: Arijit,Rajesh
 * Mumbai: Minaz
 * Chennai: Rahul,Sekhar,Kasim
 */

import java.util.*;

public class Set_Employees_By_Location {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees : ");
        int size = sc.nextInt();
        sc.nextLine();

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Employee name : ");
            String name = sc.nextLine();

            System.out.println("Enter Employee city : ");
            String city = sc.nextLine();

            map.put(name, city);
        }

        solve(map);

        sc.close();
    }

    public static void solve(LinkedHashMap<String, String> map) {
        LinkedHashMap<String, ArrayList<String>> updatedMap = new LinkedHashMap<>();

        for (Map.Entry<String, String> data : map.entrySet()) {
            String name = data.getKey();
            String city = data.getValue();

            // Check if the city already exists in the map
            updatedMap.putIfAbsent(city, new ArrayList<>()); // Create a new list if city is not already present
            updatedMap.get(city).add(name); // Add the name to the city's list
        }

        for (Map.Entry<String, ArrayList<String>> data : updatedMap.entrySet()) {
            int n = data.getValue().size();

            System.out.print(data.getKey() + ":");
            for(int i = 0; i < n; i++){
                System.out.print(data.getValue().get(i));
                if(i != n-1) System.out.print(",");
            }
            System.out.print("\n");
        }
    }
}
