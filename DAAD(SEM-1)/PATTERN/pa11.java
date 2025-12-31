import java.util.*;
public class pa11
{
    public static void main(String args[])
    {
    int n,i,j,k;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number:");
    n=sc.nextInt();
    for(i=n;i>=1; i--)
    {
	 if(i%2==1)k=1;
         else k=i; 
         for(j=1;j<=i; j++) 
         {
             System.out.print(k ); 
	     if(i%2==1)k++;
             else k--;            
         }
         System.out.println( ); 
    }
    }
    }
