//parameterised function with  return type
import java.util.*;
public class fnbs18
{
    void input()
    {
        double p,r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount:");
        p=sc.nextDouble();
        System.out.println("enter the rate:");
        r=sc.nextDouble();
        System.out.println("enter the time:");
        t=sc.nextDouble();
        si=cal1(p,r,t);
        System.out.println("\n the simple interest:"+si);
    }
    double cal1(double p,double r, double t)
    {
        double si=(p*r*t)/100;
        return si;
    }
    
}