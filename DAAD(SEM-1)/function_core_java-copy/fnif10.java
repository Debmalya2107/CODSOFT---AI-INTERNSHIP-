//parameterised function with  return type
import java.util.*;
public class fnif10
{
    void input()
    {
        int a=0,b=0,c=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st angle:");
        a=sc.nextInt();
        System.out.println("enter 2nd angle:");
        b=sc.nextInt();
        System.out.println("enter 3rd angle:");
        c=sc.nextInt();
        int p=display1(a,b,c);
        if(p==1)
           System.out.println("equilateral");
        else if(p==2)
            System.out.println("isoscels");
        else if(p==3)
            System.out.println("scalene");
        else
            System.out.println("invalid");
    }
    int display1(int a,int b,int c)
    {
        int sum=0,f=0;
        sum=a+b+c;
        if(sum==180)
         {
            if(a==b && b==c && c==a)
                 f=1;
            else if(a==b || b==c ||c==a)
                 f=2;
            else
                 f=3;
         } 
        else
            f=4;
        return f;
    }
    }

    