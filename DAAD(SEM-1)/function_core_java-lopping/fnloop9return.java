//parameterised function with return type
import java.util.*;
public class fnloop9return
{
    void input()
    {
        int n,i,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        c=prime(n);
        if(c==1)
            System.out.println("the number is a prime number:"+n);
        else
            System.out.println("the number is not a prime number:"+n);
    }
    int prime(int n)
    {
        int i,f=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        return f;
    }
}
