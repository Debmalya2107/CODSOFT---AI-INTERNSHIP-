import java.util.*;
public class pa4
{
    public static void main(String args[])
    {
    char n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.next().charAt(0);
    for(i='A';i<=n;i++)
    {
         for(j='A';j<=i;j++) 
         {
             System.out.print( i);            
         }
         System.out.println("\n"); 
    }
    }
    }
