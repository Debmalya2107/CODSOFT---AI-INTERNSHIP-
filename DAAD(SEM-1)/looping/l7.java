import java.util.*;
public class l7
{
    public static void main(String args[])
    {
    int n,i,rev=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    while(n!=0)
    {
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
    }
        System.out.println("\n the reverse is:"+rev);
    }
}
