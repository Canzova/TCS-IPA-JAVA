import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getScore() {
        return score;
    }

    public boolean getdayScholar() {
        return dayScholar;
    }

    Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

}

public class Solution {

    public static int findCountOfDayscholarStudents(Student[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getdayScholar() == true && arr[i].getScore() > 80)
                count++;

        }
        return count == 0 ? 0 : count;
    }

    public static Student findStudentwithSecondHighestScore(Student[] arr) {

        ArrayList<Student> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getdayScholar() == false) {
                ans.add(arr[i]);
            }
        }

        Collections.sort(ans, (a, b) -> {
            return Double.compare(a.getScore(), b.getScore());
        });

        int n = ans.size();
        return n == 0 ? null : ans.get(n - 2);

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        Student arr[] = new Student[4];

        for (int i = 0; i < 4; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            // sc.nextLine();
            boolean dayScholar = sc.nextBoolean();
            // sc.nextLine();

            Student obj = new Student(rollNo, name, branch, score, dayScholar);
            arr[i] = obj;
        }

        int count = findCountOfDayscholarStudents(arr);
        if (count == 0) {
            System.out.println("There are no such dayscholar students");
        } else {
            System.out.println(count);
        }

        Student ans = findStudentwithSecondHighestScore(arr);

        if (ans == null) {
            System.out.println("There are no student from non day scholar");
        } else {
            System.out.println(ans.getRollNo() + "#" + ans.getName() + "#" + ans.getScore());
        }

        sc.close();
    }
}