import java.util.*;
public class p9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swaping: a=" +a);
		System.out.println("after swaping: b=" +b);
	}
}