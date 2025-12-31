import java.util.*;
public class se8
{
    public static void main(String args[])
    {
    double n,i;
    double sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        double term=i*i*i;
        sum=sum+term;
        System.out.print("\t"+(int)term +",");
    }
	System.out.println("\n sum of the series:"+sum);
    }
}