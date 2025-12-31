//parameterised function with  return type
import java.util.*;
public class fnif2
{
    void input()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        n=sc.nextInt();
        int p=display1(n);
        if(p==1)
        {
            System.out.println("the number is even:"+n);
        }   
        else
        {
            System.out.println("the number is odd:"+n);
        }
        
    }
    int display1(int n)
    {
         int f=0;
         if(n%2==0)
             f=1;
         else 
             f=2;
         return f;
    }
    
}
