import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    // Constructor
    Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    // Getters for private fields
    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseAdmin() {
        return this.courseAdmin;
    }

    public int getQuiz() {
        return this.quiz;
    }

    public int getHandson() {
        return this.handson;
    }

}

public class courseProgram {

    public static int findAvgOfQuizByAdmin(Course arr[], String courseAdmin) {
        int size = arr.length;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i].getCourseAdmin().equals(courseAdmin)) {
                count++;
                sum += arr[i].getQuiz();
            }
        }

        if (sum != 0 && count != 0)
            return sum / count;
        else
            return 0;

    }

    public static Course[] sortCourseByHandsOn(Course arr[], int handson) {
        int n = arr.length;
        Course[] ans = new Course[n];
        int index = 0;

        // Populate ans array with courses that meet the hands-on condition
        for (int i = 0; i < n; i++) {
            if (arr[i].getHandson() < handson) {
                ans[index] = arr[i];
                index++;
            }
        }

        // If no elements meet the condition, return null
        if (index == 0) {
            return null;
        }

        // Create a new array that excludes null elements for sorting
        Course[] filteredAns = Arrays.copyOfRange(ans, 0, index);

        // Sort the filteredAns array based on the 'handson' value
        Arrays.sort(filteredAns, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return Integer.compare(c1.getHandson(), c2.getHandson()); // Sort by 'handson' value in ascending order
            }
        });

        return filteredAns;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course arr[] = new Course[4];

        for (int i = 0; i < 4; i++) {
            /*
             * Problem :
             * The issue is with reading input inside the loop, specifically with the way
             * you handle nextInt() and nextLine() in sequence. nextInt() does not consume
             * the newline character after the integer input, so when you use nextLine()
             * immediately after it, it reads the remaining newline instead of the actual
             * input.
             * 
             * Solution:
             * You need to add an extra nextLine() after reading nextInt() to consume the
             * newline character. This will prevent it from skipping the actual input for
             * courseName and courseAdmin.
             */

            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();

            arr[i] = new Course(courseId, courseName, courseAdmin, quiz, handson);

        }
        // sc.nextLine();
        String courseAdmin = sc.nextLine();
        int handson = sc.nextInt();

        int average = findAvgOfQuizByAdmin(arr, courseAdmin);

        if (average == 0)
            System.out.println("No Course found.");
        else {
            System.out.println(average);
        }

        Course ans[] = sortCourseByHandsOn(arr, handson);

        if (ans == null)
            System.out.println("No Course found with mentioned attribute.");
        else {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getCourseName());
            }
        }

        sc.close();

    }
}