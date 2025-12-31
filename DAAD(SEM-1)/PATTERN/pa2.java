import java.util.*;
public class pa2
{
    public static void main(String args[])
    {
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number:");
    n=sc.nextInt();
    for(i=n;i>=1; i--)
    {
         for(j=1;j<=i; j++) 
         {
             System.out.print(j );            
         }
         System.out.println( ); 
    }
    }
    }
