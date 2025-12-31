//parameterised function with  return type
import java.util.*;
public class fnbs14
{
    void input()
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temp of fahrenheit:");
        f=sc.nextDouble();
        c=cal1(f);
        System.out.println("\n the tempreture in centigrade :"+c);
    }
    double cal1(double f)
    {
        double c=(5f+160)/9;
        return c;
    }
    
}
