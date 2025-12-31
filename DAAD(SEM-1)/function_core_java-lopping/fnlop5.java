//parameterised function
import java.util.*;
public class fnlop5
{
     void input()
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        factors(n);
    }
    void factors (int n)
    {
        int i;
        for(i=1;i<=n;i++)
        {
             if(n%i==0)
             {
                System.out.println("\n factors:"+i); 
             }
        }
    }
}
