//parameterised function with  return type
import java.util.*;
public class fnbs10
{
    void input()
    {
        int l,b,ar,pr;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length:");
        l=sc.nextInt();
        System.out.println("enter the breath:");
        b=sc.nextInt();
        fnbs10 obj=new fnbs10();
        ar=cal1(l,b);
        System.out.println("\n then area is:"+ar);
        pr=cal2(l,b);
        System.out.println("\n then perimeter is:"+pr);
    }
    int cal1(int l, int b)
    {
        int ar=l*b;
            return ar;
    }
    int cal2(int l, int b)
    {
        int pr=2*(l+b);
            return pr;
    }
    
}
