import java.util.*;
public class ar16
{
	public static void main(String args[])
    	{
        	int i;
        	Scanner sc=new Scanner(System.in);
        	int c[]=new int[20];
        	int a[]=new int[10];
        	int b[]=new int[20];
        	System.out.println("input of a[i]\n:");
        	for(i=0;i<10;i++)
        	{
            		System.out.println("now the elemets of : a["+i+"]= ");
			a[i]=sc.nextInt();
	         }
            System.out.println("input of b[i]\n:");
            for(i=0;i<20;i++)
        {
             System.out.println("now the elemets of : b["+i+"]= ");
			b[i]=sc.nextInt();

	}
         for(i=0;i<10;i++)
        {
            c[i]=a[i]+b[i];
        }
       for(i=10;i<20;i++)
        {
            c[i]=b[i];
        }

        System.out.println("enter the array elements of c:"); 
       for(i=0;i<20;i++)
	{
               System.out.println("\n"+c[i]);
        }
    }
}
