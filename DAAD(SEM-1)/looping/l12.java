import java.util.*;
public class l12
{
    public static void main(String args[])
    {
    int n,i,sum=0,mul=1,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    while(n!=0)
    {
	rem=n%10;
	sum=sum+rem;
	mul=mul*rem;	
	n=n/10;
    }
    if(sum==mul)
	System.out.println("\n this is a spy number" );
    else
	System.out.println("\n this is not a spy number");


    }
}
