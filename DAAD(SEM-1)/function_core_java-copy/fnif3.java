//parameterised function with  return type
import java.util.*;
public class fnif3
{
     void input()
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any year:");
        y=sc.nextInt();
        int p=display1(y);
        if(p==1)
        {
            System.out.println("the year is leap year:"+y);
        }   
        else
        {
            System.out.println("the year is not a leap year:"+y);
        }
        
    }
    int display1(int y)
    {
         int f=0;
         if(y%4==0)
             f=1;
         else 
             f=2;
         return f;
    }
   
}
