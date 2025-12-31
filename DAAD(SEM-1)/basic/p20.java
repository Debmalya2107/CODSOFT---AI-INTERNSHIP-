import java.util.*;
public class p20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st integer : ");
		double a=sc.nextInt();
		System.out.println("Enter the 2nd integer : ");
		double b=sc.nextInt();
		double r=a%b;
		System.out.println("now the remainder is=" +r);
	}
}