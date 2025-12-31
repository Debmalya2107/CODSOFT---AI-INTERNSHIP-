import java.util.*;
public class l8
{
    public static void main(String args[])
    {
    int n,i,rev=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    int temp=n;
    while(n!=0)
    {
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
    }
        System.out.println("\n the reverse is:"+rev);
    if(rev==temp)
	System.out.println("\n the reverse is palindrome:"+temp);
    else
	System.out.println("\n the reverse is not a palindrome:"+temp);


    }
}
