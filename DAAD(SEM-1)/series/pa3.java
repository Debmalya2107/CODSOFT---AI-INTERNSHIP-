import java.util.*;
public class pa3
{
    public static void main(String args[])
    {
    char i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any CHARACTER :");
    char n=sc.next().charAt(0);
    for(i='A';i<=n; i++)
    {
         for(j='A';j<=i; j++) 
         {
             System.out.print( j);            
         }
         System.out.println("\n"); 
    }
    }
    }
