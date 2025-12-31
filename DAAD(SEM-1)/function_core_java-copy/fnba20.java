//parameterised function
import java.util.*;
public class fnba20
{
    void input()
    {
        int R,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st integers:");
        a=sc.nextInt();
        System.out.println("enter 2nd integers:");
        b=sc.nextInt();
        display(a,b);
    }
    void display(int a, int b)
    {
        int R=a%b;
        System.out.println("\n the remainder is:"+R);
    }
}
