//parameterised function with  return type
import java.util.*;
public class fnif6
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
            System.out.println("the number is a buzz number:"+n);
        }   
        else
        {
            System.out.println("the num is not a buzz number:"+n);
        }
        
    }
    int display1(int n)
    {
         int f=0;
         if(n%7==0 && n%10==7)
             f=1;
         else 
             f=2;
         return f;
    }
    
}
