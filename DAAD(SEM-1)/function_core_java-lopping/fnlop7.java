//parameterised function
import java.util.*;
public class fnlop7
{
    void input()
    {
        int n,i,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        reverse(n);
    }
    void reverse (int n)
    {
        int i,rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("\n reverse:"+rev); 
    }
}
