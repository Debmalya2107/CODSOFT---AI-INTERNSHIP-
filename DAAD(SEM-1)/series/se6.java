import java.util.*;
public class se6
{
    public static void main(String args[])
    {
    double n,i;
    double sum1=1, sum2=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=2;i<=n;i++)
    {
        sum1=sum1+i;
        sum2=sum2+(double)1/(sum1);
    }
        System.out.println("\n sum of the series:"+sum2);
    }
    }
