//parameterised function with  return type
import java.util.*;
public class fnif4
{
    void input()
    {
        int n1,n2,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        n1=sc.nextInt();
        System.out.println("enter 2nd number:");
        n2=sc.nextInt();
        int p=display1(n1,n2);
        if(p==1)
           System.out.println("1st number is largest:"+n1);
        else 
            System.out.println("2nd number is largest:"+n2);
    }
    int display1(int n1,int n2)
    {
         int f;
         if(n1>n2)
             f=1;
         else 
             f=2;
         return f;
            
    }
    
}

    