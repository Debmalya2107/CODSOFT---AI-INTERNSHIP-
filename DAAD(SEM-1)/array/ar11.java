import java.util.*;
public class ar11
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        for(i=0;i<20;i++)
        {
            System.out.println("enter any 20 aarray elements:");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n all even array elements:");
          for(i=0;i<20;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("\n:"+arr[i]);
            }
        }
    }
}
        