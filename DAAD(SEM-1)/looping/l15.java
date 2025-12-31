import java.util.*;
public class l15
{
    public static void main(String args[])
    {
    int n,i,t1=0,t2=1,nextnum;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    System.out.println("\n fibonacci series is:");
    for(i=3;i<=n;i++)
    {
        nextnum=t1+t2;
        System.out.println("\n nextterm:"+nextnum);
        t1=t2;
        t2=nextnum;
    }
    }
}