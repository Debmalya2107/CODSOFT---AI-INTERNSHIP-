import java.util.*;
public class ar2
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        n=sc.nextInt();
        int ar[]=new int[10]; 
    System.out.println("enter array element:");
    for(i=0;i<=n;i++)
    {
        System.out.print("ar["+i+"]=");     
        ar[i]=sc.nextInt();
    }
    System.out.println("Array elements are:");
    for(i=0;i<=n;i++)
    {
        System.out.println("ar["+i+"]="+ar[i]);
        sum=sum+ar[i];
    }
    System.out.println("sum of the array:"+sum);
}
}