import java.util.*;
public class se12
{
    public static void main(String args[])
    {
    double n,i,j,x,fact;
    double sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number for length:");
    n=sc.nextInt();
    System.out.println("enter x value:");
    x=sc.nextInt();
    for(i=2; i<n; i+=2)
    {
        fact=1;
        for(j=1;j<=x+i;j++)
	{ 
		fact=fact*j;
	}
		sum=sum+Math.pow(x,i)/fact;
		m+=5;
	}
   System.out.println("sum of the series:"+sum);
}
}
    		