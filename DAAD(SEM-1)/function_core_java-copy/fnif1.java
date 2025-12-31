//parameterised function with  return type
import java.util.*;
public class fnif1
{
    void input()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        n=sc.nextInt();
        int p=display1(n);
        if(p==1)
           System.out.println("positive number:"+n);
        else if(p==2)
            System.out.println("nagetive number:"+n);
        else
            System.out.println("the number is nutral:"+n);
    }
    int display1(int n)
    {
         int f=0;
         if(n>0)
             f=1;
         else if(n<0)
             f=2;
         else 
             f=3;
            return f;
            
    }
    
}

    