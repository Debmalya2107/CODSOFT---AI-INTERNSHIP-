//parameterised function
import java.util.*;
public class fnba31
{
    void input()
    {
        double l,p,ld,pd;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter laptop price:");
        l=sc.nextDouble();
        System.out.println("enter printer price:");
        p=sc.nextDouble();
        display(l,p);
    }
    void display(double l, double p)
    {
        double ld=(l*15)/100;
        double pd=(p*10)/100;
        System.out.println("\n the discount of laptop:"+ld+"\nthe discount printer:"+pd);
    }
}
