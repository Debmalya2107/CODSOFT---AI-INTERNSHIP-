import java.util.*;
public class l17
{
    public static void main(String args[])
    {
    int n1,n2,i,gcdnum=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st number:");
    n1=sc.nextInt();
    System.out.println("enter 2nd number:");
    n2=sc.nextInt();
    for(i=1;i<=n1 && i<=n2;i++)
    {
        if(n1%i==0 && n2%i==0)
        {
            gcdnum=i;
        }
    }
        System.out.println("\n gcd of two numbers is:"+gcdnum);
    
    }
}