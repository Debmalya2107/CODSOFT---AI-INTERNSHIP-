import java.util.*;
public class pa9
{
    public static void main(String args[])
    {
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number:");
    n=sc.nextInt();
    for(i=n;i>=1; i--)
    {
         for(j=n;j>=i; j--) 
         {
             System.out.print(i );            
         }
         System.out.println( ); 
    }
    }
    }
