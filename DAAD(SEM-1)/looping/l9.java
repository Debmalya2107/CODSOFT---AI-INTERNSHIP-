import java.util.*;
public class l9
{
    public static void main(String args[])
    {
    int f=0,n,i,rev=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			f+=1;
			break;
		}
	}    
    if(f==0)
	System.out.println("\n this is a prime number:");
    else
	System.out.println("\n this is not a prime number:");


    }
}
