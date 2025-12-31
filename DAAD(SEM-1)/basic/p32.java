import java.util.*;
public class p32
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days: ");
		double d=sc.nextDouble();
		double y=d/365;
		double x=d%365;
		double m=x/30;
		double n=x%30;
		System.out.println("now the number of years is=" +y);
		System.out.println("now the number of months is=" +m);
		System.out.println("now the number of days is=" +d);


	}
}