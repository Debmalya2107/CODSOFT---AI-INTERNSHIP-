import java.util.*;
public class se13
{
    public static void main(String args[])
    {
    double n,i;
    double a=2,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(i%2==0)
            sum=sum-a;
        else
            sum=sum+a;
            a+=2;
        }
        System.out.println("\n sum of the value:"+sum);
    }
    }
