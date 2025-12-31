//parameterised function with return type
import java.util.*;
public class p3
{
    void input()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
        c=cal(a,b);
        System.out.println("Addition is: "+c);
    }
    int cal(int a, int b)
    {
        int c=a+b;
        return c;
    }
}