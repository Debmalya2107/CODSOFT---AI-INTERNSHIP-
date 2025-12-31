import java.util.*;
public class se2
{
    public static void main(String args[])
    {
    double n,i;
    double s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        double term=1/(4*i);
        s=s+term;
        System.out.print("1/"+(4*i) +"+");
    }
	System.out.println("\n sum of the series:"+s);
    }
}