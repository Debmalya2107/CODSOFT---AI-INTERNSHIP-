import java.util.*;
public class pa5
{
    public static void main(String args[])
    {
    int n,i,j,P=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
             System.out.print("\n"+P);  
             P=P*11;
         }
    }
    }
