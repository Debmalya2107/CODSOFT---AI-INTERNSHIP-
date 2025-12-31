import java.util.*;
public class l13
{
    public static void main(String args[])
    {
    int n,i,sum=0,fact,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    int temp=n;
    while(n>0)
    {
	rem=n%10;
	fact=1;
	for(i=1;i<=rem;i++)
   	 {
       		 fact=fact*i;
   	 }
		sum=sum+fact;
		n=n/10;
    }
    if(sum==temp)
	System.out.println("\n this is a special krishnomurti number" );
    else
	System.out.println("\n this is not a special krishnomurti number");


    }
}
