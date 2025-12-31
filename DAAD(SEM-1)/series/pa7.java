import java.util.*;
public class pa7
{
    public static void main(String args[])
    {
    int n,i,j,r=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
	     for(j=1;j<=i;j++)
 	{
             System.out.print(r+" ");  
             r++;
         }
	System.out.println(); 

   }	
    }
    }
