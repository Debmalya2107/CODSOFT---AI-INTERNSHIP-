import java.util.*;
public class ar8
{
    public static void main(String args[])
    {
        int i,n,min,max,sum=0;
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int a[]=new int[50];
        System.out.println("input the limit:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           System.out.println("input the number of array:");
           ar[i]=sc.nextInt();
        }
        min=ar[0];
        max=ar[0];
        for(i=0;i<n;i++)
        {
         if(max<ar[i])
            max=ar[i];
         if(min>ar[i])
           }
	 sum=sum+ar[i];
         System.out.println(" minimum value :"+min);
         System.out.println(" maximum value :"+max);
         System.out.println(" sum value :"+sum);

}
}

