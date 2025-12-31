import java.util.*;
public class p6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first sub: ");
		int a=sc.nextInt();
		System.out.println("Enter second sub: ");
		int b=sc.nextInt();
		System.out.println("Enter third sub: ");
		int c=sc.nextInt();
		System.out.println("Enter forth sub: ");
		int d=sc.nextInt();
		System.out.println("Enter fifth sub: ");
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		int avg=sum/5;
		System.out.println("Additon is: "+sum);
		System.out.println("avarage is: "+avg);
	}
}