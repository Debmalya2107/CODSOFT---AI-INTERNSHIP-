import java.util.*;
public class p13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in centegrade degree : ");
		double c=sc.nextInt();
		double f=(9*c +160)/5;
		System.out.println("the temp in fahrenheit degree is=" +f);
	}
}

public class p14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in fahrenheit degree : ");
		double f=sc.nextInt();
		double c=(5*f-160)/9;
		System.out.println("the temp in centigrade degree is=" +c);
	}
}
