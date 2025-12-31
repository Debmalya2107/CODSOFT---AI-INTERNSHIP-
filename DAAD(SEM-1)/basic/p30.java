import java.util.*;
public class p30
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		double p=sc.nextInt();
		System.out.println("Enter the time : ");
		double t=sc.nextInt();
		System.out.println("Enter the rate : ");
		double r=sc.nextInt();
		double simpleinterest=(p*r*t)/100;
		double compoundinterest= Math.sqrt(p*Math.pow((1+r/100),t));
		System.out.println("now the simple interest is=" +simpleinterest);
		System.out.println("now the compound interest is=" +compoundinterest);

	}
}