//parameterised function
import java.util.*;
public class fnlop6
{
    void input()
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        factorial(n);
    }
    void factorial (int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;   
            System.out.println("\n factorial:"+f); 
        }
    }
}
