import java.util.*;
public class l2 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER A LIMIT:");
    int n=sc.nextInt();
    System.out.println(" ENTER A EVEN NUMBER :");
    for(int i=0; i<n;i++)
    {
	if(i%2==0)
	System.out.println("\t:"+i);
    }
    System.out.println("ENTER A ODD NUMBER :");
    for(int i=0; i<n;i++)
    {
	if(i%2==1)
	System.out.println("\t:"+i);
    }
   }
   }