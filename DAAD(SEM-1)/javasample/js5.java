import java.io.*;
import java.util.*;
class js5
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int n,p,i=0,rev,res,s=0,sum=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        p=n;
        while(p>0)
        {
            rev=p%10;
            s=s*10+rev;
            p=p/10;
        }
        while(s>0)
        {
            res = s%10;
            i++;
            sum=sum+(int)Math.pow(res,i);;
            s=s/10;
        }
        if(sum==n)
        {
            System.out.println("yes it is a disarium number!");
        }
        else
        {
            System.out.println("No it is not a disarium number!");
        }
    }
}