import java.util.*;
public class ar1
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit: ");
		n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++)
		{
			System.out.print("ar["+i+"]=");
			ar[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(i=0;i<n;i++)
		{
			System.out.print("ar["+i+"]="+ar[i]);
		}
	}
}

		
	