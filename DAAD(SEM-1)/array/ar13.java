import java.util.*;
public class ar13
{
    public static void main(String args[])
    {
        int l,i,n;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
	 System.out.println("entee the number of the year:");
            l=sc.nextInt();

        for(i=0;i<l;i++)
        {
            System.out.println("enter a year to start searching the leap year:");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n all the leap year are :");
          for(i=0;i<l;i++)
        {
            if(arr[i]%4==0)
            {
                System.out.println("\n:"+arr[i]);
            }
        }
    }
}
        