import java.util.*;
public class l16
{
    public static void main(String args[])
    {
    int n,i,sum=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    System.out.println("\n factors series is:");
    for(i=1;i<n;i++)
    {
        rem=n%i;
        if(rem==0)
        {
            System.out.println("\n"+i);
            sum=sum+i;
        }
    }
    System.out.println("\n sum of factors is:"+sum);
    if(sum==n)
        {
            System.out.println("\n the number is a perfect number:"+n);
        }
    else
        {
            System.out.println("\n the number is not a perfect number:"+n);
        }
    }
}