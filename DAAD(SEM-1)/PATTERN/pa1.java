import java.util.*;
public class pa1
{
    public static void main(String args[])
    {
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number:");
    n=sc.nextInt();
    for(i=n;i>=1; i--)
    {
         for(j=i ;j<=n; j++) 
         {
             System.out.print( j );            
         }
         System.out.println( ); 
    }
    }
    }
