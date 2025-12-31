import java.util.*;
public class ar20
{
	public static void main(String args[])
    	{
        	int n,i,j,p=1;
		int ar[]=new int[10];
        	Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a limit:");
		n=sc.nextInt();
		System.out.println("enter array number "); 
              	for(i=0;i<n;i++)
        	{
			System.out.println("\n "+ar[i]);
        	}
		for(i=0;i<n;i++)
        	{
			int c=0;
			for(j=1;j<ar[i];j++)
			{
				if(ar[i]%j==0)
					c=c+1;
			}
			if(c==2)
				int co=co+1;
		}
		System.out.println("\n number of prime:"+co); 
}
}

		