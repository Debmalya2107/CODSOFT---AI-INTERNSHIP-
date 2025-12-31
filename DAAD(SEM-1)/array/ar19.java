import java.util.*;
public class ar19
{
	public static void main(String args[])
    	{
        	int i,j,p=1;
		int arr[]=new int[25];
        	Scanner sc=new Scanner(System.in);
              	for(i=0;i<25;i++)
        	{
			System.out.println("enter a number "); 
			arr[i]=sc.nextInt();
        	}
        		System.out.println("\n product of all odd subcripted");
		for(j=1;j<25;j+=2)
        	{
			p=p*arr[j];        	
		}
		System.out.println("\n "+p); 
}
}
		