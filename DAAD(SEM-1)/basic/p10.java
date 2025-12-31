import java.util.*;
public class p10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int l=sc.nextInt();
		System.out.println("Enter breath: ");
		int b=sc.nextInt();
		int area=l*b;
		int parameter=2*(l+b);
		System.out.println("rectangle area is=" +area);
		System.out.println("rectangle parameter is=" +parameter);
	}
}