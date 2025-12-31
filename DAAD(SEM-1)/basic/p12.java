import java.util.*;
public class p12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THE VALUE OF ONE SIDE : ");
		double s=sc.nextInt();
		double area=s*s;
		double perimeter=4*s;
		System.out.println("squre area is=" +area);
		System.out.println("squre perimeter is=" +perimeter);
	}
}