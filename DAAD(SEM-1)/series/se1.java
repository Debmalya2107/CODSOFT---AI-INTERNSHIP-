import java.util.*;
public class se1
{
    public static void main(String args[])
    {
    int n,i,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        s=s+i;
	System.out.print("\n the series is :"+i);
    }
	System.out.println("\n sum of the series:"+s);
    }
}