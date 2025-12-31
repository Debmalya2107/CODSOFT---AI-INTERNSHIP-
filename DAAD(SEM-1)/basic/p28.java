import java.util.*;
public class p28
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int l=sc.nextInt();
		System.out.println("Enter breath: ");
		int b=sc.nextInt();
		double area=l*b;
		double parameter=2*(l+b);
		double diagonal=Math.sqrt((l*l)+(b*b));
		System.out.println("rectangle area is=" +area);
		System.out.println("rectangle parameter is=" +parameter);
		System.out.println("rectangle diagona; is=" +diagonal);

	}
}