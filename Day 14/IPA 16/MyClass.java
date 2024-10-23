import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Employee arr[] = new Employee[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();

            boolean trans = sc.nextBoolean();

            Employee obj = new Employee(id, name, branch, rating, trans);

            arr[i] = obj;
        }
        // Consume the newline after calling nextInt(), nextDouble(), or nextBoolean()
        // before calling nextLine() to prevent input skipping.
        sc.nextLine();

        String branch2 = sc.nextLine();

        int count = findCountOfEmployeesUsingCompTransport(arr, branch2);

        if (count == 0) {
            System.out.println("No such Employees");
        } else {
            System.out.println(count);
        }

        Employee ans = findEmployeeWithSecondHighestRating(arr);
        if (ans == null) {
            System.out.println("All Employees using company transport");
        } else {
            System.out.println(ans.getEmployeeId());
            System.out.println(ans.getName());
        }

        sc.close();
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee arr[]) {
        double maxi_1 = -1, maxi_2 = -1;
        Employee maxEmp1 = null, maxEmp2 = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCompanyTransport() == false && arr[i].getRating() > maxi_1) {

                maxi_2 = maxi_1;
                maxEmp2 = maxEmp1;

                maxi_1 = arr[i].getRating();
                maxEmp1 = arr[i];
            } else if (arr[i].getRating() > maxi_2 && arr[i].getRating() != maxi_1) {
                maxi_2 = arr[i].getRating();
                maxEmp2 = arr[i];
            }
        }

        return maxEmp2;
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee arr[], String branch2) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCompanyTransport() == true && arr[i].getBranch().equals(branch2)) {
                count++;
            }
        }

        return count;
    }

}

class Employee {
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    public double getRating() {
        return this.rating;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getBranch() {
        return this.branch;
    }

    public boolean getCompanyTransport() {
        return this.companyTransport;
    }

    Employee(int id, String name, String branch, double rating, boolean trans) {
        this.employeeId = id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = trans;
    }
}