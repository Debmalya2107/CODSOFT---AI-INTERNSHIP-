import java.util.*;
public class ar14
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int b[]={31,29,31,30,31,30,31,31,30,31,30,31};
        System.out.println("enter a year:");
        n=sc.nextInt();
        for(i=0;i<12;i++)
        {
		if(n%4==0)
			sum=sum+b[i];
		else
			sum=sum+a[i];
	}
	System.out.println("so the total number of the days :" +sum);
}
}