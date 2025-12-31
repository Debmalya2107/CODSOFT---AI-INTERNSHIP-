// default constructor & parameterised constructor 
import java.util.*;
public class p1 
{
    int x,y,c;
    p1()//default constructor
    {
        c=0;
    }
    p1(int a, int b)//perameterised constructor
    {
        x=a;
        y=b;
    }
    void multification()
    {
        c=x*y;
        System.out.println("MULTIFICATION is:"+c);
    }
    public static void main(System args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first no:");
        int a=sc .nextInt();
        System.out.println("enter 2nd no:");
        int b=sc .nextInt();
        p1 obj =new p1(a,b);
        obj.multification();
    }
}
