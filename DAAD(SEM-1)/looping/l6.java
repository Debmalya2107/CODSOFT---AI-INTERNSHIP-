import java.util.*;
public class l6
{
    public static void main(String args[])
    {
    int n,i,f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        f=f*i;
    }
        System.out.println("\n factorial:"+f);
    }
}
