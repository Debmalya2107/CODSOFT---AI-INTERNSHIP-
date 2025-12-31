import java.util.*;
public class pa6
{
    public static void main(String args[])
    {
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    int n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
         for(j=1;j<=i;j++) 
         {
             System.out.print("*");            
         }
         System.out.println("\n"); 
    }
    }
    }
