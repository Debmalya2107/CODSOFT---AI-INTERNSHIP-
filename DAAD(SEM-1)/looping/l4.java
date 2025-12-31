import java.util.*;
public class l4
{
    public static void main(String args[])
    {
    int n,i,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=0;i<=10;i++)
    {
        s=n*i;
        System.out.println("\n multification:"+s);
    }
    }
}