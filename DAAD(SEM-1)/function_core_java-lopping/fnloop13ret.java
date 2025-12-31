//parameterised function
import java.util.*;
public class fnloop13ret
{
    void input()
    {
        int n,i,sum=0,factorial,f=1,c,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        c=special(n);
        if(c==1)
            System.out.println("the number is a special number:"+n);
        else
            System.out.println("the number is not a special number:"+n);
    }
    int special (int n)
    {
        int i,factorial,sum=0,rem;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            factorial=1;
        for(i=1;i<=rem;i++)
        {
            factorial=factorial*i;
        }
        sum=sum+factorial;
        n=n/10;
        }
        int f=0;
        if(sum==temp)
            f=1;
        else
            f=2;
        return f;
        }
    
    }

