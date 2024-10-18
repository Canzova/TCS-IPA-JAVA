
import java.util.*;


public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        double p1x = sc.nextDouble();
        double p1y = sc.nextDouble();
        
        Point p1 = new Point(p1x, p1y);
        
        double p2x = sc.nextDouble();
        double p2y = sc.nextDouble();
        
        Point p2 = new Point(p2x, p2y);
        
        double p3x = sc.nextDouble();
        double p3y = sc.nextDouble();
        
        Point p3 = new Point(p3x, p3y);
        
        Point ans = pointWithHighestOriginDistance(p1, p2, p3);
        System.out.println(ans.getX());
        System.out.println(ans.getY());
        
        sc.close();
    }
    
    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3){
        
        double dist1 = Math.sqrt((Math.pow(Math.abs(p1.getX()), 2) + Math.pow(Math.abs(p1.getY()), 2)));
        double dist2 = Math.sqrt((Math.pow(Math.abs(p2.getX()), 2) + Math.pow(Math.abs(p2.getY()), 2)));
        double dist3 = Math.sqrt((Math.pow(Math.abs(p3.getX()), 2) + Math.pow(Math.abs(p3.getY()), 2)));
        
        
        double ans = Math.max(dist1, (Math.max(dist2, dist3)));
        
        if(ans == dist1) return p1;
        else if(ans == dist2) return p2;
        else return p3;
    }
}

class Point
{
    private double x;
    private double y;
    
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}