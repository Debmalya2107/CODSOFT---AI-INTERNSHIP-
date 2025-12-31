//parameterised function
import java.util.*;
public class p2
{
    void input()
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
        cal(a,b);
    }
    void cal(int a, int b)
    {
        int c=a+b;
        display(c);
    }
    void display(int c)
    {
        System.out.println("Addition is: "+c);
    }
}