import java.util.*;
public class ar3
{
    public static void main(String args[])
    {
        int n,i,f=0,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        n=sc.nextInt();
        int arr[]=new int[10]; 
    System.out.println("enter array element:");
    for(i=0;i<=n;i++)
    {
        System.out.print("ar["+i+"]=");     
        arr[i]=sc.nextInt();
    }
    System.out.println("enter search elements are:");
    s=sc.nextInt();
    for(i=0;i<=n;i++)
    {
        if(s==arr[i])
        {
            f=1;
            break;
        }
    }
        if(f==1)
         System.out.println(" search elements are found :");   
         else
         System.out.println(" search elements are not found :");   
    
}
}