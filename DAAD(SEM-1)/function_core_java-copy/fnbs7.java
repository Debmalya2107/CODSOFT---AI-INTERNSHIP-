//parameterised function with  return type
import java.util.*;
public class fnbs7
{
    void input()
    {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        a=sc.nextInt();
        System.out.println("enter 2nd number:");
        b=sc.nextInt();
        c=cal1(a,b);
        System.out.println("\n after swap of the number a:"+c);
        d=cal2(a,b);
        System.out.println("\n after swap of the number b:"+d);
    }
    int cal1(int a, int b)
    {
        int c=a;
            a=b;
            b=c;
            return a;
    }
    int cal2(int a, int b)
    {
        int c=a;
            a=b;
            b=c;
            return b;
    }
}
