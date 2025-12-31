import java.util.*;
public class l5
{
    public static void main(String args[])
    {
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
	if(n%i==0)        
        System.out.println("\n factors:"+i);
    }
   }
}