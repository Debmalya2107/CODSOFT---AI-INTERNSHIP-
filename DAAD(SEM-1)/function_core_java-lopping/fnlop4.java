//parameterised function
import java.util.*;
public class fnlop4
{
    void input()
    {
        int n,i,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        multi(n);
    }
    void multi(int n)
    {
        int i,s=0;
        for(i=0;i<10;i++)
        {
             s=n*i;   
             System.out.println("\n multiply the number:"+n+"*"+i+"="+s);
        }
        
    }
}
