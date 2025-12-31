//parameterised function
import java.util.*;
public class fnbs29
{
    void input()
    {
        double r=(21-14);
        double ar,cr,cir,area;
        Scanner sc=new Scanner(System.in);
        area=cal1(r);
        cir=cal2(r);
        System.out.println("\n area="+area+"\n circumference="+cir);
    }
    double cal1(double r)
    {
        double ar=3.14*r*r;
        return ar;
    }
    double cal2(double r)
    {
        double cr=2*3.14*r;
        return cr;
    }
}
