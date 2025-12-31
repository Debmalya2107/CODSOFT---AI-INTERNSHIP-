//parameterised function
import java.util.*;
public class fnloop11return
{
    void input()
    {
        int n,i,sq,rem,c,neon=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        c=neon(n);
        if(c==1)
            System.out.println("the number is a neon number:"+n);
        else
            System.out.println("the number is not a neon number:"+n);
    }
    int neon (int n)
    {
        int i,rem,neon=0;
        int temp=n;
        int sq=n*n;
        while(sq>0)
        {
            rem=sq%10;
            neon=neon+rem;
            sq=sq/10;
        }
        int f=0;
        if(neon==temp)
            f=1;
        else
            f=2;
        return f;
    }
    
    }

