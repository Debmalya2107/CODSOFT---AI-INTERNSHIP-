import java.util.*;
public class f6
{
    private double side1, side2, radius;

    public f6 (double s1, double s2) {
        side1 = s1;
        side2 = s2;
        radius = 0; // Constructor 
    }

    public f6 (double r) {
        radius = r;
        side1 = 0; // Constructor
        side2 = 0;
    }

    public double rectArea() {
        double area= side1 * side2;
        return area;
    }

    public double circArea() {
        double pi = 3.14;
        double area=pi * radius * radius;
        return area;
    }

    // main() method
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a side  for calculate rectangle  ");
        double s1=sc .nextDouble();
        System.out.println("enter a side  for calculate rectangle  ");
        double s2=sc .nextDouble();
        
        System.out.println("enter a radius  for calculate circle");
        double r=sc .nextDouble();
        

        f6 rect = new f6(s1, s2);
        System.out.println("Area of Rectangle: " +rect.rectArea());

        
        f6 circle = new f6(r);
        System.out.println("Area of Circle: " + circle.circArea());

        sc.close();
    }     
}