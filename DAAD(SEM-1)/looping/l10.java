import java.util.*;
public class l10
{
    public static void main(String args[])
    {
    int n,i,arm=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    int temp=n;
    while(n!=0)
    {
	rem=n%10;
	arm=(rem*rem*rem)+arm;
	n=n/10;
    }
    if(arm==temp)
	System.out.println("\n this is a armstrong number :"+temp);
    else
	System.out.println("\n this not a armstrong number:"+temp);


    }
}
