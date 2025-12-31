//parameterised function
import java.util.*;
public class fnloop12ret
{
    void input()
    {
        int n,i,sq,rem,c,neon=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        c=spy(n);
        if(c==1)
            System.out.println("the number is a spy number:"+n);
        else
            System.out.println("the number is not a spy number:"+n);
    }
    int spy (int n)
    {
        int i,rem,sum=0,mul=1;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            mul=mul*rem;
            n=n/10;
        }
        int f=0;
        if(sum==mul)
            f=1;
        else
            f=2;
        return f;
    }
    
    }

