import java.util.*;
public class l1 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER A LIMIT:");
    int n=sc.nextInt();
    System.out.println(" using FOR LOOP :");
    for(int i=0; i<n;i++)
    {
	System.out.println("\t:"+i);
    }
    System.out.println(" using WHILE LOOP :");
    int j=0;
    while(j<n)
    {
         System.out.println("\t: "+j);
         j++;
    }
    System.out.println(" using DO WHILE LOOP :");
    int k=0;  
    do
    {
	System.out.println("\t : "+k);
        k++;
    }while(k<n);
   }
   }