//parameterised function
import java.util.*;
public class fnlop15
{
    void input()
    {
        int n,n1=0,i,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        System.out.println("\n fibonaci series:"+n1+"\t"+n2); 
        fibonaci(n);
    }
     void fibonaci (int n)
    {
        int i,n1=0,n2=1,n3;
        for(i=2;i<=n;i++)
        {
            n3=n1+n2;
            System.out.println("\n:"+n3); 
            n1=n2;
            n2=n3;
        }
    }
}
