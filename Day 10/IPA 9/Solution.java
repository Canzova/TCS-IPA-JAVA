import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        Point p1 = new Point(x1, y1);
        
        int x2  = sc.nextInt();
        int y2 = sc.nextInt();
        
        Point p2 = new Point(x2, y2);
        
        // Correctly calculate the distance using the Euclidean formula
        double ans = findDistance(p1, p2);
        
        // Format the output to 3 decimal places
        System.out.format("%.3f", ans);
        
        sc.close();
    }
    
    // Calculate the Euclidean distance between two points
    public static double findDistance(Point p1, Point p2) {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        
        // Return the Euclidean distance
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

class Point {
    private int x;
    private int y;
    
    // Getter for x
    public int getX(){
        return this.x;
    }
    
    // Getter for y
    public int getY(){
        return this.y;
    }
    
    // Constructor to initialize x and y
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
